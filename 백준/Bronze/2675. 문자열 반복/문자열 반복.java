import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		String arr[] = new String[N];
		

		for (int i = 0; i < N; i++) {
			int R = sc.nextInt();
			String S = sc.next();
			arr[i] = "";
			
			for (int a = 0; a < S.length(); a++) {
				for (int b = 0; b < R; b++) {
					arr[i] += S.charAt(a);
				}

			}

		}

		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}

	}
}