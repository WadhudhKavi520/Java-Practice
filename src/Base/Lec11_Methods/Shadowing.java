package Base.Lec11_Methods;

public class Shadowing {
    static int x = 10; //this class variable gets shadowed by method variable in Line10.

    public static void main(String[] args) {
        System.out.println("X value before shadowing: " + x);

        int x = 100000;
        System.out.println("X value after shadowing: " + x);/*shadows the class variable that
                                                                is initialized at Line4.*/
        fun();
    }
    static void fun() {
        System.out.println("X value without shadowing: " + x);//prints the class varaible without shadowing.
    }
}