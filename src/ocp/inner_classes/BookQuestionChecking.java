package ocp.inner_classes;


class Dog { int size; public Dog(int s) {size = s;}}

public class BookQuestionChecking {
	
	private int size = 7;
	private static int length = 3;

	public static void main(String[] args) {
		new BookQuestionChecking().questionFromBook();
	}

	private void questionFromBook() {
		int size = 5;
		System.out.println(new Gazer().adder());
	}
	
	class Gazer {
		int adder() {
			return size * length;
		}
	}
}