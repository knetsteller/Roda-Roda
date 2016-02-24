/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.es.rodaroda;

/**
 *
 * @author Netsteller
 */
public enum SessaoRoleta {
    
    CEM {
        @Override
        public int getPontos() {
            return 100;
        }
    },
    
    DUZENTOS {
        @Override
        public int getPontos() {
            return 200;
        }
    },
    
    QUATROCENTOS {
        @Override
        public int getPontos() {
            return 400;
        }
    },
    
    QUINHENTOS {
        @Override
        public int getPontos() {
            return 500;
        }
    },
    
    MIL {
        @Override
        public int getPontos() {
            return 1000;
        }
    },
    
    PASSAVEZ {
        @Override
        public int getPontos() {
            return 0;
        }
    },
    
    PERDETUDO {
        @Override
        public int getPontos() {
            return -1;
        }
    };
    
    public abstract int getPontos();
}
