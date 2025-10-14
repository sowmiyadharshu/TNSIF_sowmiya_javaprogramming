package com.tnsif.nonaccessmodifiers;

final class FinalDemo {
	
	final int Max = 100;
	
	 final void display() {
		System.out.println("Show the value of max:  "+Max);
	}

	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
	//	fd.Max = 300;
		fd.display();
		
		
	}

}

class Child extends FinalDemo{
	
	
	void display() {
		System.out.println("Show the value of max:  "+Max);
	}
}
