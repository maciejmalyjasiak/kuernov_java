package com.company;

public class Z2 {
	
	public boolean sprawdzTablice(int[] arr) {
		
		for(int i = 0;i<arr.length-2;i++) {
			if(arr[i]==1 && arr[i+1]==2 && arr[i+2]==3) {
				return true;
			}
		}
		return false;
	}
	
}