package dadosapp.app;

import java.util.List;

import dadosapp.model.Informacoes;
import dadosapp.util.LeitorInformacoes;
import dadosapp.util.TransacaoPrint;

public class DadosApp {
	public static void main(String[] args) {
		LeitorInformacoes leitor = new LeitorInformacoes();
		
		List<Informacoes> informacoes = leitor.converter("C:\\Users\\diego\\OneDrive\\Área de Trabalho\\MJV_School_JAVA_Grupo2-Semana2\\aula-java-desafio\\informacoes\\informacoes.csv");
	
        TransacaoPrint printer = new TransacaoPrint();
        printer.imprimir(informacoes.get(1));
		
	}
}
