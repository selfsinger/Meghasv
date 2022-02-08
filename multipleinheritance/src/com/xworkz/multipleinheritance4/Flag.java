package com.xworkz.multipleinheritance4;

public class Flag implements Green, White,Saffron{

	@Override
	public void saffron() {
		System.out.println("Saffron color of the flag is a symbol of courage and sacrifice. ");
		
	}

	@Override
	public void white() {
		System.out.println(" The white colour represents honesty, peace, and purity. ");
		
	}

	@Override
	public void green() {
		System.out.println("The green colour represents faith and chivalry.");
		
	}

	

}
