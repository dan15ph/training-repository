package com.dan.sample;

public class SampleExercise4 {

	public static void main(String[] args) {
		
		
		int[] fibonacci = new int[20];
		int prev = 0;
		
		for (int i = 0; i < 20; i++) {
			if (i > 1) {
				fibonacci[i] = prev + fibonacci[i-2];
				prev = fibonacci[i];
			}
			else {
				fibonacci[i] = 0;
				prev = fibonacci[i]+1;
			}
			System.out.println(fibonacci[i]);
		}
	}

}
