package com.main;

/**
 *
 * @author sebasUD
 */
import javax.swing.*;

import com.conversorMonedas.OpcionesConversion;
import com.conversorTemperatura.OpcionesConversionTemperatura;

/**
 * Esta clase contiene el main el cual va ejecutar el programa y la opción que el usuario elija,
 * haciendo uso de una matriz de objetos el usuario va observar las dos opciones disponibles.
 */

public class Main {

    public static void main(String[] args) {
        //Se declararon dos objetos instanciados para poder interactuar con las clases OpcionesConversion y OpcionesConversionTemperatura
        OpcionesConversion conversion = new OpcionesConversion();
        OpcionesConversionTemperatura conversionT = new OpcionesConversionTemperatura();

        boolean continuar = true; // Variable para controlar la ejecución del bucle

        while (continuar) {
            String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null,
                    new Object[]{"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();

            switch (opciones) {
                case "Conversor de Monedas" -> {
                    boolean valorValido = false;
                    double valorRecibido = 0.0;

                    while (!valorValido) {
                        String input = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas convertir");

                        try {
                            valorRecibido = Double.parseDouble(input);
                            valorValido = true; // El valor ingresado es válido, se sale del bucle
                        } catch (NumberFormatException e) {
                            // El valor ingresado no es un número válido
                            JOptionPane.showMessageDialog(null, "Valor ingresado no válido. Por favor, ingrese un número válido.");
                        }
                    }

                    conversion.ConvertirMonedas(valorRecibido);

                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
                    if (JOptionPane.OK_OPTION == respuesta) {
                        // Continuar con el bucle y solicitar otro valor
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        continuar = false; // Se actualiza la variable para romper el bucle
                    }
                }

                case "Conversor de Temperatura" -> {
                    boolean valorValido = false;
                    double valorRecibidoT = 0.0;

                    while (!valorValido) {
                        String input1 = JOptionPane.showInputDialog(null, "Ingresa la temperatura que deseas convertir");

                        try {
                            valorRecibidoT = Double.parseDouble(input1);
                            valorValido = true;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "El valor ingresado no es válido. Por favor, ingrese un número.");
                        }
                    }

                    conversionT.ConvertirTemperaturas(valorRecibidoT);

                    int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
                    if (JOptionPane.OK_OPTION == respuestaT) {
                        // El usuario desea realizar otra conversión, el bucle continuará
                    } else {
                        JOptionPane.showMessageDialog(null, "Finalizando programa...");
                        continuar = false; // Se actualiza la variable para romper el bucle
                    }
                }
            }
        }
    }
}
