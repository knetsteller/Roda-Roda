package br.ufg.inf.es.rodaroda;

import java.util.Scanner;

/**
 * Classe correspondente a um jogador.
 */
public class Jogador {

    private String nomeJogador;
    private Roleta roleta = new Roleta();
    private EstrategiaSorteio modoSorteio;
    int pontuacao;

    Jogador(String nome, EstrategiaSorteio estrategia) {
        
        nomeJogador = nome;
        modoSorteio = estrategia;
        pontuacao = 0;
    }

    public String getNome() {
        return nomeJogador;
    }

    public void setNome(String nome) {
        this.nomeJogador = nome;
    }
    
    /**
     * Lê a letra sugerida pelo jogador.
     * @return uma string correspondente à letra sugerida pelo jogador
     */
    public String apostaLetra() {
        System.out.println("\n\nQual letra?");
        Scanner leitor = new Scanner(System.in);
        String aposta;
        aposta = leitor.nextLine();
        
        return aposta;
    }
    
    public void atualizaPontuacao(int pontosGanhos) {
        pontuacao += pontosGanhos;
    }
    
    /**
     * Executa um sorteio de um resultado na roleta.
     * @return um inteiro correspondente ao resultado gerado pelo sorteio
     */
    public int rodaARoleta() {
        return modoSorteio.geraSorteio();
    }
    
    public void retiraTodaPontuacao() {
        pontuacao = 0;
    }
    
    public int getPontuação() {
        return pontuacao;
    }
}
