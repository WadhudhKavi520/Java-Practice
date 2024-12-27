package Base.Lec10_Switch;
import java.util.Scanner;

public class FruitEnhancedSwitchCaseProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String fruit = s.next();
        switch(fruit)
        {
            case "Mango"->System.out.println("King of Fruits");
            case "Apple"->System.out.println("Keeps doctors away");
            case "Orange"->System.out.println("Is orange in color");
            case "Lemon"->System.out.println("Sour taste");
            case "Watermelon"->System.out.println("Big Fruit");
            default->System.out.println("Please enter a valid fruit");
        }
    }
}