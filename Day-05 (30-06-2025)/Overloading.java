public class Overloading {

	public static void main() {
		System.out.println("main()");
	}

	public static void main(boolean tf) {
		System.out.println("main(boolean tf)");
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
		
		byte[] b = {65,66,67,68,69,70,71,72,73,74,75,76,77,78};
		String name = new String(b);
		System.out.println(name);
		
		String pm = "Narendra Modi";
		for(int i=pm.length()-1; i>=0; i--) {
			System.out.print(pm.charAt(i));
		}
	}
} 