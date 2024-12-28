package Base.Lec12_Arrays_ArrayLists;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<Integer>(2);
        ls.add(25);
        ls.add(56);
        ls.add(30);
        ls.add(51);
        ls.add(29);

        System.out.println(ls);
        System.out.println(ls.contains(30));

        ls.set(0,99);
        System.out.println(ls);

        ls.remove(2);
        System.out.println(ls);

        for(int i=0; i<ls.size(); i++) {
            System.out.println(ls.get(i));
        }
    }


}
