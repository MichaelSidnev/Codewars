package codewars;

public class XO {
	static int oCount = 0;
	static int xCount = 0;
	static String str = "xXxxoewrcoOoo";

	public static boolean getXO(String str) {

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
				oCount++;
			}
			if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
				xCount++;
			}
		}
		
		return oCount == xCount;
	
	}
	public static void main(String[] args) {
		System.out.println(getXO("xxxooo"));
		System.out.println(getXO("xxxXooOo"));
		System.out.println(getXO("xxx23424esdsfvxXXOOooo"));
		System.out.println(getXO("xXxxoewrcoOoo"));
		
		
	}
}