package Trabalho;

import java.util.ArrayList;
import java.util.List;

import Folha.FolhaPagamento;
import Funcionario.Funcionario;
import Validacao.ExcecaoNaoPodeSerNulo;
import Validacao.ExcecaoTamanhoMinimo;
import Validacao.ExcecaoValorMinimo;
import Validador.Validador;

public class Empreitada extends Funcionario{
	
	public static final int TAMANHO_MINIMO_STRING = 3;
	public static final double VALOR_MINIMO_OBRA = 1;
	public static final int MENOR_VALOR_ID = 1;
	
	private String localConserto;
	private double valorEmpreitada;
	private Long id;
	
	private List<FolhaPagamento> holorite = new ArrayList<>();

	
	public Empreitada(Long id, String nome, String cpf, String departamento, String localConserto, double valorEmpreitada)
			throws ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo, ExcecaoValorMinimo {
		
		super(nome, cpf, departamento);
		
		setId(id);
		setLocalConserto(localConserto);
		setValorEmpreitada(valorEmpreitada);

	}

	public Empreitada(String nome, String cpf, String departamento, double valorEmpreitada, String localConserto) 
			throws ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo, ExcecaoValorMinimo {
		
		super(nome, cpf, departamento);
		
		setValorEmpreitada(valorEmpreitada);
		setLocalConserto(localConserto);
		
	}

	@Override
	public double calcularSalario() {
		return getValorEmpreitada();
	}
	
	public double getValorEmpreitada() {
		return valorEmpreitada;
	}

	public void setValorEmpreitada(double valorEmpreitada)throws ExcecaoValorMinimo {
		this.valorEmpreitada = Validador.ExcecaoValorMinimo(valorEmpreitada, VALOR_MINIMO_OBRA, "valorEmpreitada");
	}

	public String getLocalConserto() {
		return localConserto;
	}

	public void setLocalConserto(String localConserto)throws ExcecaoTamanhoMinimo, ExcecaoNaoPodeSerNulo {
		this.localConserto = Validador.ExcecaoTamanhoMinimo(Validador.ExcecaoNaoPodeSerNulo(localConserto, "localConserto"),TAMANHO_MINIMO_STRING, "localConserto");
	}


	public List<FolhaPagamento> getHolorite() {
		return holorite;
	}


	public void setHolorite(List<FolhaPagamento> holorite) {
		this.holorite = holorite;
	}
	
	
	public void addHolorite(FolhaPagamento obj) {
		holorite.add(obj);
	}
	
	public void removeHolorite(FolhaPagamento obj) {
		holorite.remove(obj);
	}
	
	public int countHolorite() {
		return holorite.size();
	}
	
	public FolhaPagamento getHolorite(int i) {
		return holorite.get(i);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id)throws ExcecaoTamanhoMinimo {
		this.id = Validador.ExcecaoTamanhoMinimo(id, MENOR_VALOR_ID, "id");
	}
	
	
	
}
