package Base.Lec12_Arrays_ArrayLists;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] arr = new int[3][3];//not mandatory to specify the number of columns.

        //taking input
        for(int row=0; row<arr.length; row++) {
            for(int col=0; col<arr[row].length; col++) {
                arr[row][col] = s.nextInt();
            }
        }

        //taking output
        for (int row=0; row<arr.length; row++) {
            for(int col=0; col<arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}
