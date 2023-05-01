/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.m05junit.Model;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Felipe
 */
public class PromedioTest {
    
    public PromedioTest() {
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

    @Test
    public void testCalcularmasgrande() {
        Promedio promedio = new Promedio();
        
        double[] numeros = {1.1, 2.2, 3.3, 4.4, 5.5};
        double esperado = 5.5;
        double resultado = promedio.calcularmasgrande(numeros);
        assertEquals(esperado, resultado, 0.1);
        
        
    }
    
}
