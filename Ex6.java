import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i, X, Y = 0, Z = 0, N = sc.nextInt();
		
		
		for(i = 1; i <= N; i++) {
			X = sc.nextInt();
			if( X >=10 && X <= 20) {
				Z += 1;
			} else {
				Y += 1;
			}
			
		}
		
		System.out.printf("%d in%n", Z);
		
		System.out.printf("%d out%n", Y);
		sc.close();
		
	}

}
