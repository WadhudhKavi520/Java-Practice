class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstOccurrence = -1, lastOccurrence = -1;

        // Finding the first occurrence
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                firstOccurrence = mid; // Record the position
                end = mid - 1; // Continue searching on the left
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // If the target is not found at all
        if (firstOccurrence == -1) {
            return new int[]{-1, -1};
        }

        // Finding the last occurrence
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                lastOccurrence = mid; // Record the position
                start = mid + 1; // Continue searching on the right
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return new int[]{firstOccurrence, lastOccurrence};
    }
}
