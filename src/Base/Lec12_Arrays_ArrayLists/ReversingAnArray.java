package Base.Lec12_Arrays_ArrayLists;

import java.util.Arrays;

public class ReversingAnArray {
    public static void main(String[] args) {
        int[] arr = {1,45,81,25,96,23,11};
        System.out.println("Array before reversing: " + Arrays.toString(arr));
        System.out.println();
        reverseArray(arr);
        System.out.println("Array after reversing: " + Arrays.toString(arr));
    }
    static void reverseArray(int[] arr) {
        int l = 0;
        int r = arr.length - 1;

        while(l<r) {
            //swap arr[l] and arr[r]
            SwapValuesInAnArray.swap(arr, l, r);
            l++;
            r--;
        }
    }
}