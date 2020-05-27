package エスケープシーケンス;

public class EscapeSequence2 {

	public static void main(String[] args) {
	    int num = 0;
		int result = 0;

		num = 300;
		result = result + num;
		System.out.println("A君は" + num + "円持っています。");

		num = 400;
		result = result + num;
		System.out.println("B君は" + num + "円持っています。");

		System.out.println("２人の所持金の\n合計は\"" + result + "\"円です。");
	}

}
