package Tarefa1TecnicasProgramacao;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    public String marca;
	public String placa;
	public double valor;
	
	 public  static  List < Veiculo > Veiculos =  new  ArrayList <> ();
	 
	 public void remove(String placa) {
			
			for( int i=0; i<Veiculos.size(); i++) {
				if(Veiculos.get(i).getPlaca().equals(placa)) {
					Veiculos.remove(i);
				}
			}	
	}
			
		public void adiciona(Veiculo veiculo) {
			
			Veiculos.add(veiculo);      
	}
		
		public Veiculo retorna(String placa) {
			
			for( int i=0; i<Veiculos.size(); i++) {
				if(Veiculos.get(i).getPlaca().equals(placa)) {
					return Veiculos.get(i);
				}
			}
			return null;
		}
		
		public List<Veiculo> retornaLista() { 
			return Veiculos;
		}
		
		public void quantidadeVeiculos(Veiculo v) {
			
			int contador = 0;
			for(int i=0; i<Veiculos.size();i++) {
				if(Veiculos.get(i)!=null)
					contador++;
				System.out.println(contador);
			}
		}
			

	@Override
	public String toString() {
		return "Catalogo [marca=" + marca + ", placa=" + placa + ", valor=" + valor + "]";
	}
	 
}