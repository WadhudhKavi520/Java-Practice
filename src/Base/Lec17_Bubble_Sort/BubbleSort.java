package Base.Lec17_Bubble_Sort;
import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            boolean swapped = false;
            for(int j=1; j<arr.length-i; j++) {
                if(arr[j] < arr[j-1]) {
                    //swap
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {//bubble sort algorithm terminates if no swapping occurs for any value of j,
                            //because it means the array has already been completely sorted.
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
