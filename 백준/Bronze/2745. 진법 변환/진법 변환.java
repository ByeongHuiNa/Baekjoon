import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();

		int n = sc.nextInt();

		int total = 0;

		for (int i = 0; i < a.length(); i++) {
			char b = a.charAt(a.length() - 1 - i);

			if (b >= 'A' && b <= 'Z') {
				total += (int) ((b - 55) * Math.pow(n, i));
			} else {
				total += (int) ((b - 48) * Math.pow(n, i));
			}

		}
		System.out.println(total);

	}
}