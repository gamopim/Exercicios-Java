import java.util.Scanner;

public class exe06for {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Bem-vindo � calculadora de divisores. Digite um n�mero:");
		int n = sc.nextInt();
		
		
		for (int i = 1; i<=n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
			
		}
		
		
		sc.close();

	}

}
