package com.mycompany.ejercicio2ip;
//Copyright:Ruth Bautista(202320050047).
//Este programa realiza operaciones aritmeticas básicas, entre dos números prederteminados.
//Muestra los resultados de cada operación en la consola.


public class Ejercicio2IP {
    public static void main(String[] args) {
        
        
        double num1 = 25.5; 
        double num2 = 12.2;  

        System.out.println("Primer número: " + num1);
        System.out.println("Segundo número: " + num2);

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));
        System.out.println("Módulo: " + (num1 % num2)); 
    }
    
}