/**
 * Copyright (C) 2K23B, Mateo Simbaña
 * () mateo.simbana@epn.edu.ec
 * Version 1.0
 */

/**
 * Crea la siguiente serie de caracteres
 * @author: Mateo Simbaña
 * @version: 1.0
 */


//  S4:  +  -  *  /  +  -  *  / +  -  *  /  ...
      // 1  2  3   4  1  2  3  4 

public class SerieCaracteres4 {
    private char[] serie;
    public SerieCaracteres4(){
        this.serie = new char[] {'+','-','*','/'};
    }
    /**
     * <b>showSerieFor</b> muestra la serie usando el ciclo for S4:  +  -  *  /  +  -  *  / +  -  *  /  ...
     * @param nroTerminos: numero de terminos para la serie
     * showSerieFor 
     */
    public void showSerieFor(int nroTerminos){
        // int residuo;
        for (int i = 0; i < nroTerminos; i++) {
            // residuo = i % 4;
            System.out.print(serie[i % 4] + " ");
        }
    }
    /**
     * <b>showSerieDowhile</b> muestra la serie usando el ciclo Dowhile S4:  +  -  *  /  +  -  *  / +  -  *  /  ...
     * @param nroTerminos: numero de terminos para la serie
     * showSerieDowhile
     */
    public void showSerieDowhile (int nroTerminos){
        int i = 0; 
        do {
            System.out.print(serie[i%4] + " ");
        } while (++i < nroTerminos);
    }
    /**
     * <b>showSerieWhile</b> muestra la serie usando el ciclo while S4:  +  -  *  /  +  -  *  / +  -  *  /  ...
     * @param nroTerminos: numero de terminos para la serie
     * showSerieWhile
     */
    public void showSerieWhile(int nroTerminos){
        int i = 0;
        while (i < nroTerminos){
            System.out.print(serie[i++%4] + " ");
        }
    }
}
