package com.neotech.lesson03;

public class ModulusOperator {

	//modify some lines here
	//add another line

	public static void main(String[] args) {
		
		int var1 = 9, var2 = 4;
		
		int divRes = var1 / var2; // int division will drop the decimal point
									// .25 is removed, which composes 0.25*4=1 remainder
		

		
		int mod = var1 % var2;
		System.out.println("mod -> " + mod);    // The division without fraction
												// Take the fraction multiply it
												// by var2 --> 0.25*4=1 remainder
												// we have two 4s in 9 and 1 as 
												// remainder 
		
	}

}
