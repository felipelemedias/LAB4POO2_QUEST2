/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcadapter;

/**
 *
 * @author fleme
 */
public class CalculadoraAdapter implements CalculadoraInterface{

    private CalcDecimais calcD;
    private CalcBinarios calcB;
    
    
    CalculadoraAdapter(CalcDecimais calcDI, CalcBinarios calcBI){
        this.calcD = calcDI;
        this.calcB = calcBI;
    }
    
    @Override
    public int somar(int a, int b) {
        return this.calcD.somar(a, b);
    }

    @Override
    public int subtrair(int a, int b) {
        return this.calcD.subtrair(a, b);
    }

    @Override
    public int multiplicar(int a, int b) {
         return this.calcD.multiplicar(a, b);
    }

    @Override
    public String somar(String a, String b) {
        return this.calcB.somar(a, b);
    }

    @Override
    public String subtrair(String a, String b) {
        return this.calcB.subtrair(a, b);
    }
    
}
