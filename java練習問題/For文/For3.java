package For文;

public class For3 {

	public static void main(String[] args) {

		for(int i = 1; i <= 9; i++) {

			System.out.print( i +"の段 ");
			for(int j = 1; j <=  9;  j++) {
				System.out.print( i * j + " ");
			}
			System.out.println();
		}

	}

}
