/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m05junit.Model;

/**
 *
 * @author alumne
 */
public class Promedio {
    public double calcularmasgrande(double numeros[]){
        double numero = Double.MIN_VALUE;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > numero) {
                numero = numeros[i];
            }
        }
        return numero;
    }
}
