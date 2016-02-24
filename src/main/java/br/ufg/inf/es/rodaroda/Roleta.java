package br.ufg.inf.es.rodaroda;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Classe correspodente à roleta utilizada para jogar o Roda a Roda.
 */
public class Roleta {

    Map<Integer, Integer> map;

    Roleta() {
        map = new HashMap<Integer, Integer>();

        map.put(1, SessaoRoleta.PERDETUDO.getPontos());
        map.put(2, SessaoRoleta.PERDETUDO.getPontos());
        map.put(3, SessaoRoleta.PASSAVEZ.getPontos());
        map.put(4, SessaoRoleta.PASSAVEZ.getPontos());
        map.put(5, SessaoRoleta.CEM.getPontos());
        map.put(6, SessaoRoleta.CEM.getPontos());
        map.put(7, SessaoRoleta.CEM.getPontos());
        map.put(8, SessaoRoleta.CEM.getPontos());
        map.put(9, SessaoRoleta.DUZENTOS.getPontos());
        map.put(10, SessaoRoleta.DUZENTOS.getPontos());
        map.put(11, SessaoRoleta.DUZENTOS.getPontos());
        map.put(12, SessaoRoleta.DUZENTOS.getPontos());
        map.put(13, SessaoRoleta.QUATROCENTOS.getPontos());
        map.put(14, SessaoRoleta.QUATROCENTOS.getPontos());
        map.put(15, SessaoRoleta.QUATROCENTOS.getPontos());
        map.put(16, SessaoRoleta.QUATROCENTOS.getPontos());
        map.put(17, SessaoRoleta.QUINHENTOS.getPontos());
        map.put(18, SessaoRoleta.QUINHENTOS.getPontos());
        map.put(19, SessaoRoleta.MIL.getPontos());
        map.put(20, SessaoRoleta.MIL.getPontos());
    }

    public int rodaRoleta() {
        Random random = new Random();
        int posicaoRoleta = random.nextInt(20) + 1;
        
        return map.get(posicaoRoleta);
    }

    public int atribuiPontuacao(int posicaoRoleta, Map<Integer, Integer> map) {
        int pontuacao;
        pontuacao = map.get(posicaoRoleta);

        return pontuacao;
    }
}
