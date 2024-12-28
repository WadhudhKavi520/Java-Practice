package Base.Lec11_Methods;
import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        findSum(a,b);
    }
    static void findSum(int a, int b)
    {
        System.out.println(a+b);
    }
}
