package Trabalho;

import java.util.ArrayList;
import java.util.List;

import Funcionario.Funcionario;
import Holorite.Holorite;

public class Horista extends Funcionario {
	
	private double valor;
	private double horas;
	private int horasTrabalhadas;
	
	private List<Holorite>holorite = new ArrayList<>();
	
	@Override
	public double calcularSalario() {
		 this.salario = this.valor / this.horas * this.horasTrabalhadas;
		 return this.salario;
	}

	public Horista(String nome, String cpf, String departamento, double salario, double valor, double horas, int horasTrabalhadas ) {
		super(nome, cpf, departamento, salario);
		this.valor = valor;
		this.horas = horas;
		this.horasTrabalhadas = horasTrabalhadas;
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
	
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public List<Holorite> getHolorite() {
		return holorite;
	}

	public void setHolorite(List<Holorite> holorite) {
		this.holorite = holorite;
	}
	
	public void addHolorite(Holorite obj) {
		holorite.add(obj);
	}
	
	public void removeHolorite(Holorite obj) {
		holorite.remove(obj);
	}
	
	public int countHolorite() {
		return holorite.size();
	}
	
	public Holorite getHolorite(int i) {
		return holorite.get(i);
	}
	
}
