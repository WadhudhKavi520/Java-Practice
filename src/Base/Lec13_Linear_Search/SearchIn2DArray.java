package Base.Lec13_Linear_Search;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr =
                {
                        {45, 48, 151, 86},
                        {14, 215, 125},
                        {145, 2458, 15, 25, 14},
                        {468, 268, 2451, 1455}
                };
        System.out.println("Enter target element to be searched: ");
        int target = s.nextInt();

        if(search(arr, target)) {
            System.out.println("Element found!!!");
        }
        else {
            System.out.println("Element not found!!!");
        }
    }
    static boolean search(int[][] arr, int target) {
        for(int row=0; row<arr.length; row++) {
            for(int col=0; col<arr[row].length; col++) {
                if(arr[row][col]==target) {
                    return true;
                }
            }
        }
        return false;
    }
}