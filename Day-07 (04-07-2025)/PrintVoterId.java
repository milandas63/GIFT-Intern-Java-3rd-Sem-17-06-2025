package com.exception;

public class PrintVoterId {
	int ages[] = {25,63,71,12,99,17,35,0,45,81,-23,66,91,11,-45,0};
	
	public PrintVoterId() {
		for(int i=0; i<ages.length; i++) {
			try {
				checkAge(ages[i]);
				System.out.println(ages[i] + " is valid age");
			} catch(TooYoungAgeException e) {
				System.out.println(ages[i] + " is too young age");
			} catch(TooOldAgeException e) {
				System.out.println(ages[i] + " is too old age");
			} catch(NegativeAgeException e) {
				System.out.println(ages[i] + " is negative age");
			} catch(ZeroAgeException e) {
				System.out.println(ages[i] + " is zero age");
			} catch(Exception e) {
				
			}
		}
	}

	private void checkAge(int age) throws TooYoungAgeException,
										  TooOldAgeException, 
										  NegativeAgeException, 
										  ZeroAgeException {
		if(age<0) {
			throw new NegativeAgeException();
		} else if(age==0) {
			throw new ZeroAgeException();
		} else if(age<18) {
			throw new TooYoungAgeException();
		} else if(age>90) {
			throw new TooOldAgeException();
		}
	}
	
	public static void main(String[] args) {
		new PrintVoterId();
	}

}
