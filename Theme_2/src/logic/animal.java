package logic;

public class animal {
	private String name;
	private double length;
	private int speed;

// コンストラクタを作成
	public animal(String name, double length, int speed) {

		// nullチェック
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("動物名がnull又は空です。処理を中断します。");
		}
		if (length <= 0) {
			throw new IllegalArgumentException("正の値である必要があります。");
		}
		if (speed < 0) {
			throw new IllegalArgumentException("速度は０以上である必要があります。");
		}
		this.name = name;
		this.length = length;
		this.speed = speed;
	}

// Getterを作成
	public String getName() {
		return this.name;
	}

	public double getLength() {
		return this.length;
	}

	public int getSpeed() {
		return this.speed;
	}

// Setterを作成
	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("動物名がnull又は空です。処理を中断します。");
		}
		this.name = name;
	}

	public void setLength(double length) {
		if (length <= 0) {
			throw new IllegalArgumentException("正の値である必要があります。");
		}
		this.length = length;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			throw new IllegalArgumentException("速度は０以上である必要があります。");
		}
		this.speed = speed;
	}
	
	// 動物の情報を表示するメソッド
	public void displayInfo() {
		System.out.println("動物名:"+this.name);
		System.out.println();
		System.out.println("体長:"+this.length+"m");
		System.out.println();
		System.out.println("速度:"+this.speed+"km/h");
	}
}
