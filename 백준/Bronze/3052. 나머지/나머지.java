import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		boolean arr[] = new boolean[42];

		for (int i = 0; i < 10; i++) {
			arr[in.nextInt()%42] = true;
		}
		for(boolean val : arr) {
			if(val) {
				count++;
			}
		}
		System.out.println(count);

	}
}