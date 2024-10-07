package projetoIphoneUml.entidades;

public class ReprodutorMusical {

	private String musica;

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}
	
	public void tocar() {
		System.out.println("Tocando musica: " + musica);
	}
	
	public void pausar() {
		System.out.println("Música pausada!");
	}
	
	public String selecionarMusica(String musica) {
		return "Música selecionada: "+ musica;
	}
	
}
