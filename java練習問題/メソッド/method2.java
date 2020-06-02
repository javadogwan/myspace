package メソッド;

import java.util.Scanner;

public class method2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int deliveryFee;
		String from = "東京都";
		String to;  // 任意の都道府県を指定
		int size; // 任意のサイズを指定

		System.out.print("お届け先を入力してください：" );
		to = scan.nextLine();

		System.out.print("お荷物のサイズを入力してください：" );
		size = scan.nextInt();

		deliveryFee = getDeliveryFee(from, to, size);
		if(deliveryFee == 0) {
			System.out.println("入力内容に誤りがあります。");
		}else {
			System.out.println("郵送料：" + deliveryFee + "円");
		}
	}
	// 料金を取得する
	private static int getDeliveryFee(String from, String to, int size) {
		// 同都道府県内に郵送
		if(from.equals(to)) {
			return getPricePatternNear(size);
		}
		// 送り先の地域番号を取得する
		int AreaNum = getAreaNum(to);
		// 郵送料を取得する
		int deliveryFee = serchPriceList(AreaNum, size);

		return deliveryFee;
	}
	// 地域番号を取得する
	private static int getAreaNum(String to) {
		String todofuken[][]  = {
			{  //area:0
				"青森県","岩手県","宮城県","秋田県","秋田県","山形県","福島県",  //東北
				"茨城県","栃木県","群馬県","埼玉県","東京都","千葉県","神奈川県","山梨県",  //関東
				"新潟県","長野県", //信越
				"富山県","石川県","福井県", //北陸
				"静岡県","愛知県","岐阜県","三重県" //東海
		     },
			{  //area:1
				"奈良県","滋賀県","京都府","大阪府","兵庫県","和歌山県" //近畿
			},
			{   //area:2
				"岡山県","広島県","鳥取県","島根県","山口県",  //中国
				"徳島県","香川県","愛媛県","高知県"  //四国
			},
			{   //area:3
				"福岡県","佐賀県","長崎県","熊本県","大分県","宮崎県","鹿児島県"  //九州
			},
			{   //area:4
				"北海道"
			},
			{   //area:5
				"沖縄県"
			}
		};
		for(int i = 0; i < todofuken.length; i++) {
			for(int j = 0; j < todofuken[i].length; j++) {
				if(to.equals(todofuken[i][j])) {
					return i;
				}
			}
		}
		return 9;
	}
	// 料金表から料金を探す
	private static int serchPriceList(int areaNum, int size) {
		switch (areaNum) {
			case 0: return getPricePatternSameArea(size);
			case 1: return getPricePatternA(size);
			case 2: return getPricePatternB(size);
			case 3: return getPricePatternC(size);
			case 4: return getPricePatternC(size);
			case 5: return getPricePatternD(size);
			default: return 0;
		}
	}
	// 同都道府県内に郵送
	private static int getPricePatternNear(int size) {
		switch(size) {
			case 60:  return 810;
			case 80:  return 1030;
			case 100: return 1280;
			case 120: return 1530;
			case 140: return 1780;
			case 160: return 2010;
			case 170: return 2340;
			default: return 0;
		}
	}
	// 同エリア内に郵送
	private static int getPricePatternSameArea(int size) {
		switch(size) {
			case 60:  return 870;
			case 80:  return 1100;
			case 100: return 1330;
			case 120: return 1590;
			case 140: return 1830;
			case 160: return 2060;
			case 170: return 2410;
			default: return 0;
		}
	}
	// 料金表 パターンA
	private static int getPricePatternA(int size) {
		switch(size) {
			case 60:  return 970;
			case 80:  return 1200;
			case 100: return 1440;
			case 120: return 1690;
			case 140: return 1950;
			case 160: return 2160;
			case 170: return 2530;
			default: return 0;
		}
	}
	// 料金表 パターンB
	private static int getPricePatternB(int size) {
		switch(size) {
			case 60:  return 1100;
			case 80:  return 1310;
			case 100: return 1560;
			case 120: return 1800;
			case 140: return 2060;
			case 160: return 2270;
			case 170: return 2640;
			default: return 0;
		}
	}
	// 料金表 パターンC
	private static int getPricePatternC(int size) {
		switch(size) {
			case 60:  return 1300;
			case 80:  return 1530;
			case 100: return 1760;
			case 120: return 2020;
			case 140: return 2260;
			case 160: return 2490;
			case 170: return 2850;
			default: return 0;
		}
	}
	// 料金表 パターンD
	private static int getPricePatternD(int size) {
		switch(size) {
			case 60:  return 1350;
			case 80:  return 1630;
			case 100: return 1900;
			case 120: return 2170;
			case 140: return 2440;
			case 160: return 2660;
			case 170: return 3060;
			default: return 0;
		}
	}

}
