package Tarefa1TecnicasProgramacao;

public class Carro extends Catalogo implements Veiculo {
	
	public Carro (String placa, String marca, double valor) {
		super.placa= placa;
		super.marca = marca;
		super.valor = valor;
			
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String getMarca() {
	      return marca;
	}

	@Override
	public double getValor() {
        return valor;
	}
}