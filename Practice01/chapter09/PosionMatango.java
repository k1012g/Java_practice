public class PoisonMatango extends Matango {
	int poisonCount = 5;

	public PoisonMatango() {
		super(suffix);
	}

	public void attack(Hero h) {
		super.(h);
		if (this.poisonCount > 0) {
			System.out.println("さらに毒の胞子をばらまいた。");

			int dmg = h.hp / 5;
			h.hp -= dmg;

			System.out.println(dmg + "ダメージ");

			this.poisonCount--;
		}
	}
}