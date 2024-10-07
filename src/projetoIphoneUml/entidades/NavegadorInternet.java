package projetoIphoneUml.entidades;

public class NavegadorInternet {

	private String pagina;

	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}
	
	public void exibirPagina(String pagina) {
		System.out.println("Acessando url página: "+ pagina);
	}
	
	public void adicionarNovaAba() {
		System.out.println("Criando nova aba de pesquisa!");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando página...");
	}
}
