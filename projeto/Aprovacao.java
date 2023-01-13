package primeiro.projeto;

public class Aprovacao {

	public static void main(String[] args) {
		
		double nota1 = 10.0;
		double nota2 = 9.5;
		double nota3 = 8.5;
		double media = (nota1+nota2 +nota3)/3;
		double notaAprovacao = 8.0;
		boolean falta = true;
		boolean disc = true;
		
		if(media >= notaAprovacao && falta && disc ) {
			System.out.println("Aluno Aprovado.");
		} else {
			System.out.println("Aluno Reprovado.");
		}
		
	}

}
