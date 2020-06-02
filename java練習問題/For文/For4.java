package For文;

public class For4 {

	public static void main(String[] args) {
		String str = "あ0い1う2え3お4か5き6く7け8こ9";

		for(int i = 0; i < str.length(); i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.print(str.charAt(i));
		}
	}

}
