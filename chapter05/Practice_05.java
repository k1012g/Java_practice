public class Practice_05 {

	public static void main(String[] args) {
		System.out.println("底辺10cm, 高さ5cmの三角形の面積は" + calcTriangleArea(10.0, 5.0) + "平方cmです。");
		System.out.println("半径5cmの円の面積は" + calcCircleArea(5.0) + "平方cmです。");
	}

	// 三角形の面積を返すメソッド
	public static double calcTriangleArea(double bottom, double height) {
		double triangleArea = bottom * height / 2;
		return triangleArea;
	}

	// 円の面積を返すメソッド
	public static double calcCircleArea(double radius) {
		double circleArea = radius * radius * 3.14;
		return circleArea;
	}
}