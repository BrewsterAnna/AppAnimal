package negocio;

public class Caracteristica {
	private float peso;
	private float altura;
	private String cor;
	
	public void exibir () {
		System.out.printf(
			"Peso: %.1f\n"
			  + "altura: %.2f\n"
			  + "cor: %s\n\n",
			  peso,
			  altura,
			  cor
			);
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
