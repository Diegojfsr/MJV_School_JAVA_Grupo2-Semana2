package dadosapp.util;

import dadosapp.model.Informacoes;

public class TransacaoPrint {
    public void imprimir(Informacoes informacoes){

        StringBuilder cupom = new StringBuilder();

        cupom.append("----------------------------- FICHA PROFISSIONAL -----------------------------\n");
		

        cupom.append("PROFISSAO:" + informacoes.getProfissao() + "\n");
        cupom.append("NOME:" + informacoes.getNome() + "\n");
        cupom.append("DATA NASC.:" + informacoes.getDataNascimento() + "\n");
        cupom.append("CPF:" + informacoes.getCpf() + "\n");
        

        cupom.append("----------------------------- SALARIO REQUERIDO -----------------------------\n");
        cupom.append("MINIMO:" + informacoes.getSalarioMinimo() + "\n");
        cupom.append("MAXIMO:" + informacoes.getSalarioMaximo() + "\n");
        cupom.append("MINIMO:" + informacoes.getSalarioMinimo() + "\n");

        cupom.append("----------------------------- GRAU DE INSTRUÇÃO-----------------------------\n");
        cupom.append("Analfabeto			Ensino Fundamental		Superior\n");
        cupom.append("Le e Escreve			Ensino Medio Incompleto		Mestrado\n");
        cupom.append("Fundamental Incompleto		Ensino Medio Completo		Doutorado\n");




        System.out.println(cupom);
    }
}
