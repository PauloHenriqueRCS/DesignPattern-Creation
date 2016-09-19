package FilesAM;

public class CreateFactory {
	
	public ComunicadorFactory create (Cartao cartao){
		if (cartao.bandeira == "VISA"){
			return new VisaComunicadorFactory();
		} else if (cartao.bandeira == "MASTERCARD"){
			return new MastercardComunicadorFactory();
		}else {
			throw new RuntimeException ("Tipo de emissor não suportado");
		}
	}

}
