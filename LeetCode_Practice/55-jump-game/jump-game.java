class Solution {
    public boolean canJump(int[] nums) {        
        int destiny = nums.length-1;
        int i = destiny-1;
        while(i>=0) {
            if(nums[i] >= (destiny-i) ) {
                destiny = i;
            }
            i--;
        }
        if(destiny==0) {
            return true;
        }
        return false;
    }
}