package codewars;

import java.util.Scanner;

public class TinkoffZadacha1 {

	public static void main(String args[]) {
		int result = 0;

		Scanner reader = new Scanner(System.in);		
			String data = reader.nextLine();
			String data1 = reader.nextLine();
			result = Integer.valueOf(data) + Integer.valueOf(data1)  ;
			
			Integer.toString(result);
			System.out.print(result);

			
		
		reader.close();

	}
}