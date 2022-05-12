import java.util.Scanner;

public class exe05 {

	public static void main(String[] args) {
		
		int cod, quant;
		double x, total;
		x = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o código do lanche");
		cod = sc.nextInt();
		System.out.println("Digite a quantidade");
		quant = sc.nextInt();
		
		
		if (cod == 1) {
			x = 4.00;
		}
		else if (cod == 2) {
			x = 4.50;
		}
		else if (cod == 3) {
			x = 5.00;
		}
		else if (cod == 4) {
			x = 2.00;
		}
		else if (cod == 5) {
			x = 1.50;
		}
		else
			System.out.println("Código inexistente");
		
		total = quant * x;
		
		System.out.printf("Total = %.2f", total);
		
		
		
		
		sc.close();

	}

}