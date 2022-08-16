import java.util.Scanner;

public class podeTirarCnh {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer idade = 17;
		
		Boolean podeTirarCnh = idade >= 18;
		
		if(podeTirarCnh) {
			System.out.println("Vc pode tirar a Cnh");
		}else {
			System.out.println("Vc nao pode tirar a Cnh");
		}
		
		scanner.close();

	}

}
