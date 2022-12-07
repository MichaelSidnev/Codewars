package codewars;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TinkoffFZadachaB {

	public static void main(String[] args) {
		// input file block
		try {
			Scanner reader = new Scanner(new File("input.txt"));
			ArrayList<Integer> array = new ArrayList<>();
			while (reader.hasNext()) {
				var data = reader.nextLine().split(" ");
				for (int i = 0; i < data.length; i++) {
					array.add(Integer.parseInt(data[i]));
					System.out.println(array);
				}
			}
			reader.close();
			int perimetr = array.get(0);
			int dereven = array.get(1);
			int longArc = 0;
			int length = 0;
			for (int i = 2; i < array.size(); i++) {
				if (i == 2) {
					length = array.get(i) + array.get(0) - array.get(array.size() - 1);
				}
				if (i + 1 == array.size()) {
					length = array.get(0) - array.get(i) + array.get(2);
				} else {
				length = array.get(i + 1) - array.get(i);
				}
				if(longArc < length) {
					longArc = length;
				}
				writeResult(longArc);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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
