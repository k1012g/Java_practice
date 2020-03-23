import java.util.*;


public class Hero {
	private String name;

	// コンストラクタ
	public Hero(String name) {
		this.name = name;
	}

	// nameのgetter
	public String getName() {
		return this.name;
	}

	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");

		Map<Hero, Integer> heroes = new HashMap<>();
		heroes.put(h1, 3);
		heroes.put(h2, 7);

		for (Hero key : heroes.keySet()) {
			int value = heroes.get(key);
			System.out.println(key.getName() + "が倒した数 = " + value + "人");
		}
	}
}