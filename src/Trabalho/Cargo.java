package Trabalho;

import java.util.ArrayList;
import java.util.List;

import Folha.FolhaPagamento;
import Validacao.ExcecaoNaoPodeSerNulo;
import Validacao.ExcecaoTamanhoMinimo;
import Validacao.ExcecaoValorMinimo;
import Validador.Validador;

public class Cargo extends Mensalista {
	
	public static final int MENORID = 1;
	public static final double SALARIO_MINIMO = 1245;
	
	private double salario;
	private Long id;
	
	private List<FolhaPagamento>holorite = new ArrayList<>();
	
	
	public Cargo(Long id, String nome, String cpf, String departamento, String nivelcargo, double valorHora, String profissao,
			int horasTrabalhadas) throws ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo, ExcecaoValorMinimo {
		super(nome, cpf, departamento, nivelcargo, valorHora, profissao, horasTrabalhadas);
		setId(id);
	}
	
	

	public Cargo(String nome, String cpf, String departamento, String nivelcargo, double valorHora, String profissao,
			int horasTrabalhadas) throws ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo, ExcecaoValorMinimo {
		super(nome, cpf, departamento, nivelcargo, valorHora, profissao, horasTrabalhadas);
	}



	@Override
	public double calcularSalario() {
		return this.salario = this.valorHora * this.horasTrabalhadas;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
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
		
	public Long getId() {
		return id;
	}

	public void setId(Long id)throws ExcecaoTamanhoMinimo {
		this.id = Validador.ExcecaoTamanhoMinimo(id, MENORID, "id");
	}

	public int countHolorite() {
		return holorite.size();
	}
	
	public FolhaPagamento getHolorite(int i) {
		return holorite.get(i);
	}
	
	
}
