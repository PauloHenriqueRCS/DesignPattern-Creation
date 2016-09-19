package TesteFM;

import FilesFM.*;

public class TestaEmissores {

	public static void main(String args[]) {
		
		 EmissorCreator creator = new EmissorCreator () ;


		// SMS
		Emissor emissor1 = creator.create(EmissorCreator.SMS);
		emissor1.envia("Emissor Creator");
		// SMS Sincrono
		Emissor emissor11 = creator.create(EmissorSincronoCreator.SMS);
		emissor11.envia("Emissor Sincrono Creator");
		// SMS Assincrono
		Emissor emissor111 = creator.create(EmissorAssincronoCreator.SMS);
		emissor111.envia("Emissor Assincrono Creator");

		// Email
		Emissor emissor2 = creator.create(EmissorCreator.EMAIL);
		emissor2.envia("Emissor Creator");
		// Email Sincrono
		Emissor emissor22 = creator.create(EmissorSincronoCreator.EMAIL);
		emissor22.envia("Emissor Sincrono Creator");
		// Email Assincrono
		Emissor emissor222 = creator.create(EmissorAssincronoCreator.EMAIL);
		emissor222.envia("Emissor Assincrono Creator");

		// JMS
		Emissor emissor3 = creator.create(EmissorCreator.JMS);
		emissor3.envia("Emissor Creator");
		// JMS Sincrono
		Emissor emissor33 = creator.create(EmissorSincronoCreator.JMS);
		emissor33.envia("Emissor Sincrono Creator");
		// JMS Assincrono
		Emissor emissor333 = creator.create(EmissorAssincronoCreator.JMS);
		emissor333.envia("Emissor Assincrono Creator");

		
		
	}

}
