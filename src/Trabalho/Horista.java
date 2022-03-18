package Trabalho;

import java.util.ArrayList;
import java.util.List;

import Funcionario.Funcionario;
import Holorite.Holorite;

public class Horista extends Funcionario {
	
	private double valor;
	private double horas;
	
	private List<Holorite>holorite = new ArrayList<>();
	
	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub
		
	}

	public Horista(String nome, String cpf, String departamento, double salario, double valor, double horas) {
		super(nome, cpf, departamento, salario);
		this.valor = valor;
		this.horas = horas;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public List<Holorite> getHolorite() {
		return holorite;
	}

	public void setHolorite(List<Holorite> holorite) {
		this.holorite = holorite;
	}
	
	
	
}
