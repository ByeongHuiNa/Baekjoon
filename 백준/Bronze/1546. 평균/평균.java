import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double max = 0;

		double total = 0;
		int N = sc.nextInt();

		double arr[] = new double[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		for (int i = 0; i < N; i++) {
			arr[i] = arr[i] / max * 100;
		}

		for (int i = 0; i < N; i++) {
			total += arr[i];

		}
		System.out.println(total / N);

	}
}