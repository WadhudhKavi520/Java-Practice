package Base.Lec13_Linear_Search;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {5,78,1,36,22,19};

        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr) {
        int min = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        return min;
    }
}