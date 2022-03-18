package Holorite;

import Trabalho.Cargo;
import Trabalho.Empreitada;
import Trabalho.Horista;

public class Holorite {	
	
	private Horista horista;
	private Cargo cargo;
	private Empreitada empreitada;

	public Holorite(Horista horista) {	
		this.horista = horista;
	}
 
	public Horista getHorista() {
		return horista;
	}

	public void setHorista(Horista horista) {
		this.horista = horista;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Empreitada getEmpreitada() {
		return empreitada;
	}

	public void setEmpreitada(Empreitada empreitada) {
		this.empreitada = empreitada;
	}
	
	
}
