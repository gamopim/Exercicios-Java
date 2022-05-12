import java.util.Scanner;

public class exe04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n, h;
		double v, salario;
		
		System.out.println("Digite o número do funcionário, horas trabalhadas e valor por hora:");
		n = sc.nextInt();
		h = sc.nextInt();
		v = sc.nextDouble();
		
		salario = h * v;
		
		System.out.println("Number: " + n);
		System.out.printf("Salary: %.2f",  salario);
		
		
		sc.close();

	}

}
