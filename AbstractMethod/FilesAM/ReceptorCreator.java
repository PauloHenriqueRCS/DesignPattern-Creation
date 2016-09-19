package FilesAM;

public class ReceptorCreator {
	
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;
	

	public Receptor create(int tipoDeReceptor) {
		
		if (tipoDeReceptor == ReceptorCreator.VISA) {
			return new ReceptorVISA();
		} else if (tipoDeReceptor == ReceptorCreator.MASTERCARD) {
			return new ReceptorMASTERCARD();
		} else {
			throw new IllegalArgumentException("Tipo de receptor não suportado");
		}
	}
}



