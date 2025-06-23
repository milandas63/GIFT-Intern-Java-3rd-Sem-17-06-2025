
public class HollowTriangle {

	public static void main(String[] args) {
		int spaces = 40;
		int stars = 1;
		String buf = "";
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<spaces; j++) System.out.print(" ");
			for(int j=0; j<stars; j++) {
				if(j==0 || j==stars-1 || i==9) {
					buf = "*";
				} else {
					buf = " ";
				}
				System.out.print(buf);
			}
			System.out.println();
			spaces--; stars += 2;
		}
		
	}

}
