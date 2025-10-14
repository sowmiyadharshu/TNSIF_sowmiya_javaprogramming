package com.tnsif.nonaccessmodifiers;

public class StaticDemo {
	
	//static variable
	static int count;
	
	//static block
	static {
		count = 20;
		
		System.out.println("Shows the count value assigned as: " + count);
	}
	
	//static method
	static void show() {
		System.out.println("Shows the static method: "+count );
	}

	public static void main(String[] args) {
		
		System.out.println("Main method static: "+count);
		
		
		//calling a method
		show();
		
		
	}

}
