import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= N ; i++) {
			int a = i;
			double b =  Math.pow(i, 2);
			double c = Math.pow(i, 3); 
			
					
			System.out.printf("%d %.0f %.0f%n", a, b, c );
		}
		sc.close();
	}

}
