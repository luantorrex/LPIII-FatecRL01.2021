package negocio;

public class Moto extends Veiculo {
	
	public Moto(String nome, String fabricante, int ano) {
		super(nome, fabricante, ano);
	}

	boolean descansoAcionado;
	
	@Override
	public void acelerar() {
		super.acelerar();
		this.descansoAcionado = false;
	}
	
	@Override
	public void desacelerar() {
		super.desacelerar();
		descansoAcionado = (velocidade == 0);
	}
	
	@Override
	public void parar() {
		super.parar();
		this.descansoAcionado = true;
	}

	public boolean isDescansoAcionado() {
		return descansoAcionado;
	}
	

}
