package Base.Lec12_Arrays_ArrayLists;
import java.util.Arrays;

public class ArrayPassingInFunction {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Before manipulating using fun method: " + Arrays.toString(arr));
        fun(arr/*a copy of the reference to arr object is being passed to the fun method*/);

        System.out.println("After manipulating using fun method: " + Arrays.toString(arr));
    }
    static void fun(int[] brr) {
        brr[0]=99;
    }
}