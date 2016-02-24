package br.ufg.inf.es.rodaroda;

public class Etapa {
    
    private Palavra palavras;
    int etapas;
    
    public void setQuantidadeEtapas(int quantidade) {
        etapas = quantidade;
    }
    
    public void setQuantidadePalavras(int quantidade) {
        palavras.setQuantidadePalavras(quantidade);
    }
}
