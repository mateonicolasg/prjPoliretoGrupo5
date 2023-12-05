/*Copyright (C) 2K23, David Unaucho
 * (Nombre grupo), david.unaucho@epn.edu.ec
 * Version 1.0
 */

 /**
  * Crea la siguiente serie:  1 0 3 0 5 0 7 0 9 ...
  * @author David Unaucho
  * @version 1.0
  */

    // Método para generar la serie
    public class SerieNumero2 {
     /**
     * <b>UnauchoSerieNumero2</b> muestra la serie usando el ciclo for 2: 1 0 3 0 5 0 7 0 9 ...
     * @param nroTerminos: numero de terminos para la serie
     * UnauchoSerieNumero2 
     */

     public void UnauchoSerie2for(int nroTerminos) {
        int valor = 1; // Comenzar con el primer valor
        for (int i = 0; i < nroTerminos; i++) {
            System.out.print(valor + " ");

            if (i % 2 == 0) {
                valor = 0; // Si el índice es par, asigna 0
            } else {
                valor += 2; // Si el índice es impar, aumenta en 2
            }
        }    
    }
      /**
     * <b>UnauchoSerieNumero2</b> muestra la serie usando el ciclo while 2: 1 0 3 0 5 0 7 0 9 ...
     * @param nroTerminos: numero de terminos para la serie
     * UnauchoSerieNumero2 
     */
    public void UnauchoSerie2while(int nroTerminos){
        int valor = 1; // Comenzar con el primer valor
        int i = 0;

        while (i < nroTerminos) {
            System.out.print(valor + " ");

            if (i % 2 == 0) {
                valor = 0; // Si el índice es par, asigna 0
            } else {
                valor += 2; // Si el índice es impar, aumenta en 2
            }

            i++;
        }
    }
     /**
     * <b>UnauchoSerieNumero2</b> muestra la serie usando el ciclo Dowhile 2: 1 0 3 0 5 0 7 0 9 ...
     * @param nroTerminos: numero de terminos para la serie
     * UnauchoSerieNumero2 
     */
    public void UnauchoSerie2Dowhile (int nroTerminos){
        int valor = 1; // Comenzar con el primer valor
        int i = 0;

        do {
            System.out.print(valor + " ");

            if (i % 2 == 0) {
                valor = 0; // Si el índice es par, asigna 0
            } else {
                valor += 2; // Si el índice es impar, aumenta en 2
            }

            i++;
        } while (i < nroTerminos);
    }

}
    

