import java.util.Scanner;

public class exe06 {

	public static void main(String[] args) {
		
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo, pi;
		
		pi = 3.14159;

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Bem-vindo ao calculador de �rea!");
		System.out.println("Digite o valor de A");
		a = sc.nextDouble();
		System.out.println("Digite o valor de B");
		b = sc.nextDouble();
		System.out.println("Digite o valor de C");
		c = sc.nextDouble();
		
		triangulo = (a * c)/2;
		System.out.printf("�rea tri�ngulo ret�ngulo: %.3f%n", triangulo);
		
		circulo = pi * Math.pow(c, 2);
		System.out.printf("�rea do c�rculo: %.3f%n", circulo);
		
		trapezio = ((a + b)*c)/2;
		System.out.printf("�rea do trap�zioo: %.3f%n", trapezio);
		
		quadrado = b * b;
		System.out.printf("�rea do quadrado: %.3f%n", quadrado);
		
		retangulo = a * b;
		System.out.printf("�rea do ret�ngulo: %.3f%n", retangulo);
		
		
		
		sc.close();
		
	}

}