package com.dan.sample;

import java.util.ArrayList;
import java.util.Arrays;

//-----------------------------
//-----------------------------
//-----------------------------


//Looooooong (and not good) approach...


//-----------------------------
//-----------------------------
//-----------------------------

public class SampleExercise3 {

	public static void main(String[] args) {
		int array1[] = {2, 4, 8};
		int array2[] = {2, 3, 4, 8, 10, 16};
		int array3[] = {4, 8, 14, 40};
		
		ArrayList<Integer> commonList = new ArrayList<Integer>();
		
		//optional, since array is already sorted
		Arrays.sort(array1);
		Arrays.sort(array2);
		Arrays.sort(array3);
		
		int a = array1.length;
		int b = array2.length;
		int c = array3.length;
		
		
		//Get the length of the array with the most number of elements
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
		
		
		//compare values
		int i = 0;
		int j = 0;
		int k = 0;
		
		for (j = 0; j < array2.length; j++) {
			int temp2 = array2[j];
			
			for (k = 0; k < array3.length; k++) {
				int temp3 = array3[k];
				
				if (temp2 == temp3) {
					for (i = 0; i < array1.length; i++) {
						int temp1 = array1[i];
						
						if (temp2 == temp1) {
							commonList.add(temp2);
						}
					}
				}
			}
		}
		
		//check values
		System.out.println("commonList: "+commonList.toString());
	}
}
