
public class InteracaoFor {

	public static void main(String[] args) {
		
//		for(int i = 1; i <= 5; i++){
//			System.out.println(i +" Repetindo...");
		
//			Double[] carrinhoDeCompra = new Double[] {50.0, 51.0, 52.0};
//			Double total = 0.0;
//			for(int i = 0; i < carrinhoDeCompra.length; i++) {
//				System.out.println("Interacao: " + i +", Total "+total);
//			total = total + carrinhoDeCompra[i];
//			
//			}
//			System.out.println("Total: " + total);
		
//		
//		for(int i = 1; i <= 10; i++){
//		if(i == 5) {
//			break;
//		}
//			System.out.println(i +" Interacao...");
				
		

//			for(int i = 1; i <= 10; i++){
//			if(i == 5) {
//				System.out.println("Vai continuar");
//				continue;
//			}
//				System.out.println(i +" interacao...");
//					
		Integer[] produtos = new Integer[] {100, 225, 300};
			for (int i = 0; i < produtos.length; i++ ) {
				Integer produto = produtos[i];
				
				System.out.println("Produto de codigo: " + produto);
				if(produto.equals(225)) {
					System.out.println("Produto encontrado! " );
					break;
				}
		
		
		
		
	}

		}
	}
