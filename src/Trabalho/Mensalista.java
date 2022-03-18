package Trabalho;

import Funcionario.Funcionario;

public abstract class Mensalista extends Funcionario {
	
	protected String Nivelcargo;
	protected double valorHora;
	protected String profissao;
	
	
	
	public Mensalista(String nome, String cpf, String departamento, double salario, String nivelcargo, double valorHora,
			String profissao) {
		
		super(nome, cpf, departamento, salario);
		this.Nivelcargo = nivelcargo;
		this.valorHora = valorHora;
		this.profissao = profissao;
	}
	
	public String getNivelcargo() {
		return Nivelcargo;
	}
	public void setNivelcargo(String nivelcargo) {
		Nivelcargo = nivelcargo;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	
	
	
	
}
