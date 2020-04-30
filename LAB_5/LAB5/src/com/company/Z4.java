package com.company;

public class Z4 {
	public int[] odwrocTablice(int[] arr) {
		int newArr[] = new int[arr.length];	
		int j=0;
		
		for(int i = newArr.length-1; i >= 0 ; i-- ) {
			newArr[j]=arr[i];
			j++;
		}
		return newArr;
	}
	
}

