package Funcionario;

import Validacao.ExcecaoNaoPodeSerNulo;
import Validacao.ExcecaoTamanhoMinimo;
import Validador.Validador;

public abstract class Pessoa {
	
	public static final int TAMANHO_MINIMO_NOME = 3;
	public static final int TAMANHO_MINIMO_STRING = 11;
	
	protected String nome;
	protected String cpf;
	
	public Pessoa(String nome, String cpf)throws ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo {
		
		setNome(nome);
		setCpf(cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo{
		this.nome = Validador.ExcecaoTamanhoMinimo(Validador.ExcecaoNaoPodeSerNulo(nome, "nome"), TAMANHO_MINIMO_NOME, "nome");
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) throws ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo {
		this.cpf = Validador.ExcecaoTamanhoMinimo(Validador.ExcecaoNaoPodeSerNulo(cpf, "cpf"), TAMANHO_MINIMO_STRING, "cpf");
	}
	
	
	
}
