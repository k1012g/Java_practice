public class Practice01 {
	public static void main(String[] args) {
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";

		if (s2.equals(s3)) {
			System.out.println("s2 = s3");
		}else if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2 = s3(Ignore case)");
		}

		System.out.println("s1の長さは" + s1.length() + "です。");
	}
}