package Trabalho;

import java.util.ArrayList;
import java.util.List;

import Folha.FolhaPagamento;
import Funcionario.Funcionario;
import Validacao.ExcecaoNaoPodeSerNulo;
import Validacao.ExcecaoTamanhoMinimo;
import Validacao.ExcecaoValorMinimo;
import Validador.Validador;

public class Horista extends Funcionario {
	
	public static final double VALOR_MINIMO = 1;
	public static final int MENOR_VALOR_ID = 1;
	
	private double valor;
	private int horasTrabalhadas;
	private Long id;
	
	private List<FolhaPagamento>holorite = new ArrayList<>();

	
	public Horista(Long id ,String nome, String cpf, String departamento, double valor, int horasTrabalhadas
			) throws ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo, ExcecaoValorMinimo {
		super(nome, cpf, departamento);
		
		setValor(valor);
		setHorasTrabalhadas(horasTrabalhadas);
		setId(id);
		
	}

	public Horista(String nome, String cpf, String departamento, double valor, int horasTrabalhadas)
			throws ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo, ExcecaoValorMinimo{
		super(nome, cpf, departamento);
		
		setValor(valor);
		setHorasTrabalhadas(horasTrabalhadas);

	}

	@Override
	public double calcularSalario() {
		
		return this.valor * this.horasTrabalhadas;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) throws ExcecaoValorMinimo {
		this.valor = Validador.ExcecaoValorMinimo(valor, VALOR_MINIMO, "valor");
	}
	
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	
	public void setHorasTrabalhadas(int horasTrabalhadas) throws ExcecaoValorMinimo {
		this.horasTrabalhadas = Validador.ExcecaoValorMinimo(horasTrabalhadas, VALOR_MINIMO, "horasTrabalhadas");
	}

	public List<FolhaPagamento> getHolorite() {
		return holorite;
	}

	public void setFolhaPagamento(List<FolhaPagamento> holorite) {
		this.holorite = holorite;
		
	}
	
	public void addFolhaPagamento(FolhaPagamento folha) {
		
		holorite.add(folha);
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

	public void setId(Long id) throws ExcecaoTamanhoMinimo {
		this.id = Validador.ExcecaoTamanhoMinimo(id, MENOR_VALOR_ID, "id");
	}
	
	

	
}
