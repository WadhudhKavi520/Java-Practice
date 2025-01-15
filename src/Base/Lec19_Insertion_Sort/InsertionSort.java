package Base.Lec19_Insertion_Sort;
import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {
    static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
    static void insertionSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j>0; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}