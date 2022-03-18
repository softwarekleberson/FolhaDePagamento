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
	public void calcularSalario() {
		// TODO Auto-generated method stub
		
	}

	public List<Holorite> getHolorite() {
		return holorite;
	}

	public void setHolorite(List<Holorite> holorite) {
		this.holorite = holorite;
	}
	
	
	
}
