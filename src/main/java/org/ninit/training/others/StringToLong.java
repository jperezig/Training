package org.ninit.training.others;

public class StringToLong {

	public static void main (String args[]){
		String input="1234567890";
		long result =0;
		for (int i=0; i < input.length();i++){
			result += (input.charAt(i)-'0') * Math.pow(10, input.length() -1 - i);
		}
		
		System.out.println(result+"="+input);
	}
}
