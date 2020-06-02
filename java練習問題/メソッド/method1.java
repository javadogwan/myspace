package メソッド;

import java.util.Scanner;

public class method1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int place;
		int time;

		System.out.println("世界の時刻を表示します。");
		System.out.println("香港の時刻を表示したい場合は、\"1\"を入力してください。");
		System.out.println("ベルリンの時刻を表示したい場合は、\"2\"を入力してください。");
		System.out.println("イスタンブールの時刻を表示したい場合は、\"3\"を入力してください。");

		//場所の入力
		System.out.print("表示したい場所の数字を入力してください：");
		place = scan.nextInt();
		while(place < 1 || place > 3) {
			System.out.print("数字が誤っています。1～3の数字を入力してください：");
			place = scan.nextInt();
		}
		//時間の入力
		System.out.print("日本時間を0～23で入力してください：");
		time = scan.nextInt();
		while(time > 23 || time < 0) {
			System.out.print("数字が誤っています。0～23の数字を入力してください：");
			time = scan.nextInt();
		}
		// 日本との時差を表示
		showJisaTime(place, time);
	}

	private static void showJisaTime(int place, int time) {
		int jisa = 0;
		String country = null;

		if(place == 1) {
			jisa = 1;
			country = "香港";
		}else if(place == 2) {
			jisa = 8;
			country = "ベルリン";
		}else if(place == 3) {
			jisa = 6;
			country = "イスタンブール";
		}

		System.out.println("日本と" + country + "の時差は" + jisa + "時間です。");
		System.out.print("日本の時刻は" + time + "時です。");
		time -= jisa;
		if(time > 0) {
			System.out.println(country + "の時刻は" + time + "時です。");
		}else {
			time = 24 + time;
			System.out.println(country + "の時刻は、前日の" + time + "時です。");
		}
	}

}
