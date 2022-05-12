import java.util.Scanner;

public class exe03for {

	public static void main(String[] args) {
		int n,i;
		double x1, x2, x3, mp;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos testes você quer fazer?");
		n = sc.nextInt();
		
		for (i = 0; i<n ; i++) {
			System.out.println("Digite os três valores: ");
			x1 = sc.nextDouble();
			x2 = sc.nextDouble();
			x3 = sc.nextDouble();
			mp = (x1 * 2 + x2 * 3 + x3 * 5) / 10;
			System.out.printf("%.1f%n",mp);
		}
		
		
		sc.close();

	}

}
