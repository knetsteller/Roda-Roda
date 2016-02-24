/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.es.rodaroda;

/**
 * Implementa um sorteio aleatório.
 */
public class ResultadoAleatorio implements EstrategiaSorteio {

    Roleta roleta = new Roleta();
    
    /**
     * Gera um resultado aleatório quando a roleta é rodada.
     * @return um inteiro correspondente ao resultado gerado
     */
    @Override
    public int geraSorteio() {
        int resultadoRoleta;
        resultadoRoleta = roleta.rodaRoleta();
        
        return resultadoRoleta;
    }
    
}
