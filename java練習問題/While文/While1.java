package While文;

public class While1 {

	public static void main(String[] args) {
		int earth = 40075;  //赤道一周の距離
		int speed = 80;      //時速を指定
		int day = 0;
		int gokei = 0;

		System.out.println("時速"+speed+"kmで進みます。");
		while(earth > 0) {
			day++;
			gokei += speed * 24;
			earth -= speed * 24;

			System.out.println(day + "日目：" + gokei + "km進みました。地球1周まで残り" + earth + "km");
		}
		System.out.println(day + "日目に地球を1周しました。");
	}

}
