package com.tnsif.polymorphism;

public class overload {
	overload()
	{
		
	}
	overload(int a)
	{
		
	}

	public void addition(int a)  
	{
		System.out.println("This is a :"+a);
	}
	public void addition(int a,int b)  
	{
		int c = a+b;
		System.out.println("The sum of a and b is :"+c);
	}
	public void addition(float y,double z,boolean n)  
	{
		System.out.println("The float value is :"+y+ " the double value is: "+z+" the boolean value is :"+n);
	}
	
}


