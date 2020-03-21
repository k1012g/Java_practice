public class Main01_02 {
	public static void main(String[] args) {
		String s1 = "Java and JavaScript";
		System.out.println("s1 : " + s1);

		String checkWord = "Java";

		if (s1.contains(checkWord)) {
			System.out.println("s1の文字列は" + checkWord + "という文字列を含んでいます。");
		}

		if (s1.endsWith(checkWord)) {
			System.out.println("s1の文字列は" + checkWord + "という文字列が末尾にあります。");
		}

		System.out.println("s1の文字列で最初に" + checkWord + "という文字列が登場する位置は" + (s1.indexOf(checkWord) + 1) + "番目です。");
		System.out.println("s1の文字列で最後に" + checkWord + "という文字列が登場する位置は" + (s1.lastIndexOf(checkWord) + 1) + "番目です。");
	}
}