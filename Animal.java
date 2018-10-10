package negocio;

public abstract class Animal {

		private String nome;
		private String[] donos;
		private int idade;

			
		public void exibir() {
			System.out.printf(
					"Nome: %s\n"
				+ "idade: %d\n\n",
				  nome,
 				  idade
				);
			this.exibirDonos();
			
			
	}
		private void exibirDonos() {
			 System.out.println("Donos: ");
			 
			 for (String nome: donos) {
					System.out.printf("%s ", nome);			
			 }
		}

		public String[] getDonos() {
			return donos;
		}
		public void setDonos(String[] donos) {
			this.donos = donos;
		}
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}


		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public Gato getGato() {
			return gato;
		}

		public void setGato(Gato gato) {
			this.gato = gato;
		}
}
