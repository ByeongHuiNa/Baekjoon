import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int arr[] = new int[9];

		for (int i=0; i<arr.length; i++) {
			arr[i] = in.nextInt();
		}
		int max = arr[0];
		int idx = 0;
		
		for (int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		System.out.println(max);
		System.out.println(idx+1);

	}
}