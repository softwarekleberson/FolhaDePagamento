package Principal;

import Holorite.FolhaPagamento;
import Trabalho.Cargo;
import Trabalho.Empreitada;
import Trabalho.Horista;

public class Main {
	public static void main(String[] args) {
		
		Horista horista = new Horista("kleberson", "4380.036.548.40", "mobile", 80, 30);
		Cargo cargo = new Cargo("jose", "030.785.66.10", "Recursos Humanos", "Pleno", 5, 40, "contador");
		Empreitada empreintada = new Empreitada("carlos", "100.090.040", "Diretoria", 15.800, "sala 1");
		Empreitada empreintada2 = new Empreitada("Amanda", "xxx.xxxx.70", "Financeiro", 80.600, "Ardar 60");
		
		
		FolhaPagamento folha = new FolhaPagamento();
		folha.addHorista(horista);
		folha.addCargo(cargo);
		folha.addEmpreitada(empreintada);
		folha.addEmpreitada(empreintada2);
		
		System.out.println(folha.informacoesCargo());
		System.out.println(folha.informacoesHorista());
		System.out.println(folha.informacoesEmpreentada());
		
	}
	
	
}
	
	
