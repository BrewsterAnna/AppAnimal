package negocio;

public class Gato extends Animal{

	private boolean castrado;
	
	public String castrado () {
		return castrado? "SIM": "N�O";
		
	}
	
	public void exibir() {
		super.exibir();
		
		System.out.printf("\nCastrado: %s\n",
				castrado ? "sim" : "n�o"
				);
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}


}
