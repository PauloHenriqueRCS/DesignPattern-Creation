package FilesAM;

public class EmissorMASTERCARD implements Emissor {

	@Override

	public void envia(String mensagem) {
		System.out.println("Enviando MASTERCARD !!!");
		System.out.println(mensagem);
	}

}
