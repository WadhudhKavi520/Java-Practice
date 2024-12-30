package Base.Lec12_Arrays_ArrayLists;

public class MaximumValueOfAnArray {
    public static void main(String[] args) {
        int[] arr = {1,45,81,25,96,23,11};
        System.out.println(max(arr));
    }
    static int max(int[] arr) {
        int maxi = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i]>maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }
}
