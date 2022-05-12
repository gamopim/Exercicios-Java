import java.util.Scanner;

public class exe04 {

	public static void main(String[] args) {
	
	int a, b, x, total;
	
	total = 24;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Calculadora de horas");
	System.out.println("Digite a hora inicial do jogo: ");
	a = sc.nextInt();
	System.out.println("Digite a hora final do jogo: ");
	b = sc.nextInt();
	

	if (b>a) {
		x = a;
		a = b;
		b = x;
	}
	
	
	if (a == b) {
	total = 24;
	System.out.println("O jogo durou " + total + " hora(s)");
	}
	
	else if (a > b){
		total = total - (a - b);
		System.out.println("O jogo durou " + total + " hora(s)");
	}
	
	else {
	total = b - a;
	System.out.println("O jogo durou " + total + " hora(s)");
	}
	
	sc.close();

	}

}