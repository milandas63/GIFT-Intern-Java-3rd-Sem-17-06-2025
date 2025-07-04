package com.exception;

public class Example1 {
	public Example1() {
		try {
			int n = 55;
			int d = 5;
			double r = n / d;
			System.out.println("Result is "+r);

			String pm = "Narendra Damodar Modi";
			int index = 15;
			System.out.println(pm.charAt(index));
		} catch(ArrayStoreException e) {
			
		} catch(ClassCastException e) {
			System.out.println("Class Cast Exception");
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out Of Bounds Exception");
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Index Out Of Bounds Exception");
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} catch(NumberFormatException e) {
			System.out.println("Number Format Exception");
		//} catch(ClassNotFoundException e) {
		} catch(MyException e) {
		} finally {
			System.out.println("Prints in all situation");
		}
	}

	public static void main(String[] args) {
		new Example1();
	}

}

class MyException extends RuntimeException {

}

