package Base.Lec9;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int i = 0;
        System.out.println(i + " ");

        int j = 1;
        System.out.println(j + " ");

        int count = 2;

        while(count<n)
        {

            j = i + j;
            i = j - i;

            System.out.println(j + " "); count++;
        }
    }
}
