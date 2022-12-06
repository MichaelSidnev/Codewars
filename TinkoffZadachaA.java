package codewars;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class TinkoffZadachaA {

	public static void main(String[] args) {
		// input file block
		try {

			Scanner reader = new Scanner(new File("input.txt"));
			reader.nextLine();// ignoring first line
			while (reader.hasNext()) {

				var array = reader.nextLine().split("");

				Arrays.sort(array);
				if (array[0].equals(array[1]) && array[2].equals(array[3])) {
					writeResult("Yes");
				} else {
					writeResult("No");
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	// output file block
	public static void writeResult(String result) throws IOException {
		PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("output.txt", true))); //need "true" for rewriting is off.
		writer.append(result);
		System.out.print(result);
		writer.write("\n");
		System.out.print("\n");
		writer.close();
	}

}
