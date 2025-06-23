
public class MTables {
	public static void main(String[] args) {
		int start = 2;
		int end = 25;
		int count = 0;

		for(int k=start; k<=end; k+=6) {
			for(int i=1; i<=10; i++) {
				for(int j=k; j<=(k+5); j++) {
					if(j>end) break;
					System.out.print(padL(j,2)+" x "+padL(i,2)+" = "+padL((i*j),3)+"  ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	static String padL(int n, int w) {
		String buf = ""+n;
		for(int i=buf.length(); i<w; i++) buf = " "+buf;
		return buf;
	}
}
