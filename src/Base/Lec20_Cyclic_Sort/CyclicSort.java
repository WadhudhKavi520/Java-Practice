package Base.Lec20_Cyclic_Sort;
import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
    static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
    static void cyclicSort(int[] arr) {
        int index=0;
        while(index<arr.length) {
            if(index==arr[index]-1) {
                //go to the next index
                index++;
            }
            else {
                swap(arr, index, arr[index]-1);
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
        s.close();
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}