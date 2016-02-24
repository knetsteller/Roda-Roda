package br.ufg.inf.es.rodaroda;

/**
 * Implementa uma estratégia para gerar um resultado pré-determinado.
 */
public class ResultadoViciado implements EstrategiaSorteio {
    
    ResultadoAleatorio aleatorio;
    boolean rodaSegundaVez = false;
    int resultado;

    /**
     * Gera um resultado aleatório na primeira vez e, na segunda vez, retorna 
     * o resultado para passar a vez.
     * @return um inteiro correspondente ao resultado gerado
     */
    @Override
    public int geraSorteio() {
        
        if (rodaSegundaVez == true) {
            resultado = SessaoRoleta.PASSAVEZ.getPontos();            
        } else {
            resultado = aleatorio.geraSorteio();
        }
        
        return resultado;
    }
    
}
