import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next().toUpperCase();

		int cnt[] = new int[26];

		for (int i = 0; i < s.length(); i++) {
			int num = s.charAt(i) - 'A';
			cnt[num]++;
		}
		int max = 0;
		char ans = '?';
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] > max) {
				max = cnt[i];
				ans = (char) (i + 'A');
			} else if (cnt[i] == max) {
				ans = '?';
			}

		}
		System.out.println(ans);

	}
}