package FilesAM;


public class VisaComunicadorFactory implements ComunicadorFactory {

	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();

	public Emissor createEmissor() {
		return this.emissorCreator.create(EmissorCreator.VISA);
	}

	public Receptor createReceptor() {
		return this.receptorCreator.create(ReceptorCreator.VISA);
	}

}
