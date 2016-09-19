package TesteP;

import java.util.*;

import FilesP.Campanha;

public class TestClone {

	public static void main(String[] args) {

		String nome = "K19";

		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);

		Set<String> hashSet = new HashSet<String>();

		hashSet.add(" curso ");
		hashSet.add(" java ");
		hashSet.add(" k19");

		Campanha campanha = new Campanha(nome, vencimento, hashSet);
		System.out.println(campanha);

		Campanha campanha2 = campanha.clone();
		System.out.println(campanha2);
		
		Campanha campanha3 = campanha.clone();
		System.out.println(campanha3);

	}
}
