package com.xworkz.multipleinheritance5;

public class Parent implements Child1,Child2{
	public void show()
	{
		Child1.super.child1();
		Child2.super.child2();
	}

}
