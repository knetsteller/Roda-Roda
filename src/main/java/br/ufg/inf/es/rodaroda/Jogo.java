package br.ufg.inf.es.rodaroda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe principal da aplicação. Instancia os elementos necessários para um
 * jogo.
 */
public class Jogo implements Subject {

    ArrayList<Jogador> participantes = new ArrayList<>();
    ArrayList<Etapa> etapasDoJogo = new ArrayList<>();
    Roleta roleta;
    int etapas;
    int jogadores;
    int palavras;
    String palavraDaVez;
    ConjuntoPalavras conjuntoPalavras = new ConjuntoPalavras();
    EstrategiaSorteio modoSorteio;
    ObservadorJogo observador;
    ArrayList<ObservadorJogo> observadores = new ArrayList<>();
    Painel painel = new Painel();    
    String letraApostada;
    
    public static void main(String[] args) {
        Jogo j = new Jogo(1, 2, 3, new ResultadoAleatorio());
        j.iniciaJogo(j);
    }

    public int mudaModoSorteio() {
        return modoSorteio.geraSorteio();
    }
    
    public Jogo(int jogadores, int etapas, int palavras, EstrategiaSorteio estrategia) {
        this.etapas = etapas;
        this.jogadores = jogadores;
        this.palavras = palavras;
        this.modoSorteio = estrategia;
    }
    
    /**
     * Instancia os jogodares e atribui-lhes nome.
     * @param quantidade a quantidade de jogadores participantes
     */
    public void apresentaJogadores(int quantidade) {
        int apresentacoes = 0;
        Jogador jogador;
        ResultadoAleatorio resultadoAleatorio = new ResultadoAleatorio();

        while (apresentacoes != quantidade) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ola, apresente-se! Qual seu nome?");
            String nomeJogador = scanner.nextLine();
            jogador = new Jogador(nomeJogador, resultadoAleatorio);
            participantes.add(jogador);
            apresentacoes++;
        }
    }

    /**
     * Verifica os indices correspondentes à palavra escolhida pelo jogador na 
     * palavra sorteada na rodada.
     * @param palavra a palavra sorteada para a rodada atual
     * @param letra a letra escolhida pelo jogador
     * @return um array com os indices em ocorrem a letra escolhida na palavra da rodada     * 
     */
    public int[] retornaIndices(String palavra, String letra) {
        String letraAtual;
        int indices[] = new int[5];
        int posicao = 0;
        int tamanhoPalavra = palavra.length();
        int i, j;
        
        for (j = 0; j < indices.length; j++) {
            indices[j] = -1;
        }

        for (i = 0; i < tamanhoPalavra; i++) {
            letraAtual = "" + palavra.charAt(i);
            if (letra.equals(letraAtual)) {
                indices[posicao++] = i;
            }
        }
        
        return indices;
    }
    
    public void atualizaLetrasRestantes(int restantes, int[] lista) {
        int i;
        int letraRestantes = 0;
        for (i = 0; i < lista.length; i++) {
            if (lista[i] == -1) {
                letraRestantes--;
            }
        }
    }
    
    /**
     * Instancia os elementos para executar um jogo.
     * @param jogo objeto correspondente a um jogo
     */
    public void iniciaJogo(Jogo jogo) {
        
        apresentaJogadores(jogo.jogadores);
        Jogador jogadorAtual;
        int vezDoJogador = 0;        
        int valorAtual;
        int etapasRestantes = jogo.etapas;
        palavraDaVez = conjuntoPalavras.geraPalavra();
        int letrasNaPalavra = palavraDaVez.length();
        boolean acertouLetra = true;
        registraObservador(painel);

        while (etapasRestantes >= 0) {

            while (letrasNaPalavra >= 0) {
                jogadorAtual = participantes.get(vezDoJogador);
                acertouLetra = true;                

                while (acertouLetra != false) {
                    System.out.println("Roda a Roda " + jogadorAtual.getNome() + "!");
                    valorAtual = jogadorAtual.rodaARoleta();
                    if (valorAtual == -1) {
                        System.out.println(jogadorAtual.getNome() + " PERDEU TUDO!");
                        jogadorAtual.retiraTodaPontuacao();
                        
                        if ((vezDoJogador + 1) < jogo.jogadores) {
                            vezDoJogador++;
                        } else {
                            vezDoJogador = 0;
                        }
                        break;
                    } else if (valorAtual == 0) {
                        System.out.println("PASSA A VEZ, " + jogadorAtual.getNome() + "!");
                        
                        if ((vezDoJogador + 1) < jogo.jogadores) {
                            vezDoJogador++;
                        } else {
                            vezDoJogador = 0;
                        }
                        break;
                    }
                    
                    letraApostada = jogadorAtual.apostaLetra();
                    if (palavraDaVez.contains(letraApostada)) {
                        atualizaLetrasRestantes(letrasNaPalavra, 
                                retornaIndices(palavraDaVez, letraApostada));
                        notificaObservador();
                        painel.exibePalavraOculta();
                        jogadorAtual.atualizaPontuacao(valorAtual);
                    } else {
                        acertouLetra = false;
                        if ((vezDoJogador + 1) < jogo.jogadores) {
                            vezDoJogador++;
                        } else {
                            vezDoJogador = 0;
                        }
                    }
                }
            }
            etapasRestantes--;
        }
    }

    @Override
    public void registraObservador(ObservadorJogo o) {
        observadores.add(o);
    }

    @Override
    public void removeObservador(ObservadorJogo o) {
    }

    @Override
    public void notificaObservador() {
        for(ObservadorJogo ob : observadores){
             
            ob.atualizaPalavraOculta(palavraDaVez, retornaIndices(palavraDaVez, letraApostada));             
        }
    }
}
