import java.util.Scanner;

public class Main {
	 
	public static void main(String[] args) {
 
	
 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
        
		int[] arr = new int[n];
		
		int[] arr2 = new int[2];
		
 
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			arr2[0] = a;
			int b = sc.nextInt();
			arr2[1] = b;
			arr[i] = a+b;
			System.out.println("Case #" + (i+1) + ": " + arr2[0] + " + " + arr2[1] + " = " + arr[i]);
		}
		for (int i = 0; i < n; i++) {
			
		}
		
	}
}