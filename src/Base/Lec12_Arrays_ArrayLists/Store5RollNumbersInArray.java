package Base.Lec12_Arrays_ArrayLists;
import java.util.Arrays;

public class Store5RollNumbersInArray {
    public static void main(String[] args) {
        int[] rno1 = {1,2,3,4,5};
        System.out.println("Method 1, directly initializing array values: " + Arrays.toString(rno1));

        int[]rno2 = new int[5]; //initializes an empty array of size = 5
        rno2[0] = 1;
        rno2[1] = 2;
        rno2[2] = 3;
        rno2[3] = 4;
        rno2[4] = 5;

        System.out.println("Method 2, initialize empty array with required size, then assign values: " + Arrays.toString(rno2));

    }

}
