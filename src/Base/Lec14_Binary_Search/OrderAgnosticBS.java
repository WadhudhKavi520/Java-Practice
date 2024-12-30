package Base.Lec14_Binary_Search;
import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the target element to be searched: ");
        int target = s.nextInt();

        int searchResult = binarySearch(arr, target);

        if(searchResult != -1) {
            System.out.println("Element found at index number: " + searchResult);
        }
        else {
            System.out.println("Element not found!!!");
        }
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = findSortingOrder(arr);

        while(start<=end) {
            int mid = start + (end-start)/2;

            if(arr[mid]==target) {
                return mid;
            }

            if(isAsc) {
                if(arr[mid]<target) {
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
            else {
                if(arr[mid]>target) {
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }

        }
        return -1;
    }

    static boolean findSortingOrder(int[] arr) {
        return arr[0] < arr[arr.length - 1];//finds ascending or descending order
    }
}