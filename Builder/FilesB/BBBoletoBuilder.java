package FilesB;

import java.util.Calendar;

public class BBBoletoBuilder implements BoletoBuilder {

	private String sacado;
	private String cedente;
	private double valor;
	private Calendar vencimento;
	private int nossoNumero;

	public void buildSacado(String sacado) {
		this.sacado = sacado;
	}

	public void buildCedente(String cedente) {
		this.cedente = cedente;
	}

	public void buildValor(double valor) {
		this.valor = valor;
	}

	public void buildVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
	}

	public void buildNossoNumero(int nossoNumero) {
		this.nossoNumero = nossoNumero;
	}

	public Boleto getBoleto() {
		return new BBBoleto(sacado, cedente, valor, vencimento, nossoNumero);
	}

	@Override
	public void buildCodigoDeBarras() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildLogotipo() {
		// TODO Auto-generated method stub
		
	}
}
