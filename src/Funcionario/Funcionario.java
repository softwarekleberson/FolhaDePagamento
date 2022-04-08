package Funcionario;

import Validacao.ExcecaoNaoPodeSerNulo;
import Validacao.ExcecaoTamanhoMinimo;
import Validacao.ExcecaoValorMinimo;
import Validador.Validador;

public abstract class Funcionario extends Pessoa {
	
	public static final int TAMANHO_MINIMO_STRING = 3;
	
	protected String departamento;
	
	public Funcionario(String nome, String cpf, String departamento) 
			throws  ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo, ExcecaoValorMinimo {
		
		super(nome, cpf);
		setDepartamento(departamento);
	}
	
	public abstract double calcularSalario();	

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) throws ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo {
		this.departamento = Validador.ExcecaoTamanhoMinimo(Validador.ExcecaoNaoPodeSerNulo(departamento, "departamento"), TAMANHO_MINIMO_STRING,"departamento");
	}
	
	
	
}
