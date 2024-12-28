package Base.Lec11_Methods;
import java.util.Scanner;

public class Check3DigitArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        if( n<100 || n>999 ) {
            System.out.println("Enter 3 digit number!!!");
            return;
        }
        if(checkArmstrong(n)) {
            System.out.println(n + " is an Armstrong number");
        }
        else {
            System.out.println(n + " is not an Armstrong number");
        }
    }
    static boolean checkArmstrong(int n) {
        int original = n;
        int rem = 0;
        int sum = 0;

        while(n>0) {
            rem = n%10;
            sum = sum + rem*rem*rem;
            n= n/10;
        }
        return sum == original;
    }
}