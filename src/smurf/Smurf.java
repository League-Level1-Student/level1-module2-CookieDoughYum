package smurf;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 3&4 see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {
	String color="blue";
	String gender="boy";
public static void main(String[] args) {
	Smurf Billy=new Smurf("Billy");
	Billy.eat();
	System.out.println("Billy");
	
	Smurf Papa=new Smurf("Papa");
	System.out.println(Papa);
Papa.setHatColor("red");
System.out.println("red");
Papa.setGirlOrBoy("Boy");
System.out.println("Boy");

	Smurf Smurfette=new Smurf("Smurfette");
	System.out.println("Smurfette");
	Smurfette.setHatColor("white");
	System.out.println("white");
	Smurfette.setGirlOrBoy("Girl");
	System.out.println("Girl");
}
	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}
	

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		return this.color;
	}
	public void setHatColor(String color) {
		this.color=color;
	}

	/* Smurfette is the only female Smurf. */
	public String GetGirlOrBoy() {
		// 4. Fill in this method
		return this.gender;
	}
	public void setGirlOrBoy(String Gender) {
		this.gender=gender;
	}

}


