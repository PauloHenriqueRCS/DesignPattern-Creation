package FilesFM;


public class EmissorAssincronoSMS implements Emissor {

	@Override
	public void envia(String mensagem) {
		// TODO Auto-generated method stub	public void envia (String mensagem){
		System.out.println(" Enviando por SMS a mensagem : ");
		System.out.println( mensagem );

	}

}
