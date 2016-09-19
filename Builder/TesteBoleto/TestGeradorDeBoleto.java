package TesteBoleto;

import FilesB.BBBoletoBuilder;
import FilesB.Boleto;
import FilesB.BoletoBuilder;
import FilesB.GeradorDeBoleto;

public class TestGeradorDeBoleto {

	public static void main(String[] args) {
		BoletoBuilder boletoBuilder = new BBBoletoBuilder();
		GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
		Boleto boleto = geradorDeBoleto.geraBoleto();
		System.out.println(boleto);
	}
}
