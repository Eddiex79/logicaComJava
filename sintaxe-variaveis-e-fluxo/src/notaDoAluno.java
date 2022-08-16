import java.util.Scanner;

public class notaDoAluno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer nota = 7 ;
		
		Boolean resultado = nota >=7;
		
		System.out.println("Digite a primeira nota: ");
		Double nota = scanner.nextDouble();
		
		
		if(resultado ) {
			System.out.println("Aluno aprovado");
			
		}else {
			System.out.println("Aluno reprovado");
		}
		
		scanner.close();
	}

}
