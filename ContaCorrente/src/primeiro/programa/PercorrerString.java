package primeiro.programa;

public class PercorrerString {

	public static void main(String[] args) {
		
		String mensagem = "Eu amo qualidade de software";
		char letra = 'u';
		int contador = 0;
		
		for(int i=0; i< mensagem.length(); i++) {
			//System.out.println("A nossa mensagem tem o tamanho " + i);
			if(mensagem.charAt(i)== letra) {
				contador++;
			}
		}
		System.out.println("A letra " + letra + " aparece " + contador+ " vezes");
		//System.out.println(mensagem.charAt(10));
	}

}
