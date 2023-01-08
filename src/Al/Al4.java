package Al;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Al4 {
    public static void main(String[] args) {
        Al4 a1 = new Al4();

        String solution = a1.solution(5, 24);
        System.out.println(solution);

    }
    public String solution(int a, int b) {
        LocalDate startDate = LocalDate.of(2016,a,b);
        DayOfWeek dayOfWeek = startDate.getDayOfWeek();
        return (dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US)).toUpperCase();
    }

}
