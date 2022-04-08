package Folha;

import java.util.ArrayList;
import java.util.List;

import Trabalho.Cargo;
import Trabalho.Empreitada;
import Trabalho.Horista;

public class FolhaPagamento {	
	
	private List<Horista> horista = new ArrayList<>();
	private List<Cargo> cargo = new ArrayList<>();
	private List <Empreitada> empreitada = new ArrayList<>();
	
	public String informacoesCargo() {
		
		String folha = "Folha de pagamento ";
		for (Cargo cargos : cargo) {
			
			folha += "\n\n";
			folha += String.format("%14s  %30s  %20s  %30s  R$%.2f\n", cargos.getCpf(), cargos.getNome(), 
					cargos.getDepartamento(), cargos.getNivelcargo(), cargos.calcularSalario());
		}
		folha += "\n\n\n\n\n";
		return folha;
		
	}
	
	public String informacoesHorista() {
		
		String folha = "Folha de pagamento ";
		for (Horista horistas : horista) {
			
			folha += "\n\n";
			folha += String.format("%14s  %30s  %20s  R$%.2f\n", horistas.getCpf(), horistas.getNome(), horistas.getDepartamento(),
					horistas.calcularSalario());
		}
		folha += "\n\n\n\n";
		return folha;
		
	}
	
	public String informacoesEmpreentada() {
		
		String folha = "Folha de pagamento ";
		for (Empreitada empreintadas : empreitada) {
			
			folha += "\n\n";
			folha += String.format("%14s   %30s   %20s  %20s  R$%.3f\n", empreintadas.getCpf(), empreintadas.getNome(), empreintadas.getDepartamento(),
					empreintadas.getLocalConserto(), empreintadas.calcularSalario());
			
		}
		folha += "\n\n\n\n";
		return folha;
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
	
	public void addHorista(Horista horistas) {
		horista.add(horistas);	
		
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
