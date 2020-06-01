package 配列;

public class Array2 {

	public static void main(String[] args) {
		int score[][] = {
				{67,78,90,56,84},
				{48,89,54,91},
				{77,56,100,58,67,69}
		};
		int sum;

		for(int i = 0; i < score.length; i++) {
			sum = 0;

			switch(i){
			case 0:
				System.out.println("Aクラスのテスト結果：");
				break;
			case 1:
				System.out.println("Bクラスのテスト結果：");
				break;
			case 2:
				System.out.println("Cクラスのテスト結果：");
				break;
			};

			for(int j = 0; j < score[i].length; j++) {
				System.out.println(score[i][j] + "点");
				sum += score[i][j];
			}
			System.out.println( score[i].length +"人の平均点は" + (sum / score[i].length) + "点です。");
			System.out.println();
		}
	}

}
