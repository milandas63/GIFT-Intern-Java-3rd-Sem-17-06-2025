public class Overloading {

	public static void main() {
		System.out.println("main()");
	}

	public static void main(String args) {
		System.out.println("main(String args)");
	}
	
	public static void main(int args) {
		System.out.println("main(int args)");
	}
	
	public static void main(String args, int i) {
		System.out.println("main(String args, int i)");
	}

	public static void main(String[] args) {
		System.out.println("main(String[] args)");
		main("Hello",25);
		main(true);
	}
}
