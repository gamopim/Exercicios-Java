import java.util.Scanner;

public class exe02 {

	public static void main(String[] args) {
		
		int x;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Ímpar");
		}
		
		
		sc.close();

	}

}