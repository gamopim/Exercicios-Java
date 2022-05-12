import java.util.Scanner;

public class exe08 {

	public static void main(String[] args) {
		
		double x, ir;
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a sua renda:");
		x = sc.nextDouble();
		
	
		if (x <= 2000) {
			System.out.println("Isento");
		}
		
		else if (x > 2000 && x <= 3000) { 
			ir = (x - 2000) * 8 / 100; 
			System.out.printf("IR = R$ %.2f", ir);
		}
		
		else if (x > 3000 && x <= 4500) { 
			ir = (x - 3000) * 18 / 100 + 80 ; 
			System.out.printf("IR = R$ %.2f", ir);
		}
		
		else if (x > 4500) { 
			ir = (x - 4500) * 28 / 100 + 270 + 80; 
			System.out.printf("IR = R$ %.2f" , ir);
		}
		
		sc.close();

	}

}