public class Main01_04 {
	public static void main(String[] args) {
		String s1 = "   Java Beans";
		System.out.println("s1 : " + s1);

		System.out.println("s1を小文字に変換                   : " + s1.toLowerCase());
		System.out.println("s1を大文字に変換                   : " + s1.toUpperCase());
		System.out.println("s1の前後の半角スペースを削除       : " + s1.trim());
		System.out.println("s1のJavaという文字列をPythonに変換 : " + s1.replace("Java", "Python"));
	}
}