import java.util.ArrayList;
import java.util.Iterator;

public class Main03_02 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("湊");
		names.add("朝霞");
		names.add("菅原");

		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
	}
}