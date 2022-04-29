import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Days {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime threeYearsLater = today.plusYears(3);

		DayOfWeek week = threeYearsLater.getDayOfWeek();

		System.out.println("3年後の今日は" + week + "です");

	}

}
