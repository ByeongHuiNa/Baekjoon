import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int cnt = 0;

		for (int i = 0; i < N; i++) {
			int ncnt = 0;
			int num = sc.nextInt();
			for (int j = 1; j <= num; j++) {
				if (num % j == 0)
					ncnt++;
			}
			if(ncnt == 2)
				cnt++;
		}
		System.out.println(cnt);

	}
}