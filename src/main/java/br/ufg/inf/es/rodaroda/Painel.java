package br.ufg.inf.es.rodaroda;

/**
 * Classe responsável por exibir a palavra sorteada na tela.
 */
public class Painel implements ObservadorJogo {

    int i;
    int novaPalavra[] = new int[5];

    String palavraDaVez;

    @Override
    public void atualizaPalavraOculta(String palavraDaVez, int[] palavra) {
        novaPalavra = palavra;
        this.palavraDaVez = palavraDaVez;
    }

    public void exibePalavraOculta() {
        int indice;
        int j = 0;

        for (i = 0; i < palavraDaVez.length(); i++) {
            indice = novaPalavra[j];
            if (i == indice) {
                System.out.printf("%6s", palavraDaVez.charAt(i));
                j++;
            } else {
                System.out.printf("%6s", "*");
            }
        }
    }
}
