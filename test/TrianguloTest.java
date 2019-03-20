/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import triangulo.Triangulo;

/**
 *
 * @author 20161014040004
 */
public class TrianguloTest {
    
    private Triangulo t;
    
    public TrianguloTest() {
        testeETriangulo();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("Teste Iniciado.");
        t = new Triangulo(1,1,1);
    }
    
    @After
    public void tearDown() {
        System.out.println("Teste Finalizado.");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testeETriangulo(){
        Triangulo t = new Triangulo(9,1,1);
        
        assertTrue(t.ÉTriangulo());
    }
}
