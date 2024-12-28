package Base.Lec11_Methods;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(add(10, 20, 30));

    }
    static int add(int a, int b) {
        System.out.println("2 operand *add* method entered using method overloading concept");
        return a+b;
    }

    static int add(int a, int b, int c) {
        System.out.println("3 operand *add* method entered using method overloading concept");
        return a+b+c;
    }
}