package com.modifiers;

public class Parent {
	final String name;
	
	public Parent() {
		name = "Narendra Modi";
	}
	
    public boolean work() {
    	//name = "Atul Bajpaee";	// The final field Parent.name cannot be assigned
        return true;
    }
}

class Child extends Parent {
	public static String design = "Excellent";
	public String color = "MAGENTA";

	public final boolean work() {    // Cannot override the final method from Parent
        return true;
    }
}

class GrandChild {
	public static void main(String[] args) {
		
	}
	
    public boolean work() {
    	System.out.println(Child.design);
    	
    	Child c = new Child();
    	System.out.println(c.color); // Cannot make a static reference to the non-static field Child.color
        return true;
    }
}
