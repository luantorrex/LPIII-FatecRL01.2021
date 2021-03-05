package negocio;

public class Carro extends Veiculo {
	private int quantidadePortas;
	
	public Carro(String nome, String fabricante, int ano, int quantidadePortas) {
		super(nome, fabricante, ano);
		this.quantidadePortas = quantidadePortas;
	}
	
	@Override
	public void acelerar() {
		velocidade += 10;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}
	
}
