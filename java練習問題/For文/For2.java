package For文;

public class For2 {

	public static void main(String[] args) {
		int gusu = 0;
		int kisu = 0;

		for(int i = 1; i <= 10; i++) {
			gusu = i % 2 == 0 ? gusu += i : gusu ;
			kisu = i % 2 == 1 ? kisu += i : kisu;

			System.out.println("i=" + i + ", 偶数の合計：" + gusu + ", 奇数の合計：" + kisu);
		}

	}

}
