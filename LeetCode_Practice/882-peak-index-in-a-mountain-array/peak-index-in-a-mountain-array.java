class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start<=end) {
            int mid = start + ( (end-start)/2 );
            //System.out.println(start + " " + end + " " + mid + " ");
            if(mid==0) {
                return mid+1;
            }
            else if(mid==arr.length-1) {
                return mid-1;
            }
            if( (arr[mid] > arr[mid-1]) && (arr[mid] > arr[mid+1]) ){//peak reached
                return mid;
            }
            else if( (arr[mid] > arr[mid-1]) && (arr[mid] < arr[mid+1]) ){//growing phase
                start = mid + 1;
            }
            else if( (arr[mid] > arr[mid+1]) && (arr[mid] < arr[mid-1]) ){//declining phase
                end = mid - 1;

            }
        }
        return -1;
    }
}