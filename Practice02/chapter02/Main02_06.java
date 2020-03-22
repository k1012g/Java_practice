import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Main02_06 {
	public static void main(String[] args) {

		// 現在の日時をDate型で取得
		Date now = new Date();
		Calendar c = Calendar.getInstance();

		// Date型の日時情報をCalendarにセット
		c.setTime(now);

		// Calenderから『日』の情報を取得
		int day = c.get(Calendar.DAY_OF_MONTH);

		// 取得した値に100を加算してセット
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);

		// Calendarの日時情報をDate型に変換
		Date future = c.getTime();

		// Dateインスタンスの内容を表示
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(f.format(future));
	}
}