package Base.Lec10_Switch;
import java.util.Scanner;

public class WeekdayWeekendEnhancedSwitchCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dayNo = s.nextInt();
        switch(dayNo)
        {
            case 1,2,3,4,5->System.out.println("Weekdays");
            case 6,7->System.out.println("Weekend");
        }
    }
}