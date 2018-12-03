package com.dan.sample;

import java.util.ArrayList;
import java.util.Arrays;

public class SampleExercise {

	public static void main(String[] args) {
		int array1[] = {2, 4, 8};
		int array2[] = {2, 3, 4, 8, 10, 16};
		int array3[] = {4, 8, 14, 40};
		
		ArrayList<Integer> commonList = new ArrayList<Integer>();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		Arrays.sort(array3);
		
		int a = array1.length;
		int b = array2.length;
		int c = array3.length;
		
		
		int baseLength = 0;
		if(a > b) {
			if (a > c) {
				baseLength = a;
			}
			else if(b > c) {
				baseLength = b;
			}
			else {
				baseLength = c;
			}
		}
		
		
		//---
		int helloWorld1[][] = new int[3][baseLength];
		
//		ArrayList<Integer> helloWorld2 = new ArrayList<Integer<Object>>();
		
//		Map<Integer, Object> helloWorld3 = new HashMap<>();
//		helloWorld3.put(0, array1);
//		helloWorld3.put(1, array2);
//		helloWorld3.put(2, array3);
		
		for (int i = 0; i < helloWorld1.length; i++) {
		
//			for (int j = 0; j < helloWorld1[i][j].length; j++) {
//				
//			}
		}
		
		
		//test
		System.out.println("commonList: "+commonList.toString());
	}

}
