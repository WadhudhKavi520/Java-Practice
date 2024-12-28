package Base.Lec11_Methods;
import java.util.Arrays;

public class ChangeArrayValuePassByReference {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        change(arr);
        System.out.println(Arrays.toString(arr));/*
        arrays will be passed as pass by reference, which means that a new object
        will not be created in the method that received array as a parameter, but instead
        all required operations will be performed on the original array object that was created.
        */
    }
    static void change(int[] nums) {
        nums[0] = 99;
    }
}
