package Base;
import java.util.Scanner;

class Main {
    void Greet()
    {
        System.out.println("Hello world!");
    }

    public static void main(String args[])
    {
        Main obj = new Main();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(a);



        obj.Greet();
    }
}