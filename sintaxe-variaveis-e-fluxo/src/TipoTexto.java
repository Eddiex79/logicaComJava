import java.util.Scanner;

public class TipoTexto {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Qual a sua idade? ");
		Double idade = scanner.nextDouble();
		
				
		System.out.println("Ola " +nome +" sua idade eh " + idade );
		
		scanner.close();

	}

}
