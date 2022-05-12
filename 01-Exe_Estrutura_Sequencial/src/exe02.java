import java.util.Scanner;

public class exe02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double r, area, pi;
		pi = 3.14159;
		System.out.println("Cálculo de área do círculo. Digite o raio");
		

		r = sc.nextDouble(); 
		area = pi * Math.pow(r, 2);
		
		
		System.out.printf("Área = %.4f", area);
		sc.close();
	}

}
