package Base.Lec10_Switch;
import java.util.Scanner;

public class WeekdayWeekend {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dayNo = s.nextInt();

        switch(dayNo)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
            break;
        }
    }
}
