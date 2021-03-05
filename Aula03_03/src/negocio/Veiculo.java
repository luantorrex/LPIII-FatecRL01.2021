package negocio;

public abstract class Veiculo {
	private final int VELOCIDADE_MAXIMA = 270;
	
	private String nome, fabricante;
	private int ano;
	protected int velocidade;
	
	public Veiculo(String nome, String fabricante, int ano) {
		this.ano = ano;
		this.fabricante = fabricante;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public int getAno() {
		return ano;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void acelerar() {
		this.velocidade += 5;
		limitarVelocidade();
	}
	
	public void desacelerar() {
		this.velocidade -= 5;
	}
	
	public void parar() {
		this.velocidade = 0;
	}
	
	public String informarSituacao() {
		return String.format("Veiculo: %s | Velocidade: %d km/h", nome, velocidade);
	}
	
	public void limitarVelocidade() {
		if (velocidade > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		}
	}
	
}
