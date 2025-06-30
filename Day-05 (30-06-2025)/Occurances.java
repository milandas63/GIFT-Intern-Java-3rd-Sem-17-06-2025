
public class Occurances {
	String text = "Students Allowed";
	int[] count = new int[26];
	
	public Occurances() {
		int o;
		char c;
		for(int i=0; i<text.length(); i++) {
			c = text.charAt(i);
			o = (int)c;
			if(o>=65 && o<=90) {
				o = o-65;
				count[o]++;
			} else if(o>=97 && o<=122) {
				o = o-97;
				count[o]++;
			}
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i]>0) {
				System.out.println( (char)(i+65) + " = " + count[i]);
			}
		}
	}

	public static void main(String[] args) {
		new Occurances();

	}

}
