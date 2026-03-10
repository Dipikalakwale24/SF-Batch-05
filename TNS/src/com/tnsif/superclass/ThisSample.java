package com.tnsif.superclass;

public class ThisSample {
	int a = 10;
	public void show() {
		 int a = 20;
		System.out.println(a);
		System.out.println(this.a);
	}

}
