public class Practice_04_02{
	public static void main(String[] args){
		int[] numbers = {3, 4, 9};

		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();

		for (int answer: numbers) {
			if (answer == input) {
				System.out.println("当たり！");
			}
		}

		System.out.println("正解は3, 4, 9でした");
	}
}