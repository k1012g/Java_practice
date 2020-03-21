import java.util.Date;

public class Practice05 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		for (int i = 0; i < 100; i++) {
			System.out.printf("%d\n", i);
		}

		long end = System.currentTimeMillis();

		System.out.println("処理にかかった時間: " + (end - start) / 1000.0 + "s");
	}
}