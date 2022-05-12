import java.util.Scanner;

public class exe05 {

	public static void main(String[] args) {
	
		int cod1, cod2, num1, num2;
		double v1, v2, total; 
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o código da primeira peça");
		cod1 = sc.nextInt();
		System.out.println("Digite o número de peças");
		num1 = sc.nextInt();
		System.out.println("Digite o valor unitário da peça");
		v1 = sc.nextDouble();
		
		
		System.out.println("Digite o código da segunda peça");
		cod2 = sc.nextInt();
		System.out.println("Digite o número de peças");
		num2 = sc.nextInt();
		System.out.println("Digite o valor unitário da peça");
		v2 = sc.nextDouble();
		
		total = (num1 * v1) + (num2 * v2);
		System.out.printf("Valor a pagar: R$ %.2f",  total);
		
		sc.close();
	}

}
