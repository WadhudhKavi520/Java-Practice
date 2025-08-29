package Base.Recursion;

public class NumberProgramRecursiveMethod {
    public static void main(String[] args) {
        int n = 1;
        print(n);
    }

    static void print(int n) {
        if(n==5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
