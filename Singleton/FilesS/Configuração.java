package FilesS;

import java.util.*;

public class Configuração {

	private Map<String, String> propriedades;
	private static Configuração instance;

	private Configuração () {
	 this . propriedades = new HashMap < String , String >() ;
	 this . propriedades . put ("time - zone ", " America / Sao_Paulo ") ;
	 this . propriedades . put (" currency - code ", " BRL ") ;
	 }

	public static Configuração getInstance() {
		if (Configuração.instance == null) {
			Configuração.instance = new Configuração();
		}
		return Configuração.instance;
	}

	public String getPropriedade(String nomeDaPropriedade) {
		return this.propriedades.get(nomeDaPropriedade);
	}
}
