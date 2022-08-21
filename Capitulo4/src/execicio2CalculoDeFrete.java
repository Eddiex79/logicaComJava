import java.util.Scanner;


public class execicio2CalculoDeFrete {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=====Calculo de frete gratis compra acima de R$ 100 =====");
		
		Integer VALOR_DO_PRODUTO = 50;
		int frete = 15;
		
		
		
		System.out.print("Qual a quantidade de produtos voce quer? ");
		Integer quantidade = scanner.nextInt(); 
		
		
		
		
		if(quantidade == 1) {
			System.out.print( VALOR_DO_PRODUTO * quantidade + frete  + " \nFrete a partir de R$ 15,00");
			
		}else {
			System.out.print(VALOR_DO_PRODUTO * quantidade +"  \nFrete gratis a partir de R$ 100 " );
		}
		
		
		
		scanner.close();
	}

}
