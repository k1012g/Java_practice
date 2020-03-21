public class Main01_01 {
	public static void main(String[] args) {
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";

		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);

		if (s2.equals(s3)) {
			System.out.println("s2 = s3");
		}

		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2 = s3 (ケースを区別しない)");
		}

		System.out.println("s1の長さは" + s1.length() + "文字です。");

		if (!(s1.isEmpty())) {
			System.out.println("s1は空ではありません。");
		}
	}
}