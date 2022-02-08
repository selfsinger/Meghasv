package com.xworkz.multipleinheritance5;

public interface Child1 {
	default void child1()
	{
		System.out.println("This child has one parent");
	}

}
