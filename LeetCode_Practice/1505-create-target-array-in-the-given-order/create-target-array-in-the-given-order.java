class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;

        ArrayList<Integer> tar = new ArrayList<>();

        for(int i=0; i<n; i++) {
            tar.add(index[i], nums[i]);
        }
        
        int[] target = new int[n];
        for(int i=0; i<n; i++) {
            target[i] = tar.get(i);
        }
        
        return target;
    }
}