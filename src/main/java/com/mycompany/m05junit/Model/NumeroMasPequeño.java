package com.mycompany.m05junit.Model;

public class NumeroMasPequeño {
    public double buscarElMasPequeño(double[] numeros){
        double num =  Double.MAX_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < num) {
                num = numeros[i];
            }
        }
        return num;
    }
}
