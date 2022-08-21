import java.util.Scanner;

public class switchDias {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite de 1 a 7 para escolher os dias da semana: ");
		Integer dias = scanner.nextInt() ;
		
		switch(dias) {
		case 1: 
			System.out.println("Domingo ");
			
			break;
		case 2: 
			System.out.print("Segunda ");
			break;
		case 3: 
			System.out.print("Terca ");
			break;
		case 4: 
			System.out.print("Quarta ");
			break;
		case 5: 
			System.out.print("Quinta ");
			break;
		case 6: 
			System.out.print("Sexta ");
			break;
		case 7: 
			System.out.print("Sabado ");
			break;
		default:
			System.err.println("Digite um dia valido!!!");
			System.exit(1);
		}
		System.out.println(" \nSeja bem-vindo");
		scanner.close();

	}

}
