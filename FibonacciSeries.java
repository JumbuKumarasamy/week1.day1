package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int r = 6;
		int firstNum = 0;
		int secNum = 1;
		int sum;
		System.out.println(firstNum);
		for (int i = 1; i <= r; i++) {
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum); 
		}

	}
}