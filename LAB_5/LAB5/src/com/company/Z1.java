package com.company;

public class Z1 {
	 boolean sprawdzTemperature(float temp1, float temp2){
		boolean mniejszeod100 = false;
		
		if(temp1<100 || temp2<100)
			mniejszeod100 = true;
		
		return mniejszeod100;	 
	 }
}