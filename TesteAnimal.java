package testeAnimal;
import negocio.Gato;
import negocio.Urso;
import negocio.Caracteristica;
import negocio.Cachorro;
public class TesteAnimal {

	public static void main(String[] args) {
		String[] donosGato = {"tom", "jerry"};
	
		Gato g  = new Gato();
		
		g.setCastrado(true);
		g.setNome("Felix");
		g.setIdade(5);
		g.setDonos(donosGato);
		g.exibir();
		
		Caracteristica caractUrso = new Caracteristica();
		caractUrso.setAltura(2.3f);
		caractUrso.setCor("Branco");
		caractUrso.setPeso(100);
		
		String[] donosUrso = {"Marsha"};
		
		Urso urso = new Urso();
		urso.setNome("Tobe");
		urso.setIdade(8);
		urso.setDonos(donosUrso);
		urso.setCaracteristica(caractUrso);
		urso.exibir();
		
		Caracteristica caractBela = new Caracteristica();
		caractBela.setAltura(1);
		caractBela.setPeso(3);
		caractBela.setCor("Cinza");
		
		String[]donosBela = {"Gabriel\n"};
		
		Cachorro bela = new Cachorro();
		bela.setNome("Bela");
		bela.setRaca("Pitbull");
		bela.setIdade(6);
		bela.setDonos(donosBela);
		bela.setCaracteristica(caractBela);
		bela.exbir();
		
		Caracteristica caractBola = new Caracteristica();
		caractBola.setAltura(9);
		caractBola.setPeso(5);
		caractBola.setCor("amarelo");
		
		String[]donosBola = {"Fabiana\n"};
		
		Cachorro bola = new Cachorro();
		bola.setNome("Bola");
		bola.setRaca("Pincher");
		bola.setIdade(10);
		bola.setDonos(donosBola);
		bola.setCaracteristica(caractBola);
		bola.exbir();
		
	}

}
