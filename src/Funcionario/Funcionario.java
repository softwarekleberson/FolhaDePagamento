package Funcionario;

public abstract class Funcionario extends Pessoa {
	
	protected String departamento;
	protected double salario;
	
	public Funcionario(String nome, String cpf, String departamento, double salario) {
		super(nome, cpf);
		this.departamento = departamento;
		this.salario = salario;
	}
	
	public abstract double calcularSalario();	

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
}
