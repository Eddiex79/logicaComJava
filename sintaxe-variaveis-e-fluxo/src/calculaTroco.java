import java.util.Scanner;

public class calculaTroco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("===TROCO CERTO===");
		
		System.out.print("Qual eh o valor do produto? R$ ");
		Double valorProduto = scanner.nextDouble();
				
		System.out.print("Valor pago pelo cliente: R$ ");		
		Double valorPassadoPeloCliente = scanner.nextDouble();
		 
		Double resultado = valorPassadoPeloCliente - valorProduto ;
		
		System.out.print("O troco eh " +resultado);
		
		scanner.close();
		
		
	

	}

}
