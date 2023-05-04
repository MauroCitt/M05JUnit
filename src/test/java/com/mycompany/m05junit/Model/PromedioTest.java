/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.m05junit.Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumne
 */
public class PromedioTest {
    
    @Test
    public void promedioTestSuma(){
        double[] listaNums = {10, 1, 12, 6, 3};
        
        Promedio p = new Promedio();
        
        double res = p.sumarNumeros(listaNums);
        double resEsperado = 32;
        
        assertEquals(resEsperado, res, 00.1);
    
    }

    
    
}
