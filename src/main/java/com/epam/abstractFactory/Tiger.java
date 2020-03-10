package com.epam.abstractFactory;

public class Tiger implements Animals{
	private String name;
	public Tiger(){
		this.name="Tiger King of Jungle";
		foodLs();
		producedSound();
		Rests();
	}
	@Override
	public void foodLs() {
		System.out.println("Tiger is a Carnivor Animal");
	}
	
	@Override
	public void producedSound() {
		System.out.println("Tiger sound is roaring");
	}
	
	@Override
	public void Rests() {
		System.out.println("Tiger Rests for 16hrs");
	}
	
}
