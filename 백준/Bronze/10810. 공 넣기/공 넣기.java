import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = in.nextInt();
		
		int narr[] = new int[N];
		
		
		for(int i=0; i<M; i++) {
			int z = in.nextInt();
			int j = in.nextInt();
			int k = in.nextInt();
			
			for(int a=z; a<=j; a++) {
				narr[a-1] = k;
			}
			
		}
		
		for(int i=0; i<narr.length; i++) {
			System.out.print(narr[i] + " ");
		}
		
	}
}