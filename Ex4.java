import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int prefer = sc.nextInt();
		int Alcool = 0, Gasolina = 0, Diesel = 0;

		while (prefer != 4) {
			if (prefer == 1) {
				Alcool += 1;
			} else if (prefer == 2) {
				Gasolina += 1;
			} else if (prefer == 3) {
				Diesel += 1;
			}
			prefer = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", Alcool);
		System.out.printf("Gasolina: %d%n", Gasolina);
		System.out.printf("Diesel: %d%n", Diesel);
		sc.close();
		
		System.out.println();
	}
	

}
