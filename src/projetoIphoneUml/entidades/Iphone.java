package projetoIphoneUml.entidades;

public class Iphone {

	private String modelo;
	private int armazenamento;
	private String cor;
	private String processador;
	private String MEI;

	private ReprodutorMusical reprodutorMusical;
	private AparelhoTelefonico aparelhoTelefonico;
	private NavegadorInternet navegadorInternet;

	public Iphone(String modelo, int armazenamento, String cor, String processador, String mEI) {
		this.modelo = modelo;
		this.armazenamento = armazenamento;
		this.cor = cor;
		this.processador = processador;
		this.MEI = mEI;
		this.reprodutorMusical = new ReprodutorMusical();
		this.aparelhoTelefonico = new AparelhoTelefonico();
		this.navegadorInternet = new NavegadorInternet();
	}

	@Override
	public String toString() {
		return "Iphone [modelo=" + modelo + ", armazenamento=" + armazenamento + ", cor=" + cor + ", processador="
				+ processador + ", MEI=" + MEI + "]";
	}

	public ReprodutorMusical getReprodutorMusical() {
		return reprodutorMusical;
	}

	public NavegadorInternet getNavegadorInternet() {
		return navegadorInternet;
	}

	public AparelhoTelefonico getAparelhoTelefonico() {
		return aparelhoTelefonico;
	}

}
