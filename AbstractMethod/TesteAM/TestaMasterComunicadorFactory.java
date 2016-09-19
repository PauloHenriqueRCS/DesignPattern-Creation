package TesteAM;

import FilesAM.*;

public class TestaMasterComunicadorFactory {
	
public static void main(String[] args) {
		
		ComunicadorFactory comunicadorFactory = new MastercardComunicadorFactory();

		String transacao = " Valor = 10000; Senha = 666999 ";
		Emissor emissor = comunicadorFactory.createEmissor();
		emissor.envia(transacao);

		Receptor receptor = comunicadorFactory.createReceptor();
		String mensagem = receptor.recebe();
		System.out.println(mensagem);
	}

}
