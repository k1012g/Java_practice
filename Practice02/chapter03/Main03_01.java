import java.util.ArrayList;

public class Main03_01 {
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<>();
		points.add(10);
		points.add(80);
		points.add(75);

		for (int i : points) {
			System.out.println(i);
		}

		// for (int i = 0; i < points.size(); i++) {
		// 	System.out.println(points.get(i));
		// }
	}
}