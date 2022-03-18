package Trabalho;

import java.util.ArrayList;
import java.util.List;

import Funcionario.Funcionario;
import Holorite.Holorite;

public class Empreitada extends Funcionario{
	
	private double valorEmpreitada;
	private String localConserto;
	private List<Holorite> holorite = new ArrayList<>();

	public Empreitada(String nome, String cpf, String departamento, double salario, double valorEmpreitada,
			String localConserto) {
		super(nome, cpf, departamento, salario);
		this.valorEmpreitada = valorEmpreitada;
		this.localConserto = localConserto;
	}
	

	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub
		
	}

	public double getValorEmpreitada() {
		return valorEmpreitada;
	}

	public void setValorEmpreitada(double valorEmpreitada) {
		this.valorEmpreitada = valorEmpreitada;
	}

	public String getLocalConserto() {
		return localConserto;
	}

	public void setLocalConserto(String localConserto) {
		this.localConserto = localConserto;
	}


	public List<Holorite> getHolorite() {
		return holorite;
	}


	public void setHolorite(List<Holorite> holorite) {
		this.holorite = holorite;
	}
	
	
	
}
