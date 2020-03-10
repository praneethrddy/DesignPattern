package com.epam.abstractFactory;

public class Buffalo implements Animals{
	private String name;
	public Buffalo(){
		this.name = "Buffalo";
		foodLs();
		producedSound();
		Rests();
	}
	
	@Override
	public void foodLs() {
		System.out.println("Buffalo food is grass....");
	}
	@Override
	public void producedSound() {
		System.out.println("Buffalo makes sound as ambaaa...... ");
	}
	@Override
	public void Rests() {
		System.out.println("Buffalo sleeps for less than 6hrs....");
	}
}
