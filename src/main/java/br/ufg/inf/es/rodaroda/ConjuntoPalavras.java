package br.ufg.inf.es.rodaroda;

import java.io.IOException;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

/**
 * Classe responsável pela manipulação dos arquivos com as palavras, bem como 
 * o seu sorteio.
 */
public class ConjuntoPalavras implements EstrategiaPalavra {
    
    private static Scanner input;
    private static ArrayList<String> palavrasDoTema = new ArrayList<>();
    
    /**
     * Sorteia uma palavra do arquivo de temas escolhido.
     * @return String correspondente à palavra sorteada.
     */
    @Override
    public String geraPalavra() {
        String palavraGerada;
        
        abreArquivo("cidades");
        lePalavrasNoArquivo();
        palavraGerada = retornaPalavraSorteada(palavrasDoTema);
        fechaArquivo();
        
        return palavraGerada;
    }
    
    /**
     * Abre um arquivo com as palavras do tema escolhido.
     * @param tema tema escolhido para sorteio.
     */
    public static void abreArquivo(String tema) {
        try {
            input = new Scanner(Paths.get("C:\\Users\\Netsteller\\Documents\\NetBeansProjects\\Demos\\src\\demos\\" + tema + ".txt"));
        } catch (IOException iOException) {
            System.err.println("Error opening file.Terminating.");
            System.exit(1);
        }
    }
    
    /**
     * Resgata palavras no arquivo e as coloca numa lista.
     */
    public static void lePalavrasNoArquivo() {
        
        try {
                while (input.hasNext()) {
                    String palavraAtual = input.next();
                    palavrasDoTema.add(palavraAtual);                
            }
        } catch (NoSuchElementException e) {
            System.err.println("File improperly formed. Terminating.");
        } catch (IllegalStateException e) {
            System.err.println("Error reading from file. Terminating.");
        }
    }
    
    public static void fechaArquivo() {
        if (input != null) {
            input.close();            
        }
    }  
    
    /**
     * Retorna a palavra sorteada.
     * @param listaPalavras lista contendo palavras para serem escolhidas
     * @return palavra sorteada
     */
    public static String retornaPalavraSorteada(ArrayList<String> listaPalavras) {
        Random randomico = new Random();
        int indice = randomico.nextInt(20) + 1;
        String palavraSorteada = listaPalavras.get(indice);
        
        return palavraSorteada;
    }
}
