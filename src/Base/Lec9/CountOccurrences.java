package Base.Lec9;
import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int n = s.nextInt();

        System.out.println("Enter the digit that has to be counted: ");
        int x = s.nextInt();

        int rem;
        int count = 0;

        while(n>0)
        {
            rem = n%10;
            n = n/10;

            if(rem==x)
            {
                count++;
            }
        }
        System.out.println("The number " + x + " occurs " + count + " times.");
    }
}
