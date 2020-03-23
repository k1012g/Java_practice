import java.util.Set;
import java.util.TreeSet;

public class Main03_04 {
	public static void main(String[] args) {
		Set<Character> words = new TreeSet<>();
		words.add('z');
		words.add('b');
		words.add('d');
		words.add('g');
		words.add('e');
		words.add('o');

		for (char c : words) {
			System.out.println(c + "->");
		}
	}
}