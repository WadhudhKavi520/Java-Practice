package Base.Lec10_Switch;
import java.util.Scanner;

public class FruitSwitchCaseProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String fruit = s.next();

        switch(fruit)
        {
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("Keeps doctors away");
                break;
            case "Orange":
                System.out.println("Is orange in color");
                break;
            case "Lemon":
                System.out.println("Sour taste");
                break;
            case "Watermelon":
                System.out.println("Big Fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }
    }
}
