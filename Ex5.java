import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i, x = sc.nextInt();
		
		for(i = 1; i <= x ; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
			
			
		}
		
		sc.close();
	}

}
