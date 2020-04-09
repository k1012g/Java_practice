public class Main04_02 {
	public static void main(String[] args) {
		String title = "4/9";
		String address = "test@mail.com";
		String text = "明日は何日でしょうか?";

		email(title, address, text);
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "にメールを送信しました。");
		System.out.println("件名 : " + title);
		System.out.println("本文 : " + text);
	}

	public static void email(String address, String text) {
		System.out.println(address + "にメールを送信しました。");
		System.out.println("件名 : 無題");
		System.out.println("本文 : " + text);
	}
}