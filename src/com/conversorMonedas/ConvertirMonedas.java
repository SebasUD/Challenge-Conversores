/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversorMonedas;

import javax.swing.JOptionPane;

/**
 *
 * @author sebasUD
 */
public class ConvertirMonedas {
    
    /**
     * Los siguientes metodos realizan las conversiones del monto solicitado a colones 
     * haciendo un calculo aproximado del monto partiendo del tipo de cambio del dia 
     * 11 de julio del 2023
     * @param valor
     */

    public void ConvertirColonesADolares(double valor) {
        double monedaDolar = valor / 546.89;
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
    }       //ConvertirColonesAEuros

    public void ConvertirColonesAEuros(double valor) {
        double monedaEuro = valor / 602.73;
        monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes € " + monedaEuro + " Euros");
    }

    public void ConvertirColonesALibras(double valor) {
        double monedaLibra = valor / 708.52;
        monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes £ " + monedaLibra + " Libras Esterlinas");
    }

    public void ConvertirColonesAYen(double valor) {
        double monedaYen = valor / 3.92;
        monedaYen = (double) Math.round(monedaYen * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes ¥ " + monedaYen + " Yen Japonés");
    }

    public void ConvertirColonesAWon(double valor) {
        double monedaWon = valor / 0.42;
        monedaWon = (double) Math.round(monedaWon * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes ₩ " + monedaWon + " Won sur-coreano");
    }

    /**
     * Los siguientes metodos realizan las conversiones inversas haciendo un
     * calculo aproximado del monto de igual manera partiendo del tipo de cambio
     * del dia 11 de julio del 2023
     * @param valor
     */
    
    public void ConvertirDolaresAColones(double valor) {
        double monedaDolar = 546.89 * valor;
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes ₡" + monedaDolar + " colones");
    }

    public void ConvertirEurosAColones(double valor) {
        double monedaEuro = valor * 602.73;
        monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes ₡" + monedaEuro + " colones");
    }

    public void ConvertirLibrasAColones(double valor) {
        double monedaLibra = valor * 708.52;
        monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes ₡" + monedaLibra + " colones");
    }

    public void ConvertirYenAColones(double valor) {
        double monedaYen = valor * 3.92;
        monedaYen = (double) Math.round(monedaYen * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes ₡" + monedaYen + " colones");
    }

    public void ConvertirWonAColones(double valor) {
        double monedaWon = valor * 0.42;
        monedaWon = (double) Math.round(monedaWon * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes ₡" + monedaWon + " colones");
    }
}
