package TesteS;

import FilesS.Configuração;

public class TestaSingleton {

	public static void main(String[] args) {
		Configuração configuracao = Configuração.getInstance();
		System.out.println(configuracao.getPropriedade("time - zone "));
		System.out.println(configuracao.getPropriedade(" currency - code "));
	}
}
