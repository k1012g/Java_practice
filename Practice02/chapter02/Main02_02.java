import java.time.*;

public class Main02_02 {
	public static void main(String[] args) {

		// Instantの生成
		// 現在時刻の取得
		Instant i1 = Instant.now();

		// Instantとlong値との相互変換
		Instant i2 = Instant.ofEpochMilli(31920291332L);
		long l = i2.toEpochMilli();

		// ZonedDatetimeの生成
		// 現在時刻の取得
		ZonedDateTime z1 = ZonedDateTime.now();

		// 東京時間2014年1月2日3時4分5秒6ナノ秒
		ZonedDateTime z2 = ZonedDateTime.of(2014, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));

		// InstantとZonedDateTimeの相互変換
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

		// ZonedDateTimeの利用
		System.out.println("東京 : " + z2.getYear() + z2.getMonthValue() + z2.getDayOfMonth());
		System.out.println("ロンドン : " + z3.getYear() + z3.getMonthValue() + z3.getDayOfMonth());

		if (z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間を指しています。");
		}

	}
}