package 論理演算子;

public class LogicalOperator1 {

	public static void main(String[] args) {
		int num;
		boolean result;

		num = 30;

		result = num % 3 == 0 && num % 5 == 0;

		System.out.println(result);
	}

}
