package practice.code;

public class ConstractPractice {

	private int firstTax;
	private int currentTax = 5;
	private int lastTax;

	// デフォルトコンストラクタの宣言
	public ConstractPractice() {
		firstTax = 3;
		lastTax = firstTax;
	}

	// 引数有のコンストラクタの宣言
	public ConstractPractice(int currentTax) {
		lastTax = currentTax + 3;
	}

	public int useConstract() {
		System.out.println("初期の消費税" + lastTax);
		System.out.println("増税後" + lastTax);
		return lastTax;
	}
}
