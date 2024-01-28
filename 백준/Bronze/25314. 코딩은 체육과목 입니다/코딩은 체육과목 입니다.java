import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	
		int cnt = 0;
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	cnt = a / 4;
    	
    	for(int i = 0; i<cnt; i++) {
    		System.out.print("long ");
    	}
    	System.out.print("int");
   		
    }
}