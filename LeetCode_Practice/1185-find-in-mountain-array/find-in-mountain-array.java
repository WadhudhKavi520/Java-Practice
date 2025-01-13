/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int len = mountainArr.length();
        //find peak
        int start=0;
        int end = len-1;
        int peak=0;

        //finding peak
        while(start<=end) {
            int mid = start + ((end-start)/2);
            int middle = mountainArr.get(mid);
            
            if(mid==0) {
                peak = 1;
                break;
            }
            else if(mid==len - 1) {
                peak = mid - 1;
                break;
            }
            int middleBefore = mountainArr.get(mid-1);
            int middleAfter = mountainArr.get(mid+1);
            if(middle>middleBefore && 
            middle>middleAfter) {
                peak = mid;
                break;
            }
            else if(middle>middleBefore)/*ascending phase */{
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        if(mountainArr.get(peak)==target) {
            return peak;
        }

        //perform ascending order sorted binary search from 0 to peak - 1
        start = 0;
        end = peak-1;
        while(start<=end) {
            int mid = start + ((end-start)/2);
            int middle = mountainArr.get(mid);
            
            if(middle==target) {
                return mid;
            }
            else if(middle > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        //perform descending order sorted binary search from peak+1 to end
        start = peak+1;
        end = len-1;
        while(start<=end) {
            int mid = start + ((end-start)/2);
            int middle = mountainArr.get(mid);

            if(middle==target) {
                return mid;
            }
            else if(middle > target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        //element not found
        return -1;

    }
}