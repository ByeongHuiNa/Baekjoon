import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int total = 0;
		int small = N;

		for (int i = M; i <= N; i++) {
			int ncnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					ncnt++;
			}
			if (ncnt == 2) {
				total += i;
				if (small > i)
					small = i;
			}
		}

		if (total == 0)
			System.out.println(-1);
		else
			System.out.println(total + "\n" + small);

	}
}