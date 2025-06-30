
public class CountVowels {
	//private String name = "In the world of Java";
	private String name = "Quick brown fox jumps over the lazy dog";
	private String vowels = "AEIOUaeiou";
	int count = 0;

	public CountVowels() {
		char c;
		for(int i=0; i<name.length(); i++) {
			c = name.charAt(i);
			for(int j=0; j<vowels.length(); j++) {
				if(c==vowels.charAt(j)) {
					count++;
					break;
				}
			}
		}
		
		System.out.println("Total of Vowels = "+count);
	}
	

	public static void main(String[] args) {
		new CountVowels();
	}

}
