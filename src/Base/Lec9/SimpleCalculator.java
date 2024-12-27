package Base.Lec9;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Calculator!!!");
        while(true)
        {
            System.out.println("Enter operation: ");
            char ch = s.next().trim().charAt(0);

            if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%')
            {
                if(ch=='+')
                {
                    System.out.println("Enter the 2 numbers: ");
                    int a = s.nextInt();
                    int b = s.nextInt();
                    System.out.println(a+b);
                    continue;
                }
                if(ch=='-')
                {
                    System.out.println("Enter the 2 numbers: ");
                    int a = s.nextInt();
                    int b = s.nextInt();
                    System.out.println(a-b);
                    continue;
                }
                if(ch=='*')
                {
                    System.out.println("Enter the 2 numbers: ");
                    int a = s.nextInt();
                    int b = s.nextInt();
                    System.out.println(a*b);
                    continue;
                }
                if(ch=='/')
                {
                    System.out.println("Enter the 2 numbers: ");
                    int a = s.nextInt();
                    int b = s.nextInt();
                    if(b!=0) {
                        System.out.println(a/b);
                    }
                    else {
                        System.out.println("Cannot divide by zero");
                    }
                    continue;
                }
                if(ch=='%')
                {
                    System.out.println("Enter the 2 numbers: ");
                    int a = s.nextInt();
                    int b = s.nextInt();
                    System.out.println(a%b);
                    continue;
                }

            }
            else if(ch=='X' || ch=='x')
            {
                System.out.println("Calculator closed!");
                break;
            }
            else{
                System.out.println("Invalid operation da venna!");
                continue;
            }
        }
    }
}
