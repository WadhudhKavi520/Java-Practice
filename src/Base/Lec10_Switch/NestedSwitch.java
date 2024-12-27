package Base.Lec10_Switch;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter employee id: ");
        int empID = s.nextInt();

        switch(empID){
            case 1 -> System.out.println("Wadhudh Kavi");
            case 2 -> System.out.println("Vakeesh");
            case 3-> {
                System.out.println("Enter department: ");
                String dept = s.next();
                switch(dept){
                    case "IT"->System.out.println("Velmurugan");
                    case "ECE"-> System.out.println("Sowbarn");
                    default -> System.out.println("Invalid details");
                }
            }
            default-> System.out.println("Invalid details");
        }
    }
}
