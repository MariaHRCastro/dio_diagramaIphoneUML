package projetoIphoneUml.aplicativo;

import projetoIphoneUml.entidades.AparelhoTelefonico;
import projetoIphoneUml.entidades.Iphone;
import projetoIphoneUml.entidades.NavegadorInternet;
import projetoIphoneUml.entidades.ReprodutorMusical;

public class App {

	public static void main(String[] args) {

		Iphone iphone = new Iphone("Iphone 14 Pro Max", 128, "Lilás", "Snapdragon", "9128 28192 2181");
		
		AparelhoTelefonico at = iphone.getAparelhoTelefonico();
		
		at.atender();
		at.ligar();
		at.iniciarCorreioVoz();
		
		System.out.println("-------------------------------------");
		
		ReprodutorMusical rm = iphone.getReprodutorMusical();
		
		rm.setMusica("Jorge e Mateus - Paixão Goiana");
		System.out.println(rm.selecionarMusica(rm.getMusica()));
		rm.tocar();
		rm.pausar();


		System.out.println("-------------------------------------");

		NavegadorInternet ni = iphone.getNavegadorInternet();
		
		ni.adicionarNovaAba();
		ni.exibirPagina("www.gov.br");
		ni.atualizarPagina();
		
	}

}
