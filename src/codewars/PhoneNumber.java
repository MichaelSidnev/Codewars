package codewars;

public class PhoneNumber {
		  public static String createPhoneNumber(int[] numbers) {
		  
		    String phoneNumber = new String("(ooo) ooo-oooo");
		    for (int i : numbers) {
		      phoneNumber = phoneNumber.replaceFirst("o", Integer.toString(i));
		    }
		    
		    return phoneNumber;
		  }
		  public static void main(String[] args) {
			  int[] numbers = {1,2,3,4,5,6,7,8,9,0};
			  
			  System.out.println(createPhoneNumber(numbers));
		}

}
