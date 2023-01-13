package primeiro.projeto;

public class MaiorMenor {

	public static void main(String[] args) {
		
		int n1 = 15;
		int n2 = 10;
		boolean pergunta = true;
		
		if(pergunta) {
			System.out.println("A pergunta é verdadeira");
		}
		if (!pergunta) {
			System.out.println("a pergunta é falsa");
		}
		
		if (n1 > n2) {
			System.out.println("N1 é Maior que N2");
		}
		if (n1 < n2) {
			System.out.println("N1 é Menor do que N2");
		}
		if (n1 == n2) {
			System.out.println("N1 e N2 são iguais");
		}
	}

}
