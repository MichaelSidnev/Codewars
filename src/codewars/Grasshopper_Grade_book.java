package codewars;

public class Grasshopper_Grade_book {
    public static char getGrade(int s1, int s2, int s3) {
		int average = (s1 + s2 + s3)/3;
		return average>90?'A':average>80?'B':average>70?'C':average>60?'D':'F';

    }

	public static void main(String[] args) {
		System.out.println(getGrade(94,79,85));

	}

}
