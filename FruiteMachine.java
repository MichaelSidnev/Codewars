package codewars;

import java.util.HashMap;

public class FruiteMachine {

	static String[][] reels = {{"Wild","Star","Bell","Shell","Seven",
								"Cherry","Bar","King","Queen","Jack"},
							   {"Wild","Star","Bell","Shell","Seven",
								"Cherry","Bar","King","Queen","Jack"},
							   {"Wild","Star","Bell","Shell","Seven",
								"Cherry","Bar","King","Queen","Jack"}};
		
	static int[] spins = {1,0,1};
	static int itemValue;

	public static int fruit(final String[][] reels, final int[] spins) {

		int result = 0;
		
		HashMap<String, Integer> itemsValueMap = new HashMap<>();
		itemsValueMap.put("Wild", 10); 		itemsValueMap.put("Cherry", 5);
		itemsValueMap.put("Star", 9); 		itemsValueMap.put("Bar", 4);
		itemsValueMap.put("Bell", 8);		itemsValueMap.put("King", 3);
		itemsValueMap.put("Shell", 7);		itemsValueMap.put("Queen", 2);
		itemsValueMap.put("Seven", 6);		itemsValueMap.put("Jack", 1); 
		
		String item1 = reels[0][spins[0]];
		String item2 = reels[1][spins[1]];
		String item3 = reels[2][spins[2]];
		
		
		if(item1.equals(item2) && item1.equals(item3)) {
			itemValue = itemsValueMap.get(item1);
			result = itemValue*10;
		}
		
		if(item1.equals(item2) && !item1.equals(item3)) {
			itemValue = itemsValueMap.get(item1);
			if(item3.equals("Wild")) {
				result = itemValue*2;
				}else {
				result = itemValue;
				}
		}
		if(item1.equals(item3) && !item1.equals(item2)) {
			itemValue = itemsValueMap.get(item1);
			if(item2.equals("Wild")) {
				result = itemValue*2;
				}else {
				result = itemValue;
				}
		}
		if(item2.equals(item3) && !item2.equals(item1)) {
			itemValue = itemsValueMap.get(item2);
			if(item1.equals("Wild")) {
				result = itemValue*2;
				}else {
				result = itemValue;
				}
		}
		
		return result;
	}
	public static void main(String[] args) {
		
		System.out.println(fruit(reels, spins));		
	}
}

