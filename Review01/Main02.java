public class Main02 {
	public static void main(String[] args) {
		int isHungry = 1;
		String food = "noodle";

		System.out.println("Hi.");
		if (isHungry == 0) {
			System.out.println("I had plenty.");
		}else {
			System.out.println("I am hungry.");
			System.out.println("I have " + food + ".");
		}

		System.out.println("Finished.");
	}
}