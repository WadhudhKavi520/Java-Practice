class Solution {
    public boolean isPalindrome(int x) {
        int original = x;        
        String revNumber = "";//revNumber stands for reversed number.
        boolean isNegative = false;
        if(x==0) {
            return true;
        }
        if(x<0) {
            isNegative = true;
            x = x*-1;
        }
        while(x>0) {
            revNumber = revNumber + Integer.toString(x%10);
            x = x/10;            
        }        
        if(isNegative) {
            revNumber = revNumber + '-';
        }
        System.out.println(revNumber);
        return revNumber.equals(Integer.toString(original));
    }
}