package Switch文;

import java.util.Random;

public class Switch1 {

	public static void main(String[] args) {
		Random rand = new Random();
		int dice = rand.nextInt(6) + 1;

		switch(dice) {
		case 1:
			System.out.println("サイコロの目は" + dice + "が出ました。大吉です。");
			break;
		case 6:
			System.out.println("サイコロの目は" + dice + "が出ました。大凶です。");
			break;
		default:
			System.out.println("サイコロの目は" + dice + "が出ました。小吉です。");
		}
	}

}
