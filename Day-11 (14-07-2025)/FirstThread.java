package com.thread;

public class FirstThread extends Thread {
	String colors[] = {"Red","Green","Blue","Pink","Yellow","White","Black","Cyan","Brown","Purple","Magenta","Violet","Gray","Orange","Metalic","Steel"};
	String numbers[] = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
	
	public FirstThread() {
		this.start();
		for(int i=0; i<colors.length; i++) {
			System.out.print(colors[i]+"  ");
		}
	}

	public void run() {
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+"  ");
		}
	}
	
	public static void main(String[] args) {
		new FirstThread();
	}

}
