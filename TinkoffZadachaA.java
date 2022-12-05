package codewars;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TinkoffZadachaA {

	public static void main(String[] args) {
		// input file block
		try {

			int count = 0;

			Scanner reader = new Scanner(new File("input.txt"));
			reader.nextLine();

			var data = reader.nextLine().split(" ");
			reader.close();
			int[] array = new int[data.length];
			for (int i = 0; i < data.length; i++) {
				array[i] = Integer.parseInt(data[i]);
			}
			
			

		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	// output file block
	public static void writeResult(int result) throws IOException {
		FileWriter writer = new FileWriter("output.txt");
		writer.write(Integer.toString(result));
		writer.close();
	}

}
