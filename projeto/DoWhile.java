package primeiro.projeto;

public class DoWhile {

	public static void main(String[] args) {
		
		int numero1 = 10;
		int numero2 = 20;
		
		do {
			System.out.println("Entrei no while, o numero1 vale: " + numero1);
			
			numero1 ++;
			//numero1 = numero1 +1;
			
		}while (numero1 < numero2); 
		
		System.out.println("Fora no while, o numero1 vale: " + numero1);
	
	}
	

}
