import java.util.Locale;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double x = 0, y = 0;
		
		for(int i = 0 ; i < N ; i++ ) {
			for(int j = 0 ; j < 2 ; j++) {
				x = sc.nextDouble();
				y = sc.nextDouble();
				
				if(y == 0) {
					System.out.println("divisao impossivel");
				} else {
					System.out.printf("%.1f%n", x / y);
				}
				
			}
		}
		sc.close();
	}

}
