package Base.Lec13_Linear_Search;
import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = s.nextLine();

        System.out.println("Enter the target element to be searched in the string: ");
        char target = s.next().trim().charAt(0);

        if(search(str, target)) {
            System.out.println("Target found");
        }
        else {
            System.out.println("Target not found");
        }
    }
    static boolean search(String str, char target) {
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)==target) {
                return true;
            }
        }
        return false;
    }
}