import java.util.Scanner;

public class exe05 {

	public static void main(String[] args) {
	
		int cod1, cod2, num1, num2;
		double v1, v2, total; 
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o c�digo da primeira pe�a");
		cod1 = sc.nextInt();
		System.out.println("Digite o n�mero de pe�as");
		num1 = sc.nextInt();
		System.out.println("Digite o valor unit�rio da pe�a");
		v1 = sc.nextDouble();
		
		
		System.out.println("Digite o c�digo da segunda pe�a");
		cod2 = sc.nextInt();
		System.out.println("Digite o n�mero de pe�as");
		num2 = sc.nextInt();
		System.out.println("Digite o valor unit�rio da pe�a");
		v2 = sc.nextDouble();
		
		total = (num1 * v1) + (num2 * v2);
		System.out.printf("Valor a pagar: R$ %.2f",  total);
		
		sc.close();
	}

}
