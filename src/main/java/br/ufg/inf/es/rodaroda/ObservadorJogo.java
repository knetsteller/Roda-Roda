package br.ufg.inf.es.rodaroda;

/**
 * Define método utilizado pelas classes observadoras, de acordo com o padrão de 
 * design Observer.
 */
public interface ObservadorJogo {
    public void atualizaPalavraOculta(String palavraDaVez, int[] novaPalavra);
}
