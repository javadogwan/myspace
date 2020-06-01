package 配列;

import java.util.Random;

public class Array1 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] gacha = new int[10];

		for(int i = 0; i < 10; i++) {
			gacha[i] = rand.nextInt(10) + 1;
		}

		System.out.println("10連ガチャの結果は、");
		for(int result : gacha) {
			if(result == 7) {
				System.out.println("ラッキー7‼当たりです。");
				break;
			}else {
				System.out.println(result + "です。ハズレです。");
			}
		}
	}

}
