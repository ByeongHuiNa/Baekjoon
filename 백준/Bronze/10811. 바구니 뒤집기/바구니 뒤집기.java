import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int arr[] = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			arr[i] = i;
		}
		
		for(int a=0; a<M; a++) {
			int tmp = 0;
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			for(int h=i; h<=j; h++) {
				tmp = arr[h];
				arr[h] = arr[j];
				arr[j--] = tmp;
			}
			
		}
		
		for(int i=1; i<=N; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}