package Principal;

import Folha.FolhaPagamento;
import Trabalho.Cargo;
import Trabalho.Empreitada;
import Trabalho.Horista;
import Validacao.ExcecaoNaoPodeSerNulo;
import Validacao.ExcecaoTamanhoMinimo;
import Validacao.ExcecaoValorMinimo;

public class Main {
	public static void main(String[] args) {
		
		
		try {
			
			Horista h1 = new Horista("Fernando Jones", "400.351.852.40", "Desenvolvimento", 12, 90);
			Empreitada e1 = new Empreitada("Amanda", "201.074.632.90", "Financeiro", 80.600, "Andar 20");
			Empreitada emp = new Empreitada("carlos", "123.753.096.38", "Diretoria", 15.800, "sala 1");
			Cargo c1 = new Cargo("Cleusa", "195.750.300.20", "Almocharifado", "Senior", 8, "Fachineiro", 60);
			Horista h2 = new Horista("Hector", "111.285.465.01", "Diretoria", 40, 100);
			
			FolhaPagamento folha = new FolhaPagamento();
			folha.addHorista(h1);
			folha.addEmpreitada(e1);
			folha.addEmpreitada(emp);
			folha.addCargo(c1);
			folha.addHorista(h2);
			
			System.out.println(folha.informacoesEmpreentada());
			System.out.println(folha.informacoesHorista());
			System.out.println(folha.informacoesCargo());
			
		}catch (ExcecaoValorMinimo | ExcecaoNaoPodeSerNulo | ExcecaoTamanhoMinimo e) {
			String mensagem = e.getMessage();
			System.out.println(mensagem);
		}
		
	
		
	}
	
	
}
	
	
