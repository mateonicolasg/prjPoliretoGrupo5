
/*Copyright (C) 2K23, David Unaucho
 * (Nombre grupo), david.unaucho@epn.edu.ec
 * Version 1.0
 */

 /**
  * Crea la siguiente serie:  0 1 1 2 3 5 8 13 ...
  * @author David Unaucho
  * @version 1.0
  */

    // Método para generar la serie
    public class SerieNumero1{
        /**
     * <b>UnauchoSerie1</b> muestra la serie usando el ciclo for 1: 0 1 1 2 3 5 8 13 ...
     * @param nroTerminos: numero de terminos para la serie
     * UnauchoSerie1 
     */
     public void UnauchoSerie1for(int nroTerminos) {
        int termino1 = 0;
        int termino2 = 1;

        if (nroTerminos >= 1) {
            System.out.print(termino1);
        }
        if (nroTerminos >= 2) {
            System.out.print(" " + termino2);
        }

        int terminoSiguiente;
        for (int i = 3; i <= nroTerminos; ++i) {
            terminoSiguiente = termino1 + termino2;
            System.out.print(" " + terminoSiguiente);

            termino1 = termino2;
            termino2 = terminoSiguiente;
        }
    }
       /**
     * <b>UnauchoSerie1</b> muestra la serie usando el ciclo while 1: 0 1 1 2 3 5 8 13 ...
     * @param nroTerminos: numero de terminos para la serie
     * UnauchoSerie1 
     */

    public void UnauchoSerie1while(int nroTerminos) {
        int termino1 = 0;
        int termino2 = 1;

        if (nroTerminos >= 1) {
            System.out.print(termino1);
        }
        if (nroTerminos >= 2) {
            System.out.print(" " + termino2);
        }

        int contador = 2;
        int terminoSiguiente;
        while (contador < nroTerminos) {
            terminoSiguiente = termino1 + termino2;
            System.out.print(" " + terminoSiguiente);

            termino1 = termino2;
            termino2 = terminoSiguiente;

            contador++;
        }
    }
     /**
     * <b>UnauchoSerie1</b> muestra la serie usando el ciclo Dowhile 1: 0 1 1 2 3 5 8 13 ...
     * @param nroTerminos: numero de terminos para la serie
     * UnauchoSerie1 
     */
     public void UnauchoSerie1Dowhile(int nroTerminos) {
    int termino1 = 0;
    int termino2 = 1;

    if (nroTerminos >= 1) {
        System.out.print(termino1);
    }
    if (nroTerminos >= 2) {
        System.out.print(" " + termino2);
    }

    int contador = 2;
    int terminoSiguiente;

    if (nroTerminos > 2) {
        do {
            terminoSiguiente = termino1 + termino2;
            System.out.print(" " + terminoSiguiente);

            termino1 = termino2;
            termino2 = terminoSiguiente;

            contador++;
        } while (contador < nroTerminos);
    }
}

}