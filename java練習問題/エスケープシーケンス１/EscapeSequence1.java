package エスケープシーケンス;

public class EscapeSequence1 {

	public static void main(String[] args) {
	    int num1 = 0;
	    int num2 = 0;
		int result;

		num1 = 300;
		System.out.println("A君は" + num1 + "円持っています。");

		num2 = 400;
		System.out.println("B君は" + num2 + "円持っています。");

		result = num1 + num2;
		System.out.println("２人の所持金の\n合計は\"" + result + "\"円です。");
	}

}
