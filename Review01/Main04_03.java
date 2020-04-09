public class Main04_03 {
	public static void main(String[] args) {
		double bottom = 10.0;
		double height = 5.0;
		double radius = 5.0;

		System.out.println("底辺10.0cm, 高さ5.0cmの三角形の面積" + calcTriangleArea(bottom, height) + "㎠");
		System.out.println("半径5.0mの円の面積" + calcCircleArea(radius) + "㎠");
	}

	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}

	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}
}