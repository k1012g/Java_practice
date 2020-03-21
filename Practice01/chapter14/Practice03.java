public class Practice03 {
	public static void main(String[] args) {
		String s1 = "Java programming";

		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));

		System.out.println("文字列s1の4 ~ 8文字目は" + s1.substring(3, 8));

		System.out.println("文字列s1を小文字に変換: " + s1.toLowerCase());

		System.out.println("文字列s1を大文字に変換: " + s1.toUpperCase());

		System.out.println("文字列s1のJavaをPythonに変更: " + s1.replace("Java", "Python"));
	}
}