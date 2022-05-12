import java.util.Scanner;

public class exe07for {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Bem-vindo à calculadora do quadrado e cubo. Digite um valor:");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			int quad = (int) Math.pow(i, 2);
			int cub = (int) Math.pow(i, 3);
			System.out.println(i + " " + quad + " " + cub );
			
			
		}
						
		
		sc.close();

	}

}
