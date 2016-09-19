package FilesAM;

public class ReceptorVISA implements Receptor {

	public String recebe() {

		System.out.println("Recebendo VISA !!!");
		String mensagem = " Mensagem da VISA ";
		return mensagem;
	}
}

