package Base.Lec15_Binary_Search_Questions;
import java.util.Scanner;

public class CeilingOfNumber {
    static void binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start<=end) {
            int mid = start + ( (end-start) ) / 2;
            if(nums[mid]==target) {
                System.out.println("Element found at index number " + mid);
                return;
            }
            else if(nums[mid] > target) {
                end = mid-1;
            }
            else if(nums[mid] < target) {
                start = mid+1;
            }
        }
        System.out.println("Element not found, element has to be inserted at index number " + start);
    }
    public static void main(String[] args) {
        //finding the smallest element that is greater than or equal to the target element in the sorted array.
        Scanner s = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = s.nextInt();

        System.out.println("Enter array elements: ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println("Enter target element: ");
        int target = s.nextInt();

        binarySearch(nums, target);
    }
}
