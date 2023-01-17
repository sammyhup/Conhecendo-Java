package encapsulamento;

public class Caixa {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();	
		
			
		System.out.println(" antes do setsaldo " + cc.getSaldo());
		
		cc.setSaldo(100);
		
		System.out.println(" depois do setsaldo " + cc.getSaldo());

	}

}
