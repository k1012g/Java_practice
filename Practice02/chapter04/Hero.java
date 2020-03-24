public class Hero {
	private String name;
	private int hp, mp;

	public Hero(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public String toString() {
		return "勇者(名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")";
	}

	public static void main(String[] args) {
		Hero h1 = new Hero("勇者1", 100, 150);
		System.out.println(h1);
	}
}