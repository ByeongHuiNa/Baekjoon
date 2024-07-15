import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == -1)
				break;
			int total = 0;
			int arr[] = new int[n];
			int cnt = 0;
			int a = 0;

			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					total += i;
					arr[a++] = i;
					cnt++;
				}
			}
			if (total == n) {
				System.out.print(n + " = ");
				for (int i = 0; i < cnt; i++) {
					if (i == cnt - 1) {
						System.out.print(arr[i] + "\n");
					} else {
						System.out.print(arr[i] + " + ");
					}

				}

			} else {
				System.out.println(n + " is NOT perfect.");

			}
		}

	}
}