import java.util.Scanner;

public class exe04for {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int n, i;
		double  num, den, div;
		
		System.out.println("Digite um número de pares a serem divididos");
		n = sc.nextInt();
		
		for (i = 0; i<n; i++) {
			System.out.println("Digite o numerador");
			num = sc.nextDouble();
			System.out.println("Digite o denominador");
			den = sc.nextDouble();
						
			if (den == 0) {
				System.out.println("Divisão impossível");
			}
			else{
				div = num/den;
				System.out.println(div);
			}
			
		}	
			
		sc.close();
		}
		
		
		
		
		
		
		
		
		
		

	}


