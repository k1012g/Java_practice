public class Practice_04_01{
	public static void main(String[] args){
		int[] moneyList = {122902, 8302, 55100};


		// 普通のfor文
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}

		// 改行
		System.out.println("");


		// 拡張for文
		for (int value: moneyList) {
			System.out.println(value);
		}
	}
}