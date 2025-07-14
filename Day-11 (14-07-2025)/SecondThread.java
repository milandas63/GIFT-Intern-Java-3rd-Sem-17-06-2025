package com.thread;

public class SecondThread implements Runnable {
	String colors[] = {"Red","Green","Blue","Pink","Yellow","White","Black","Cyan","Brown","Purple","Magenta","Violet","Gray","Orange","Metalic","Steel"};
	String numbers[] = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};

	public SecondThread() {		
		Thread t1 = new Thread(this);
		t1.start();
		t1.setPriority(3);

		Thread t2 = new Thread(new NextThread());
		t2.start();

		System.out.println();
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+", ");
		}
	}

	public void run() {
		System.out.println();
		for(int i=0; i<colors.length; i++) {
			System.out.print(colors[i]+", ");
		}
	}
	
	public static void main(String[] args) {
		new SecondThread();
	}
}

class NextThread implements Runnable {
	int digits[] = {200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220};

	public void run() {
		System.out.println();
		for(int i=0; i<digits.length; i++) {
			System.out.print(digits[i]+", ");
		}
	}
}