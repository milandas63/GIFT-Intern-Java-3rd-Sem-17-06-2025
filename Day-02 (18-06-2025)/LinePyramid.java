
public class LinePyramid {

	public static void main(String[] args) {
		int spaces = 40;
		int count = 1;
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<spaces; j++) System.out.print(" ");
			for(int j=1; j<=count; j++) System.out.print(i);
			System.out.println();
			spaces--; count+=2;
		}
				

	}

}
