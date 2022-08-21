
public class ExercicioNumeroDivisivelPor3 {

	public static void main(String[] args) {
		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for(int i = 0; i < numeros.length; i++) {
			
			Integer numero = numeros[i];
			
			Integer moduloPorTres = numero % 3;
			
			if (moduloPorTres.equals(0)) {
				System.out.println("Numero " + numero + " EH divisivel por 3.");
			}
		}
		
		System.out.println("Fim.");

	}

}
//if (numeros[i] % 2 != 0) {
//    int primos = 0;
//    primos = i;
//    System.out.println(primos);
//    System.out.println(i);