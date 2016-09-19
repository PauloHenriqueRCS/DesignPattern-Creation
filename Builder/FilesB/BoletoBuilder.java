package FilesB;

import java.util.Calendar;

public interface BoletoBuilder {

	void buildSacado(String sacado);

	void buildCedente(String cedente);

	void buildValor(double valor);

	void buildVencimento(Calendar vencimento);

	void buildNossoNumero(int nossoNumero);

	void buildCodigoDeBarras();

	void buildLogotipo();

	Boleto getBoleto();

}
