import java.util.Scanner;

public class exe02for {

	public static void main(String[] args) {
		
		int n, i, x, in, out;
		in = 0;
		out = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos valores vocêr ler: ");
		n = sc.nextInt();
		
		for (i=0; i<n; i++) {
			System.out.println("Digite um valor:");
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;	
			}
		}
			
		System.out.println("In: " + in);
		System.out.println("Out: " + out);
		
		sc.close();
		

	}

}
