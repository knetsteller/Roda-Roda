package br.ufg.inf.es.rodaroda;

/**
 * Define os métodos utilizados pela classe observada.
 */
public interface Subject {
    public void registraObservador(ObservadorJogo o);
    public void removeObservador(ObservadorJogo o);
    public void notificaObservador();
}
