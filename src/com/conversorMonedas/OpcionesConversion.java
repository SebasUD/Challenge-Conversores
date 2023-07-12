
package com.conversorMonedas;

import javax.swing.JOptionPane;

/**
 *
 * @author sebasUD
 */
public class OpcionesConversion {
    
    /**
     * Esta clase contiene el menú que se utilizó para mostrar las opciones utilizando JOptionPane y
     * una matriz de objetos. Tambien se hizo uso de un switch con los casos que representan las 10 opciones.
     */

    ConvertirMonedas monedas = new ConvertirMonedas();

    public void ConvertirMonedas(double valor) {

        String opcion;
        opcion = (JOptionPane.showInputDialog(null,
                "Elije la moneda que deseas convertir tu dinero ", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Colones a Dólar",
                    "De Colones a Euro",
                    "De Colones a Libras Esterlinas",
                    "De Colones a Yen Japonés",
                    "De Colones a Won sur-coreano",
                    "De Dólar a Colones",
                    "De Euro a Colones",
                    "De Libras Esterlinas a Colones",
                    "De Yen Japonés a Colones", 
                    "De Won sur-coreano a Colones"},"Seleccion")).toString();

        switch (opcion) {
            case "De Colones a Dólar" -> monedas.ConvertirColonesADolares(valor);

            case "De Colones a Euro" -> monedas.ConvertirColonesAEuros(valor);

            case "De Colones a Libras Esterlinas" -> monedas.ConvertirColonesALibras(valor);

            case "De Colones a Yen Japonés" -> monedas.ConvertirColonesAYen(valor);

            case "De Colones a Won sur-coreano" -> monedas.ConvertirColonesAWon(valor);

            case "De Dólar a Colones" -> monedas.ConvertirDolaresAColones(valor);

            case "De Euro a Colones" -> monedas.ConvertirEurosAColones(valor);

            case "De Libras Esterlinas a Colones" -> monedas.ConvertirLibrasAColones(valor);

            case "De Yen Japonés a Colones" -> monedas.ConvertirYenAColones(valor);

            case "De Won sur-coreano a Colones" -> monedas.ConvertirWonAColones(valor);
        }
    }
}
