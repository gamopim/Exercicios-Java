import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {
		int a,b, x;
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Bem-vindo � calculadora de m�ltiplos");
		System.out.println("Digite um n�mero A");
		a = sc.nextInt();
		System.out.println("Digite um n�mero B");
		b = sc.nextInt();
		
		if (b > a) {
			x = a;
			a = b;
			b = x;
		}
		
		if (a%b == 0) {
			System.out.println("S�o m�ltiplos");
		}
		else {
			System.out.println("N�o s�o m�ltiplos");
		}
		
		
		sc.close();

	}

}