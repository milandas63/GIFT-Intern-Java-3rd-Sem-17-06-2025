
public class AsciiSum {
	//String text = "Sarah";
	String text = "James Gosling";
	
	public AsciiSum() {
		char c;
		int sum = 0;
		for(int i=0; i<text.length(); i++) {
			c = text.charAt(i);
			sum += (int)c;
		}
		System.out.println("Total: "+sum);
	}

	public static void main(String[] args) {
		new AsciiSum();
	}

}
