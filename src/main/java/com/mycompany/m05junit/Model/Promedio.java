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
    public double sumarNumeros(double[] numeros) {
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }
}
