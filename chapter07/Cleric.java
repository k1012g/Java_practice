public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 50;
	final int MAX_MP = 50;


	// 自己回復のメソッド
	public void SelfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた。");

		// MPを5消費
		this.mp -= 5;
		// HPを最大値まで回復
		this.hp = this.MAX_HP;

		System.out.println("HPを最大値まで回復。");
	}

	// MPを回復するメソッド
	public int Pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間天に祈った。");

		// 回復量の計算
		int recover = new Random().nextInt(3) + sec;

		// 実際の回復量(MPの最大値を超えないように)
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
		this.mp += recoverActual;

		System.out.println("MPが" + recoverActual + "回復した。");

		return recoverActual;
	}
}