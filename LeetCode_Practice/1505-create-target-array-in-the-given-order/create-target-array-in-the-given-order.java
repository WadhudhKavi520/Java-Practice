class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;

        ArrayList<Integer> target = new ArrayList<>();

        for(int i=0; i<n; i++) {
            target.add(index[i], nums[i]);
        }
        
        int[] tar = new int[n];
        for(int i=0; i<n; i++) {
            tar[i] = target.get(i);
        }
        
        return tar;
    }
}