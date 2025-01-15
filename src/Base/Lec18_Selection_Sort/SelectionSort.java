package Base.Lec18_Selection_Sort;
import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort {
    static int findMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start; // assigns the start index as the index that holds the maximum value
        for(int i=start+1; i<=end; i++) { //for loop iterates from start+1 to end index to look for bigger values
            if(arr[i] > arr[maxIndex]) {//if any index of array has greater value than existing maxIndex of array, the 'if' block executes
                maxIndex = i; //if 'if' condition is satisfied, maxIndex is reassigned to new index that holds greater value than existing maxIndex
            }
        }
        return maxIndex;//maxIndex is returned
    }
    static void swap(int[] arr, int sortIndex, int maxIndex) {
        int temp = arr[sortIndex];
        arr[sortIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
    static void selectionSort(int[] arr) {
        //selection sort logic comes here
        int sortIndex = arr.length; //sortIndex is the index that has to be swapped with maxIndex, sortIndex is initiated at out of bounds
        for(int i=0; i<arr.length-1; i++) {
            sortIndex--;//sortIndex is decremented so that selectionSort happens only on the unsorted part of the array.
            int maxIndex = findMaxIndex(arr, 0, sortIndex);
            swap(arr, sortIndex, maxIndex);//arr[sortIndex] is swapped with arr[maxIndex]
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements in the array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements, each separated by a space");
        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}