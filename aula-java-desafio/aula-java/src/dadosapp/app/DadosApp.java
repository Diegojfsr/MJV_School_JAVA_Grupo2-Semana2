package dadosapp.app;

import java.util.List;

import dadosapp.model.Informacoes;
import dadosapp.util.LeitorInformacoes;

public class DadosApp {
	public static void main(String[] args) {
		LeitorInformacoes leitor = new LeitorInformacoes();
		
		List<Informacoes> informacoes = leitor.converter("C:\\estudo\\informacoes\\informacoes.csv");
	
		for(Informacoes i: informacoes) {
			System.out.println(i);
		}
	}
}
