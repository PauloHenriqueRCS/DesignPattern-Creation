package FilesAM;


public class MastercardComunicadorFactory implements ComunicadorFactory {


	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();

	public Emissor createEmissor() {
		return this.emissorCreator.create(EmissorCreator.MASTERCARD);
	}

	public Receptor createReceptor() {
		return this.receptorCreator.create(ReceptorCreator.MASTERCARD);
	}

}
