package negocio;

public class Gato extends Animal{

	private boolean castrado;
	
	public String castrado () {
		return castrado? "SIM": "NÃO";
		
	}
	
	public void exibir() {
		super.exibir();
		
		System.out.printf("\nCastrado: %s\n",
				castrado ? "sim" : "não"
				);
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}


}
