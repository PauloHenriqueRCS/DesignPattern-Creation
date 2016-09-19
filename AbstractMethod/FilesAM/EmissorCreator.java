package FilesAM;


public class EmissorCreator {

	public static final int VISA = 0;
	public static final int MASTERCARD = 1;
	

	public Emissor create(int tipoDeEmissor) {
		
		if (tipoDeEmissor == EmissorCreator.VISA) {
			return new EmissorVISA();
		} else if (tipoDeEmissor == EmissorCreator.MASTERCARD) {
			return new EmissorMASTERCARD();
		} else {
			throw new IllegalArgumentException("Tipo de emissor não suportado");
		}
	}
}



