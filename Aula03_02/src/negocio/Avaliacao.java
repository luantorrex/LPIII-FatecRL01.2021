package negocio;

public class Avaliacao implements IMedia, IPresenca {
	
	float mediaFinal, percentualPresenca;
	boolean aprovado;
	
	@Override
	public void calcularPercentual(float totalAulas, float qtdePresencas) {
		percentualPresenca = (qtdePresencas /  totalAulas) * 100;
	}

	@Override
	public void calcular(float p1, float p2, float p3) {
		mediaFinal = (p1 + p2 + p3) / 3;
	}
	
	public boolean getAprovado(){
		if (mediaFinal >= 6 && percentualPresenca >= 75) {aprovado = true;}
		else {aprovado = false;}
		return aprovado;
	}
	
}
