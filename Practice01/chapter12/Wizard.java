public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public void heal(Hero h) {
		int basePoint = 10;
		int recoverPoint = (int)(basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recoverPoint);
		System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した。");
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = (hp < 0) ? 0 : hp;
	}

	public int getMp() {
		return this.mp;
	}

	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("MPは正の値を設定してください。");
		}
		this.mp = mp;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("魔法使いの名前は3文字以上にしてください。");
		}
		this.name = name;
	}

	public getWand() {
		return this.wand;
	}

	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("杖が設定されていません。");
		}
		this.wand = wand;
	}
}