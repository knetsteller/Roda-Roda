package br.ufg.inf.es.rodaroda;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class JogoTest {
    
    ResultadoAleatorio a = new ResultadoAleatorio();
    
    public JogoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Ignore
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Jogo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @org.junit.Test
    public void testMudaModoSorteio() {
        System.out.println("mudaModoSorteio");
        Jogo instance = null;
        int expResult = 0;
        int result = instance.mudaModoSorteio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @org.junit.Test
    public void testApresentaJogadores() {
        System.out.println("apresentaJogadores");
        int quantidade = 0;
        Jogo instance = null;
        instance.apresentaJogadores(quantidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Ignore
    @org.junit.Test
    public void testRetornaIndices() {
        System.out.println("retornaIndices");
        String palavra = "abc";
        String letra = "a";
        Jogo instance = new Jogo(1, 1, 1, a);
        int[] expResult = null;
        int[] result = instance.retornaIndices(palavra, letra);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @org.junit.Test
    public void testIniciaJogo() {
        System.out.println("iniciaJogo");
        Jogo jogo = null;
        Jogo instance = null;
        instance.iniciaJogo(jogo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @org.junit.Test
    public void testRegistraObservador() {
        System.out.println("registraObservador");
        ObservadorJogo o = null;
        Jogo instance = null;
        instance.registraObservador(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @org.junit.Test
    public void testRemoveObservador() {
        System.out.println("removeObservador");
        ObservadorJogo o = null;
        Jogo instance = null;
        instance.removeObservador(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @org.junit.Test
    public void testNotificaObservador() {
        System.out.println("notificaObservador");
        Jogo instance = null;
        instance.notificaObservador();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
