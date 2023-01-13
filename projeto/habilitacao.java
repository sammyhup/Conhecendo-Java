package primeiro.projeto;

public class habilitacao {

	public static void main(String[] args) {
		
		String nome = "Lorenzo";
		int idade = 17;
		int idadePermitida = 18;
		boolean emancipado = true;
		
		if(idade >= idadePermitida || emancipado) {
			System.out.println("Voce pode tirar habilitação ");
		} else {
			System.out.println("Voce não pode tirar habilitaçao");
		}
	}

}
