package Base.Lec9;
import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number to be reversed: ");
        int n = s.nextInt();

        int rem = 0;
        int x = 0;

        while (n > 0) {
            rem = n % 10;       // Extract the last digit
            x = x * 10 + rem;   // Append the digit to x in the reversed order
            n = n / 10;         // Remove the last digit from the original number
        }

        System.out.println(x);
    }
}
