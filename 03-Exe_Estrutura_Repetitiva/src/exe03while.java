import java.util.Scanner;

public class exe03while {

	public static void main(String[] args) {
		
		int x, alc, die, gas;
		alc = 0;
		die = 0;
		gas = 0;
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Bem-vindo ao posto de gasolina");
		System.out.println("Digite o seu combustível: 1.Álcool 2.Gasolina 3.Diesel 4.FIM");
		x = sc.nextInt();
		
		while (x >= 1) {
			if (x == 1) {
				alc = alc + 1;
			}
			else if (x == 2) {
				gas = gas + 1;
			}
			else if (x == 3) {
				die = die + 1;
			}
			else if (x == 4) {
				System.out.println("Muito obrigado!");
				System.out.println("Álcool: " + alc);
				System.out.println("Gasolina: " + gas);
				System.out.println("Diesel: " + die);
				break;
			}
			
			else {
				System.out.println("Digite um código válido");
				
			}
			
			System.out.println("Digite o seu combustível: 1.Álcool 2.Gasolina 3.Diesel 4.FIM");
			x = sc.nextInt();
			}
			
		sc.close();
		}
		 
		
	}

