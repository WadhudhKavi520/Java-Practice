class Solution {
    public int[] productExceptSelf(int[] nums) {      
        int[] prefixProduct = new int[nums.length];
        prefixProduct[0] = nums[0];
        for(int i=1; i<nums.length; i++) {
            prefixProduct[i] = prefixProduct[i-1] * nums[i];
        }

        int[] postfixProduct = new int[nums.length];
        postfixProduct[postfixProduct.length - 1] = nums[nums.length - 1];
        for(int i=nums.length-2; i>=0; i--) {
            postfixProduct[i] = postfixProduct[i+1] * nums[i];
        }

        int[] product = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            if(i==0) {
                product[i] = postfixProduct[i+1];
            }
            else if(i==nums.length-1) {
                product[i] = prefixProduct[i-1];
            }
            else {
                product[i] = prefixProduct[i-1]*postfixProduct[i+1];
            }
            
        }
        return product;
    }
}