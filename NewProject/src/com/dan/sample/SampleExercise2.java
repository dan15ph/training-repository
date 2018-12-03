package com.dan.sample;

import java.util.ArrayList;
import java.util.Arrays;

public class SampleExercise2 {

	public static void main(String args[]) {
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
		else if(b > a) {
			if(b > c) {
				baseLength = b;
			}
			else if(a > c) {
				baseLength = a;
			}
			else {
				baseLength = c;
			}
		}
		
		
		//---
		for (int ctr = 0; ctr < baseLength; ctr++) {
		
			int tempA = 0;
			int tempB = 0;
			int tempC = 0;
			
//			if (ctr < array1.length) {
//				tempA = array1[ctr];
//			}
//			
//			if (ctr < array2.length) {
//				tempB = array2[ctr];
//			}
//			
//			if (ctr < array3.length) {
//				tempC = array3[ctr];
//			}
			
			
			
			//----------
			if (tempA == tempB) {
				if (tempA == tempC) {
					commonList.add(tempA);
				}
			}
			
			if (tempB == tempC) {
				if (tempB == tempA) {
					commonList.add(tempA);
				}
			}
		}
		
		//test
		System.out.println("commonList: "+commonList.toString());
	}
}
