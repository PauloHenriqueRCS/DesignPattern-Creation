package FilesFM;


public class EmissorEmail implements Emissor {
	
	public void envia (String mensagem){
		System.out.println(" Enviando por EMAIL a mensagem : ");
		System.out.println( mensagem );
	}
}
