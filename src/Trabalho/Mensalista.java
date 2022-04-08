package Trabalho;

import Funcionario.Funcionario;
import Validacao.ExcecaoNaoPodeSerNulo;
import Validacao.ExcecaoTamanhoMinimo;
import Validacao.ExcecaoValorMinimo;
import Validador.Validador;

public abstract class Mensalista extends Funcionario {
	
	public static final int MENOR_VALOR_STRING = 3;
	public static final int MENOR_VALOR = 0;
	
	protected String nivelcargo;
	protected double valorHora;
	protected String profissao;
	protected int horasTrabalhadas;
	
	public Mensalista(String nome, String cpf, String departamento, String nivelcargo, double valorHora, String profissao,
			int horasTrabalhadas)throws ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo, ExcecaoValorMinimo {
		
		super(nome, cpf, departamento);
		
		setNivelcargo(nivelcargo);
		setValorHora(valorHora);
		setProfissao(profissao);
		setHorasTrabalhadas(horasTrabalhadas);
	}
	
	
	public String getNivelcargo() {
		return nivelcargo;
	}
	
	public void setNivelcargo(String nivelcargo) throws  ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo {
		this.nivelcargo = Validador.ExcecaoTamanhoMinimo(Validador.ExcecaoNaoPodeSerNulo(nivelcargo, "nivelcargo"),MENOR_VALOR_STRING, "nivelcargo");
	}
	
	public double getValorHora() {
		return valorHora;
	}
	
	public void setValorHora(double valorHora)throws ExcecaoValorMinimo {
		this.valorHora = Validador.ExcecaoValorMinimo(valorHora, MENOR_VALOR , "valorHora");
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) throws  ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo  {
		this.profissao = Validador.ExcecaoTamanhoMinimo(Validador.ExcecaoNaoPodeSerNulo(profissao, "profissao"), MENOR_VALOR_STRING, "profissao");
	}
	
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	
	public void setHorasTrabalhadas(int horasTrabalhadas)throws ExcecaoValorMinimo {
		this.horasTrabalhadas = Validador.ExcecaoValorMinimo(horasTrabalhadas, MENOR_VALOR, "horasTrabalhadas");
	}
	
}
