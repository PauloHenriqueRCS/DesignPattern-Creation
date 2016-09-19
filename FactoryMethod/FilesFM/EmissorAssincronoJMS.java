package FilesFM;



public class EmissorAssincronoJMS implements Emissor {

	@Override
	public void envia(String mensagem) {
		// TODO Auto-generated method stub
		System.out.println(" Enviando por SMS a mensagem : ");
		System.out.println( mensagem );

	}

}
