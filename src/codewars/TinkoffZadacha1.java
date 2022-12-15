package codewars;


import java.io.IOException;
import java.util.Scanner;

public class TinkoffZadacha1 {

	public static void main(String args[]) {

		Scanner reader = new Scanner(System.in);
		while (reader.hasNext()) {
			String[] data = reader.nextLine().split("");

			int result = 0;
			for (int i = 0; i < data.length; i++) {
				result += Integer.valueOf(data[i]);
			}
			
		}
		reader.close();
	}

	public static void writeResult(int result) throws IOException {
		System.out.print(result);
		
	}
}