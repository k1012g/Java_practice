import java.time.*;
import java.time.format.*;

public class Main02_04 {
	public static void main(String[] args) {

		// 文字列からLocalDateを生成
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate d = LocalDate.parse("2011/08/21", f);

		// 1000日後を計算
		int someDays = 1000;
		d = d.plusDays(someDays);
		String str = d.format(f);
		System.out.println(someDays + "日後は" + str);

		// 現在日付との比較
		LocalDate now = LocalDate.now();
		if (now.isAfter(d)) {
			System.out.println("nowはdより新しい");
		}else {
			System.out.println("dはnowより新しい");
		}
	}
}