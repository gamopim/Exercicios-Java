import java.util.Scanner;

public class exe05for {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int fat = 1;
		System.out.println("Bem-vindo � calculadora de fatorial. Digite um n�mero:");
		int n = sc.nextInt();
		
		
		for (int i = 1; i <= n; i++) {
			fat = fat * i;
					
		}
		
		System.out.println("Fatorial de " + n + " � = " + fat);
				
		sc.close();

	}

}
