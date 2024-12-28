package Base.Lec11_Methods;
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter any number to check is it is a prime number: ");
        int n = s.nextInt();

        if(isPrime(n)) {
            System.out.println(n + " is a prime number.");
        }

        else {
            System.out.println(n + " is not a prime number.");
        }
    }
    static boolean isPrime(int n)
    {
        if(n<=1) {
            return false;
        }
        int i = 2;
        while(i*i <= n) {
            if(n%i==0) {
                return false;
            }
            i++;
        }
        return true;
    }
}