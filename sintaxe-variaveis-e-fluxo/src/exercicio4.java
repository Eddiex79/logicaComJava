import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			System.out.print("Digite qual a quantidade desejada: ");		
			Double quantidadeProduto = scanner.nextDouble();
		
			System.out.print("Digite o valor de cada produto: ");
			Double valorProduto = scanner.nextDouble();
		
		
			double totalValor = valorProduto * quantidadeProduto;
			System.out.print(totalValor);
		
			Double resultado = totalValor * 10.0 / 100;
			Double valorComDesconto = totalValor - resultado; 
		
			if(quantidadeProduto >= 10) {
				System.out.println("O valor total com desconto de 10% eh R$" + valorComDesconto );
					} else {
					System.out.println("O valor sem desconto eh R$" + totalValor);
		}
		
		
		
		

		scanner.close();
		
	}

}
