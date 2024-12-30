package Base.Lec13_Linear_Search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {5,78,1,36,22,19};
        int target = 1;
        int start = 1;
        int end = 5;

        search(arr, target, start, end);
    }
    static boolean search(int[] arr, int target, int start, int end) {
        for(int i=start; i<=end; i++) {
            if(arr[i]==target) {
                System.out.println("Found at index number: " + i);
                return true;
            }
        }
        return false;
    }
}
