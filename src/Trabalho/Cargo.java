package Trabalho;

import java.util.ArrayList;
import java.util.List;

import Holorite.Holorite;

public class Cargo extends Mensalista {
	
	private List<Holorite>holorite = new ArrayList<>();
		
	public Cargo(String nome, String cpf, String departamento, double salario, String nivelcargo, double valorHora,
			String profissao) {
		super(nome, cpf, departamento, salario, nivelcargo, valorHora, profissao);
	}

	@Override
	public double calcularSalario() {
		return getSalario();
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
