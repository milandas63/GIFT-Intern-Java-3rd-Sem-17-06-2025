package com.modifiers;

public class StaticExample {
	public String father = "Jawaharlal Nehru";
	public static String child = "India Gandhi";
	
	public StaticExample() {
	}
	
	public StaticExample(int i) {
		StaticExample o1 = new StaticExample();
		StaticExample o2 = new StaticExample();
		StaticExample o3 = new StaticExample();
		
		System.out.println("o1.Father:"+o1.father+" / Child:"+o1.child);
		System.out.println("o2.Father:"+o2.father+" / Child:"+o2.child);
		System.out.println("o3.Father:"+o3.father+" / Child:"+o3.child);
		
		o2.father = "Biju Patnaik";
		o2.child = "Naveen Patnaik";
		
		System.out.println();
		System.out.println("o1.Father:"+o1.father+" / Child:"+o1.child);
		System.out.println("o2.Father:"+o2.father+" / Child:"+o2.child);
		System.out.println("o3.Father:"+o3.father+" / Child:"+o3.child);

		System.out.println();
		StaticExample.status();
		o2.status();
	}

	public static void main(String[] args) {
		new StaticExample(1);
	}

	public static void status() {
		System.out.println("Called from status method");
	}
}
