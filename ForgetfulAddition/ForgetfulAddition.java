package CodeChallenges;

import java.util.ArrayList;

public class ForgetfulAddition {
	public static void main(String[] args){

		System.out.println(minNumber("123"));
	}
	
	public static int minNumber(String numSet){
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int minNumber = Integer.MAX_VALUE;
		for(int i = numSet.length() - 1; i >= 0; i--){
			if(numSet.substring(0, i).equals("") || numSet.substring(i).equals(""))
				break;
			else{
				int result = Integer.parseInt(numSet.substring(0, i)) + Integer.parseInt(numSet.substring(i));
				nums.add(result);
				System.out.println(result);
			}
		}
		
		
		for(int i = 0; i < nums.size(); i++){
			if(nums.get(i) < minNumber){
				minNumber = nums.get(i);
			}
		}
		
		System.out.println(minNumber + " is the lowest number.");
		return minNumber;
	}
}
