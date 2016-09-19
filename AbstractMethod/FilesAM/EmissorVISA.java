package FilesAM;

public class EmissorVISA implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando VISA !!!");
		System.out.println(mensagem);
	}

}
