public class Main01_07 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			sb.append(i).append(",");
		}

		String s = sb.toString();
		System.out.println(s);

		System.out.println("カンマ削除");

		String[] a = s.split(",");

		for (String a2 : a) {
			System.out.print(a2);
		}

		System.out.println();
	}
}