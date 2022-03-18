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
	public double calcularSalario() {
		return this.salario = getValorEmpreitada();
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
