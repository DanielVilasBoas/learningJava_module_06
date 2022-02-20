import java.util.Locale;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= 3; j++) {
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				double c = sc.nextDouble();
				System.out.printf("%.1f%n", (a * 2 + b * 3 + c * 5) / 10);
			}

		}
		sc.close();
	}
}
