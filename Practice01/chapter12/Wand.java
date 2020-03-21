public class Wand {
	private String name;
	private double power;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("杖の名前は3文字以上にしてください。");
		}
		this.name = name;
	}

	public double getPower() {
		return this.power;
	}

	public void setPower(double power) {
		if (power > 100 || power < 0.5) {
			throw new IllegalArgumentException("杖には0.5以上100以下で魔力を設定してください。");
		}
		this.power = power;
	}
}