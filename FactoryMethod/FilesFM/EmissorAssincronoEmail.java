package FilesFM;



public class EmissorAssincronoEmail implements Emissor {

	@Override
	public void envia(String mensagem) {
		// TODO Auto-generated method stub
		System.out.println(" Enviando por EMAIL mensagem : ");
		System.out.println( mensagem );

	}

}
