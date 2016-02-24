package br.ufg.inf.es.rodaroda;

import java.util.Scanner;

public class Partida {
	Integer jogadores;
	Integer etapas;
	Integer palavrasEtapas;
	Integer girarRoleta;
	
	
	Partida(){
		jogadores = qtdJogadores();
		etapas = qtdEtapas();
		palavrasEtapas = qtdPalavrasPorEtapa();
	}
	
	public Integer getJogadores() {
		return jogadores;
	}

	public void setJogadores(Integer jogadores) {
		this.jogadores = jogadores;
	}

	public Integer getEtapas() {
		return etapas;
	}

	public void setEtapas(Integer etapas) {
		this.etapas = etapas;
	}

	public Integer getPalavrasEtapas() {
		return palavrasEtapas;
	}

	public void setPalavrasEtapas(Integer palavrasEtapas) {
		this.palavrasEtapas = palavrasEtapas;
	}

	public int qtdJogadores() {
		System.out.println("Escolha entre 1, 2 ou 3 jogadores");
		   Scanner qtdJogadoresEntrada = new Scanner(System.in);
		   int qtdJogadores = qtdJogadoresEntrada.nextInt();
	 
	 		if(qtdJogadores > 3 || qtdJogadores <= 0) {
	 			System.out.println("N�o � possivel jogar com "+ qtdJogadores + " jogadores, selecione entre 1, 2 ou 3" );
	 			 qtdJogadores();
	 			 
	 		}else {
	 			if(qtdJogadores == 1) 
	 				System.out.println("Foi selecionado o modulo com  "+ qtdJogadores + " jogador" );
	 			else
	 				System.out.println("Foi selecionado o modulo com  "+ qtdJogadores + " jogadores" );	
	 			
	 		}
	 		return qtdJogadores;
	}
	
	public int qtdEtapas(){
		System.out.println("Escolha a quantidade de etapas da partida.");
		Scanner qtdEtapasEntrada = new Scanner(System.in);
		int qtdEtapas = qtdEtapasEntrada.nextInt();
		if(qtdEtapas > 7 || qtdEtapas <= 0) {
 			System.out.println("N�o � possivel jogar com "+ qtdEtapas + " jogadores, selecione entre 1 e 7 etapas!!" );
 			qtdEtapas();
 			 
 		}else {
 			if(qtdEtapas == 1) 
 				System.out.println("Foi selecionado o modulo com  "+ qtdEtapas + " etapa" );
 			else
 				System.out.println("Foi selecionado o modulo com  "+ qtdEtapas + " etapas" );	
 			
 		}
 		return qtdEtapas;
	}
	
	public int qtdPalavrasPorEtapa(){
		System.out.println("Escolha a quantidade de palavras por etapa");
		Scanner qtdPalavrasEtapasEntrada = new Scanner(System.in);
		int qtdPalavrasEtapas = qtdPalavrasEtapasEntrada.nextInt();
		if(qtdPalavrasEtapas > 7 || qtdPalavrasEtapas <= 0) {
 			System.out.println("N�o � possivel jogar com "+ qtdPalavrasEtapas + " jogadores, selecione entre 1, 2 ou 3" );
 			qtdPalavrasPorEtapa();
 			 
 		}else {
 			if(qtdPalavrasEtapas == 1) 
 				System.out.println("Foi selecionado o modulo com  "+ qtdPalavrasEtapas + " etapa" );
 			else
 				System.out.println("Foi selecionado o modulo com  "+ qtdPalavrasEtapas + " etapas" );
 			}
		return qtdPalavrasEtapas;
	}
	
	public int girarRoleta(){
		Roleta roleta = new Roleta();
		
		return 0;
	}
			  
			  
	public int adivinharPalavra(){
		
		return 0;
	}
}

