package org.ninit.training.others;

public class MoveZeroes {

	public static void main(String args[]){
		int[] numbers = {0,0,3,0,5, 0 , 0, 4, 2, 1, 0};
		int last=0;
		
		for (int i=0; i < numbers.length;i ++){
			if (numbers[i]!=0){
				numbers[last++]=numbers[i];
			}
		}
		for (int i=last; i <numbers.length;i++){
			numbers[i]=0;
		}
		
		System.out.println(numbers);
		
		
	}
}
