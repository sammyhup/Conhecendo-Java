package primeiro.projeto;

public class CaseIf {

	public static void main(String[] args) {
		
		// 1 vita | 2 credito | 3 boleto 
		int opcao = 1;
		double valorProduto = 5.000;
		double saldoCliente = 10.000;
		
		switch(opcao) {
		
		case 1:
			System.out.println("Voce escolheu a opcao a vista");
			
			if (saldoCliente >= valorProduto) {
				System.out.println(" Compra realizada com sucesso");
			}else {
				System.out.println("Compra negada, procure o seu banco");
			}
			
			break;
		case 2:
			System.out.println("Voce escolheu a opcao 2");
			break;
		case 3:
			System.out.println("Voce escolheu a opcao 3");
			break;
			default:
				System.out.println("Opçao invalida");
				break;
		}
				

	}

}
