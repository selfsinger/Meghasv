package com.xworkz.multipleinheritance2;

public class Puppy implements Dog{

	@Override
	public void eat() {
		System.out.println("It eats what his mother eats");
		
	}

	@Override
	public void sound() {
		System.out.println("Cute barking sound bcs its a little puppy");
		
	}

}
