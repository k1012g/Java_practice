public class Practice_03_01 {
	public static void main(String[] args){
		int isHungry = 1;
		String food = "餃子";

		System.out.println("こんにちは");

		System.out.println(isHungry == 0 ? "お腹がいっぱいです" : "腹ペコです");

		if (isHungry == 1) {
			System.out.println(food + "をいただきます");
		}

		System.out.println("ご馳走様でした。");
	}
}