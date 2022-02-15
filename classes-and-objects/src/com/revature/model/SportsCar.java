package com.revature.model;

public class SportsCar {

	public String make;
	public String model;
	public String color;
	public int hp;
	public int year;
	public int torque;

	public SportsCar(String make, String model, String color, int hp, int year, int torque) {
		this.make=make;
		this.model=model;
		this.color=color;
		this.hp=hp;
		this.year=year;
		this.torque=torque;
	}
	public SportsCar(SportsCar fakeCar) {
		//this=fakeCar;
		
		this.make  =fakeCar.make;
		this.model =fakeCar.model;
		this.color =fakeCar.color;
		this.hp    =fakeCar.hp;
		this.year  =fakeCar.year;
		this.torque=fakeCar.torque;
		
	}
	
	public void lap() {
		System.out.println("The Make is "+this.make);
		System.out.println("The Model is "+this.model);
		System.out.println("The Color is "+this.color);
		System.out.println("The hp is "+this.hp);
		System.out.println("The year is "+this.year);
		System.out.println("The toque is "+this.torque);
		
	}
}
