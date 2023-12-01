/* Copyright (C) 2K23B, Mateo Simbaña
 * () mateo.simbana@epn.edu.ec
 * Version 1.0
 */

/**
 * Crea la siguiente serie de caracteres
 * @author: Mateo Simbaña
 * @version: 1.0
 */
public class SerieCaracteres1 {
    // 1:  + - + - + - + ...      
    private char par, impar;
    public SerieCaracteres1(){
        this.par = '+';
        this.impar = '-';
    }
    /**
     * <b>showSerieFor</b> muestra la serie usando el ciclo for 1:  + - + - + - + ... 
     * @param nroTerminos: numero de terminos para la serie
     * showSerieFor 
     */
    public void showSerieFor (int nroTerminos){
        for (int i = 0; i < nroTerminos; i++) {
            if (i % 2 == 0)
                System.out.print(par + " ");
            else
                System.out.print(impar + " ");
        }
    }
    /**
     * <b>showSerieDowhile</b> muestra la serie usando el ciclo Dowhile 1:  + - + - + - + ... 
     * @param nroTerminos: numero de terminos para la serie
     * showSerieDowhile
     */
    public void showSerieDowhile (int nroTerminos){
        int i = 0;
        do {
            if (i % 2 == 0)
                System.out.print(par + " ");
            else
                System.out.print(impar + " ");
        } while (++i < nroTerminos);
    }
    /**
     * <b>showSerieWhile</b> muestra la serie usando el ciclo while 1:  + - + - + - + ... 
     * @param nroTerminos: numero de terminos para la serie
     * showSerieWhile 
     */
    
    public void showSerieWhile(int nroTerminos){
        int i = 0;
        while (i < nroTerminos){
            if (i++ % 2 == 0)
                System.out.print(par + " ");
            else
                System.out.print(impar + " ");
        }
    }
}
