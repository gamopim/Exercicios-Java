import java.util.Scanner;

public class exe01 {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros para realizar a soma");
		
		int x, y, soma;
		x = sc.nextInt();
		y = sc.nextInt();
		soma = x + y;
		System.out.println("Soma = " + soma );
		
		
		sc.close();
	}

}
