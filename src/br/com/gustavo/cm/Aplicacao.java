package br.com.gustavo.cm;

import br.com.gustavo.cm.modelo.Tabuleiro;
import br.com.gustavo.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro);
	}
}
