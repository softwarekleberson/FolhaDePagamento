package Holorite;

import java.util.ArrayList;
import java.util.List;

import Trabalho.Cargo;
import Trabalho.Empreitada;
import Trabalho.Horista;

public class Holorite {	
	
	private List<Horista> horista = new ArrayList<>();
	private List<Cargo> cargo = new ArrayList<>();
	private List <Empreitada> empreitada = new ArrayList<>();

	public void informacoes() {
		
	}

	public Holorite(List<Horista> horista, List<Cargo> cargo, List<Empreitada> empreitada) {
		super();
		this.horista = horista;
		this.cargo = cargo;
		this.empreitada = empreitada;
	}

	public List<Horista> getHorista() {
		return horista;
	}

	public void setHorista(List<Horista> horista) {
		this.horista = horista;
	}

	public List<Cargo> getCargo() {
		return cargo;
	}

	public void setCargo(List<Cargo> cargo) {
		this.cargo = cargo;
	}

	public List<Empreitada> getEmpreitada() {
		return empreitada;
	}

	public void setEmpreitada(List<Empreitada> empreitada) {
		this.empreitada = empreitada;
	}
	
	public void addHorista(Horista obj) {
		horista.add(obj);
	}
	
	public void removeHorista(Horista obj){
		horista.remove(obj);
	}
	
	public int countHorista(){
		return horista.size();
	}
	
	public Horista getHorista(int i){
		return horista.get(i);
	}
	
	public void addCargo(Cargo obj) {
		cargo.add(obj);
	}
	
	public void removeCargo(Cargo obj){
		cargo.remove(obj);
	}
	
	public int countCargo(){
		return cargo.size();
	}
	
	public Cargo getCargo(int i){
		return cargo.get(i);
	}

	public void addEmpreitada(Empreitada obj) {
		empreitada.add(obj);
	}
	
	public void removeEmpreitada(Empreitada obj){
		empreitada.remove(obj);
	}
	
	public int countEmpreitada(){
		return empreitada.size();
	}
	
	public Empreitada getEmpreitada(int i){
		return empreitada.get(i);
	}
	
	
}
