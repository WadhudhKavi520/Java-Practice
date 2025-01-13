package Base.Lec15_Binary_Search_Questions;

import java.util.Arrays;

public class FirstAndLastOccurenceOfNumberInArray {
    public int[] searchRange(int[] nums, int target) {
        int firstOccurence = -1, lastOccurence = -1;

        // Finding the first occurrence
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                firstOccurence = mid; // Record the position
                end = mid - 1; // Keep searching on the left
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // If target not found, return [-1, -1]
        if (firstOccurence == -1) {
            return new int[]{-1, -1};
        }

        // Finding the last occurrence
        start = 0; // Reset start
        end = nums.length - 1; // Reset end
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                lastOccurence = mid; // Record the position
                start = mid + 1; // Keep searching on the right
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return new int[]{firstOccurence, lastOccurence};
    }

    // Add the main() method
    public static void main(String[] args) {
        FirstAndLastOccurenceOfNumberInArray obj = new FirstAndLastOccurenceOfNumberInArray();

        // Example input
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        // Call the method
        int[] result = obj.searchRange(nums, target);

        // Print the result
        System.out.println("First and Last Occurrence of " + target + ": " + Arrays.toString(result));
    }
}