package Base.Lec12_Arrays_ArrayLists;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();

        //initialisation
        for(int i=0; i<3; i++) {
            ls.add(new ArrayList<>());
        }

        //add elements
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                ls.get(i).add(s.nextInt());
            }
        }

        //print arraylist
        System.out.println(ls);

    }
}
