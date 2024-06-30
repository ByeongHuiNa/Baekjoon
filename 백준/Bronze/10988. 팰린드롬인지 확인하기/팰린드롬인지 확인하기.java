import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		
		String a ="";
		String b="";
		
		for(int i=0; i<(s.length()+1)/2; i++) {
			a += s.charAt(i);
		}
		
		for(int i=s.length()-1; i>=s.length()/2; i--) {
			b += s.charAt(i);
		}
		
		if(a.equals(b)) {
			System.out.println(1);
		}else
			System.out.println(0);
		
		

	}
}