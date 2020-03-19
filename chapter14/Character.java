public class Character {
	String name;


	// コンストラクタ
	public Character(String name) {
		this.name = name;
	}

	// toStringのオーバーライド
	public String toString() {
		return "Player Name : " + getName();
	}

	// mainメソッド
	public static void main(String[] args) {
		Character Test = new Character("Test1234");

		// validationを通れば表示
		if (isValidPlayerName(Test.name)) {
			System.out.println(Test);
		}else{
			System.out.println(Test + "(無効)");
		}
	}

	// getter(Name);
	public String getName() {
		return this.name;
	}

	// setter(Name);
	public void setName(String name) {
		this.name = name;
	}

	// Nameのvalidation
	public static boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
}