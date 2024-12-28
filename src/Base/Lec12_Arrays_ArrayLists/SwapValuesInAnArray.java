package Base.Lec12_Arrays_ArrayLists;
import java.util.Scanner;
import java.util.Arrays;

public class SwapValuesInAnArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = {4, 2, 8, 4, 12};
        System.out.println("Before swapping: " + Arrays.toString(arr));

        System.out.println("Enter the two indices you want to swap: ");
        swap(arr, s.nextInt(), s.nextInt());

        System.out.println("After swapping: " + Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        if(index1>=0 && index2<arr.length) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
        else {
            System.out.println("Enter valid indices!!!");
            System.exit(0);
        }

    }
}
