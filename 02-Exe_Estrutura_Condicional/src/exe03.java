import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {
		int a,b, x;
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Bem-vindo à calculadora de múltiplos");
		System.out.println("Digite um número A");
		a = sc.nextInt();
		System.out.println("Digite um número B");
		b = sc.nextInt();
		
		if (b > a) {
			x = a;
			a = b;
			b = x;
		}
		
		if (a%b == 0) {
			System.out.println("São múltiplos");
		}
		else {
			System.out.println("Não são múltiplos");
		}
		
		
		sc.close();

	}

}