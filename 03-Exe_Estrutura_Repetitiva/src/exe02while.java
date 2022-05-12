import java.util.Scanner;

public class exe02while {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x, y;
		
		System.out.println("Digite a coordenada X:");
		x = sc.nextInt();
		
		System.out.println("Digite a coordenada Y:");
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if ( x > 0  && y > 0) {
				System.out.println("Primeiro");
			}
			else if ( x < 0 && y > 0) {
				System.out.println("Segundo");
			}
			else if ( x < 0 && y < 0) {
				System.out.println("Terceiro");
			}
			else {
				System.out.println("Quarto");
			}
			System.out.println();
			System.out.println("Digite a coordenada X:");
			x = sc.nextInt();
			
			System.out.println("Digite a coordenada Y:");
			y = sc.nextInt();
			
		}
		
		System.out.println("Coordenada NULA. Programa encerrado");
		
		
		sc.close();

	}

}