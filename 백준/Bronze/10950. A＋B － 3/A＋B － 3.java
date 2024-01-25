import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int arr[] = new int[a];
    	
    	for(int i = 0; i<a; i++) {
    		int c= sc.nextInt();
    		int d = sc.nextInt();
    		arr[i] = c+d;
    	}
    	for(int x : arr) {
    		System.out.println(x);
    	}
    			
    }
}