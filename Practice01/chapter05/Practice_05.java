public class Practice_05 {

	public static void main(String[] args) {
		System.out.println("三角形の面積: " + calcTriangleArea(10.0, 5.0) + "平方cm");
		System.out.println("円の面積: " + calcCircleArea(5.0) + "平方cm");
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