
public class Overriding {
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.work();
		
	}
}

class MethodHiding {
	public void work() {
		System.out.println("This is from Method Hiding");
	}
}

class MethodOverloading extends MethodHiding {
	public void work() {
		System.out.println("This is from Method Overloading");
	}
}