
public class NumerosDivisiveisPor2 {

	public static void main(String[] args) {
		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 };
		for(int i = 0; i < numeros.length; i++) {
			
			Integer numero = numeros[i];
			 
			 Integer divisoresPorDois = numero % 2;
			 
			 if(divisoresPorDois.equals(0)) {
			 System.out.println(numero + "Esses numeros sao divisiveis por 2");}
		}
	}

}
