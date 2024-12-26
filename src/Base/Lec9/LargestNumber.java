package Base.Lec9;
import java.util.Scanner;

public class LargestNumber {

    static int findLargest(int a, int b, int c)
    {
        int max = a;

        if(b>a && b>c)
        {
            max = b;
        }
        else if(c>a && c>b)
        {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        b = sc.nextInt();

        System.out.println("Enter Third Number: ");
        c = sc.nextInt();

        System.out.println(findLargest(a, b, c));
    }
}
