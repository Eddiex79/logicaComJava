import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("======Calculadora======");
		
		System.out.print("Digite um numero: ");
		Integer n1 = scanner.nextInt();
		
		System.out.print("Digite outro numero: ");
		Integer n2 = scanner.nextInt();
		
		System.out.print("Digite o tipo de calculo [1 = + / 2 -  /3 = * / 4 = /]: ");
		Integer calculo = scanner.nextInt();
		
		
		if(calculo == 1) {
			System.out.print("O valor calculado eh: " + n1 + n2);}
		
		else  if(calculo == 2) {
			System.out.print( n1 - n2);}
		
		
		else if(calculo == 3) {
			System.out.print("O valor calculado eh: " + n1 * n2);}		
		
		
		else {
			System.out.print("O valor calculado eh: " + n1 / n2);}
		

		scanner.close();

	}

}
