/**
 * Copyright (C) 2K23B, Mateo Simbaña
 * () david.unaucho@epn.edu.ec
 * Version 1.0
 */

/**
 * Crea la siguiente serie de numeros
 * @author: David Unaucho
 * @version: 1.0
 */

public class SerieCaracteresS3 {

    private char num1;
    public SerieCaracteresS3(){
        this.num1 = '+';

    }
    /**
     * <b>showSerieFor</b> muestra la serie usando el ciclo for S3:  ++	 +++ +++++ +++++++ +++++++++++ +++++++++++++ ... 
     * @param nroTerminos: numero de terminos para la serie
     * showSerieFor 
     */
    public void showSerieFor (int nroTerminos){
        int cantidad = 1;
        int contador = 0;

        for (int i = 1; contador < nroTerminos; i += cantidad) {
            for (int j = 0; j < i && contador < nroTerminos; j++) {
                System.out.print(num1);
                contador++;
            }
            cantidad++;
            System.out.print(" ");
        }
    }
     /**
     * <b>showSerieDowhile</b> muestra la serie usando el ciclo Dowhile S3:   ++	 +++ +++++ +++++++ +++++++++++ +++++++++++++ ... 
     * @param nroTerminos: numero de terminos para la serie
     * showSerieDowhile
     */
    public void showSerieDoWhile(int nroTerminos) {
        int cantidad = 1;
        int contador = 0;
        int i = 1;

        do {
            int j = 0;
            do {
                if (contador >= nroTerminos) {
                    break;
                }
                System.out.print(num1);
                j++;
                contador++;
            } while (j < i);

            cantidad++;
            i += cantidad;
            System.out.print(" ");
        } while (contador < nroTerminos);
    }
    /**
     * <b>showSerieWhile</b> muestra la serie usando el ciclo while S3:  ++	 +++ +++++ +++++++ +++++++++++ +++++++++++++ ... 
     * @param nroTerminos: numero de terminos para la serie
     * showSerieWhile
     */
    public void showSerieWhile(int nroTerminos){
        int cantidad = 1;
        int contador = 0;

        int i = 1;
        while (contador < nroTerminos) {
            int j = 0;
            while (j < i && contador < nroTerminos) {
                System.out.print(num1);
                j++;
                contador++;
            }
            cantidad++;
            i += cantidad;
            System.out.print(" ");
        }
    }
}
    



 
