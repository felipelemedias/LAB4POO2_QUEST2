/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calcadapter;

/**
 *
 * @author fleme
 */
public class CalcAdapter {

    public static void main(String[] args) {
        CalculadoraAdapter adapter = new CalculadoraAdapter(new CalculadoraDecimal(), new CalculadoraBinaria());

        System.out.println("Soma binária de 1101 + 1011 = " + adapter.somar("1101", "1011"));
        System.out.println("Subtração binária de 1011 + 1101 = " + adapter.subtrair("1011", "1101"));
        System.out.println("Soma decimal de 9 + 2 = " + adapter.somar(9, 2));
        System.out.println("Subtração decimal de 2 - 9 = " + adapter.subtrair(2, 9));
        System.out.println("Multiplicação decimal de 4 * 6 = " + adapter.multiplicar(4, 6));
    }
}
