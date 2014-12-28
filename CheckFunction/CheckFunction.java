package CodeChallenges;

import java.util.HashMap;

public class CheckFunction {
	public static void main(String[] args){
		System.out.println(newFunction("02468"));
	}
	
	public static int newFunction(String code){
		HashMap<Character, Integer> numToDash = new HashMap<Character, Integer>();
		numToDash.put('0', 6);
		numToDash.put('1', 2);
		numToDash.put('2', 5);
		numToDash.put('3', 5);
		numToDash.put('4', 4);
		numToDash.put('5', 5);
		numToDash.put('6', 6);
		numToDash.put('7', 3);
		numToDash.put('8', 7);
		numToDash.put('9', 6);
		
		int totalDashes = 0;
		
		for(int i = 0; i < code.length(); i++){
			totalDashes += numToDash.get(code.charAt(i));
		}
		
		return totalDashes;
	}
}
