package codewars;

public class CreatePhoneNumber {
	public static String createPhoneNumber(int[] numbers) {
		String form = new String("(xxx) xxx-xxxx");
		for (int i : numbers) {
			form = form.replaceFirst("x", Integer.toString(i));
		}
		return form;
	}

	

	public static void main(String[] args) {
		int[] numbers = { 1, 0, 3, 4, 6, 6, 7, 3, 9, 0 };
		System.out.println(createPhoneNumber(numbers));

	}

}
