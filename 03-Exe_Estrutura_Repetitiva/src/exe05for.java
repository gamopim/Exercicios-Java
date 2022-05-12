import java.util.Scanner;

public class exe05for {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int fat = 1;
		System.out.println("Bem-vindo à calculadora de fatorial. Digite um número:");
		int n = sc.nextInt();
		
		
		for (int i = 1; i <= n; i++) {
			fat = fat * i;
					
		}
		
		System.out.println("Fatorial de " + n + " é = " + fat);
				
		sc.close();

	}

}
