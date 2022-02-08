package com.xworkz.multipleinheritance3;

public class Shastriya implements Hindustani,Karnatic{

	@Override
	public void music1() {
		System.out.println("Karnatic shastriya music,basicone");
	}

	@Override
	public void music2() {
		System.out.println("Hindustani shastriya music,nextlevel");
		
	}
	

}
