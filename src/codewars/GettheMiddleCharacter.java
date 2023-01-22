package codewars;

public class GettheMiddleCharacter {
	
	 public static String getMiddle(String word) {
		 
			if (word.length() / 2 == 0) {
				return word.charAt((word.length() / 2)) + word.charAt(word.length() / 2 + 1) + "";
			} else {
				return word.charAt(word.length() / 2 + 1) + "";
			}
		 
		    
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
