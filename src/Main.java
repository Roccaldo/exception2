public class Main {
	public static void main(String[] args) {
		System.out.println(checkNumb('R'));
	}

	public static boolean checkNumb(char letter) {
		if(Character.isDigit(letter)) {
			return true;
		} else {
			throw new ArithmeticException("Its not a number!");
		}
	}
}