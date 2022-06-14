package org.locator;

public class Encapsulation {
	
	private int x;
	/*maths
	science
	social
	tamil
	english*/

	public int student1() //getX is an variable like acting
	{
		return x;
	}

	public void student1(int x) {
		this.x = x;
	}
	
	public int getX1() //getX1 is an variable like acting
	{
		return x;
	}

	public void setX1(int x) {
		this.x = x;
	}
	
	public int ss()
	{
		//logic
		System.out.println(55);
		return 10;
	}
	public static void main(String[] args) {
		Encapsulation a = new Encapsulation();
		System.out.println(a.ss()+50);
	}
	

}
