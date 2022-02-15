package com.revature.main;

import com.revature.model.Calculator;
import com.revature.model.SportsCar;



public class Driver {
	public static void main(String[] args) {
		SportsCar sc1 = new SportsCar("SomeMake", "SomeModel", "Blue", 500,600,2050);
		sc1.lap();
		SportsCar sc2=sc1;
		SportsCar sc3=new SportsCar(sc1);
		sc1.color="Red";
		sc2.lap();
		sc3.lap();
		
		Calculator c1=new Calculator();
		
		System.out.println(c1.add(5, 10));
		System.out.println(c1.subtract(5, 10));
		System.out.println(c1.multiply(5, 10));
		System.out.println(c1.divide(5, 10));
		System.out.println(c1.remainer(5, 10));
	}
}
