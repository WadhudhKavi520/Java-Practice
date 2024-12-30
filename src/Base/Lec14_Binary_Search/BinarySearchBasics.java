package Base.Lec14_Binary_Search;

public class BinarySearchBasics {
    public static void main(String[] args) {
        int[] arr = {-145,-48, -27, -5, 0, 10, 29, 34, 57, 68, 95, 180};
        int target = 29;

        if(binarySearch(arr, target)!=-1) {
            System.out.println(binarySearch(arr, target));
        }
        else {
            System.out.println("Element not found!!!");
        }
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start<=end) {
            int mid = start + (end-start)/2;

            if(arr[mid]<target) {
                start = mid+1;
            }
            else if(arr[mid]>target) {
                end = mid-1;
            }
            else if(arr[mid]==target) {
                return mid;
            }
        }
        return -1;
    }
}