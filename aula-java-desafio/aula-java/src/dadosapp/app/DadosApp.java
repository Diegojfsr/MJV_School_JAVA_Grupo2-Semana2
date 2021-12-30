package dadosapp.app;

import java.util.List;

import dadosapp.model.Informacoes;
import dadosapp.util.LeitorInformacoes;

public class DadosApp {
	public static void main(String[] args) {
		LeitorInformacoes leitor = new LeitorInformacoes();
		
		List<Informacoes> informacoes = leitor.converter("C:\\Users\\diego\\OneDrive\\Área de Trabalho\\MJV_School_JAVA_Grupo2-Semana2\\aula-java-desafio\\informacoes\\informacoes.csv");
	
		for(Informacoes i: informacoes) {
			System.out.println(i);
		}
	}
}
