package Base.Lec11_Methods;

public class PrintAll3DigitArmstrongNumbers {
    public static void main(String[] args) {
        for(int i=100; i<=999; i++) {
            if(isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean isArmstrong(int n) {
        int original = n;
        int rem = 0;
        int sum = 0;

        while(n>0) {
            rem = n%10;
            sum = sum + (rem*rem*rem);
            n = n/10;
        }
        return original==sum;
    }
}