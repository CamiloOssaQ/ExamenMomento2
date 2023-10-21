/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.java.m2;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado("Rojo", 4.0);
        Circulo circulo = new Circulo("Azul", 5.0);

        System.out.println("Área del cuadrado (" + cuadrado.color + "): " + cuadrado.calcularArea());
        System.out.println("Área del círculo (" + circulo.color + "): " + circulo.calcularArea());
    }
}
