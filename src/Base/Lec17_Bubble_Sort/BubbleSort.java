package Base.Lec17_Bubble_Sort;
import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=1; j<arr.length-i; j++) {
                if(arr[j] < arr[j-1]) {
                    //swap
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
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
