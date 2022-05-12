import java.util.Scanner;

public class exe01while {

	public static void main(String[] args) {
		int senha;
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a sua senha:");
		senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		
		sc.close();

	}

}