package While文;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int password = 1234;
		int input;

		System.out.println("4桁の暗証番号を入力してください。");

		do {
			System.out.print("暗証番号：");
			input = scan.nextInt();
		}while(password != input);

		System.out.println("認証しました。");
	}

}
