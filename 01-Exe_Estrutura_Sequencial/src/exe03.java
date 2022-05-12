import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int v, x, y, z, dif;
		
		System.out.println("Digite quatro valores: ");
		
		v = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		dif = (v * x) - (y * z);
		
		System.out.println("Diferença: " + dif);
		
	
		sc.close();
	}

}
