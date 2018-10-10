package negocio;

public class Cachorro extends Animal {
	private String raca;
	private Caracteristica caracteristica;
	
	public void exbir() {
		super.exibir();
		
		caracteristica.exibir();
		System.out.print(raca+"\n");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Caracteristica getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	
}
