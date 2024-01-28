import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	int total = 0;
    	int c = 0;
		int d = 0;
		
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	
    	for(int i=0; i<b; i++) {
    		c = sc.nextInt();
    		d = sc.nextInt();
    		
    		total += c*d;
    		
    	}
    	if(total == a) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
    			
    }
}