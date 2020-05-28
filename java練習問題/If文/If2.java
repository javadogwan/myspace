package if文;

import java.util.Scanner;

public class If2 {

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

		// 香港
		if(place == 1) {
			System.out.println("日本と香港の時差は1時間です。");
			System.out.print("日本の時刻は" + time + "時です。");
			time -= 1;
			if(time > 0) {
				System.out.println("香港の時刻は" + time + "時です。");
			}else {
				time = 24 + time;
				System.out.println("香港の時刻は、前日の" + time + "時です。");
			}
		// ベルリン
		}else if(place == 2) {
			System.out.println("日本とベルリンの時差は8時間です。");
			System.out.print("日本の時刻は" + time + "時です。");
			time -= 8;
			if(time > 0) {
				System.out.println("ベルリンの時刻は" + time + "時です。");
			}else {
				time = 24 + time;
				System.out.println("ベルリンの時刻は、前日の" + time + "時です。");
			}
		// イスタンブール
		}else if(place == 3){
			System.out.println("日本とイスタンブールの時差は6時間です。");
			System.out.print("日本の時刻は" + time + "時です。");
			time -= 6;
			if(time > 0) {
				System.out.println("イスタンブールの時刻は" + time + "時です。");
			}else {
				time = 24 + time;
				System.out.println("イスタンブールの時刻は、前日の" + time + "時です。");
			}

		}
	}

}
