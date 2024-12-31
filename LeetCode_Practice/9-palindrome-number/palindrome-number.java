class Solution {
    public boolean isPalindrome(int x) {
        int original = x;        
        //String revNumber = "";//revNumber stands for reversed number.
        
        // if(x==0) {
        //     return true;
        // }
        if(x<0) {
            return false;
        }

        int revNumber = x%10;
        x = x/10;
        
        while(x>0) {
            //revNumber = revNumber + Integer.toString(x%10);
            revNumber = revNumber*10 + (x%10);
            x = x/10;            
        }        

        System.out.println(revNumber);
        //return revNumber.equals(Integer.toString(original));
        return revNumber==original;
    }
}