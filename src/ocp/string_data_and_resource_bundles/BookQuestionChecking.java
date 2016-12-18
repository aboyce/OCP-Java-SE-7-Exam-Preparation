package ocp.string_data_and_resource_bundles;

public class BookQuestionChecking {

	public static void main(String[] args) {
		questionFromBook();
		System.out.println("------------------------");
		System.out.println("------------------------");
		questionFromBookDebugged();
	}

	private static void questionFromBook() {
		StringBuilder stringBuilder = new StringBuilder(8);
		System.out.print(stringBuilder.length() + " " + stringBuilder + " ");
		stringBuilder.insert(0, "abcdef");
		stringBuilder.append("789");
		System.out.println(stringBuilder.length() + " " + stringBuilder);
	}
	
	private static void questionFromBookDebugged() {
		StringBuilder stringBuilder = new StringBuilder(8);
		System.out.println("1" + stringBuilder);
		System.out.println(stringBuilder.length());
		System.out.println("2" + stringBuilder);
		stringBuilder.insert(0, "abcdef");
		System.out.println("3" + stringBuilder);
		stringBuilder.append("789");
		System.out.println("4" + stringBuilder);
		System.out.println(stringBuilder.length());
	}
}