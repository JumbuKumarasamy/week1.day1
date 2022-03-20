package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		int input = 5, i;
		int fact = 1;
		for (i = 1; i <= input; i++) {
			fact *= i;
		}
		System.out.println(fact); 
	}
}
