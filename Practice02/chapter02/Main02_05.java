import java.time.*;
import java.time.format.*;

public class Main02_05 {
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2012, 1, 1);
		LocalDate d2 = LocalDate.of(2012, 1, 4);

		// 3日間を表すPeriodを2通りの方法で生成
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d1, d2);

		// d2のさらに3日後を計算
		LocalDate d3 = d2.plus(p2);

		System.out.println(d3);
	}
}