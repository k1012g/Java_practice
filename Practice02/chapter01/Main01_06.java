public class Main01_06 {
	public static void main(String[] args) {
		String s = "abc,def:ghi";

		String splitWords = "[,:]";
		String[] words = s.split(splitWords);
		for (String w : words) {
			System.out.println(w + "->");
		}

		String changeWords = "[beh]";
		String w = s.replaceAll(changeWords, "X");
		System.out.println(w);
	}
}