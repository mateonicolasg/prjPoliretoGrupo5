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
public class SerieCaracteres6B {
    private char abecedario;
    private int signosAlternos;
    public SerieCaracteres6B(){
        this.abecedario = 97;
        this.signosAlternos = 0;
    }
    /**
    * <b>showSerieFor</b> muestra la serie usando el ciclo for  S6B:  a  +   c   -   e   +   g   -   ...
    * @param nroTerminos: numero de terminos para la serie
    * showSerieFor 
    */
    public void showSerieFor(int nroTerminos){
        for (int i = 0; i < nroTerminos; i++) {
            if (i== 26)
                abecedario = 97;
            if ((i % 2) == 0)
                System.out.print(abecedario++ + " ");
            else if (signosAlternos % 2 == 0){
                System.out.print("+ " );
                signosAlternos++;
            }
            else { 
                System.out.print("- ");
                signosAlternos++;
            }
        }
    }
    /**
    * <b>showSerieDowhile</b> muestra la serie usando el ciclo Dowhile  S6B:  a  +   c   -   e   +   g   -   ...
    * @param nroTerminos: numero de terminos para la serie
    * showSerieDowhile 
    */
    public void showSerieDowhile (int nroTerminos){
        abecedario = 97;
        signosAlternos = 0;
        int i = 0;
        do{
            if (i== 26)
                abecedario = 97;
            if ((i % 2) == 0)
                System.out.print(abecedario++ + " ");
            else if (signosAlternos % 2 == 0){
                System.out.print("+ " );
                signosAlternos++;
            }
            else { 
                System.out.print("- ");
                signosAlternos++;
            }
        } while (++i < nroTerminos);
    }
    /**
    * <b>showSerieWhile</b> muestra la serie usando el ciclo while  S6B:  a  +   c   -   e   +   g   -   ...
    * @param nroTerminos: numero de terminos para la serie
    * showSerieWhile 
    */
    public void showSerieWhile (int nroTerminos){
        abecedario = 97;
        signosAlternos = 0;
        int i = 0;
        while (i < nroTerminos){
            if (i== 26)
                abecedario = 97;
            if ((i++ % 2) == 0)
                System.out.print(abecedario++ + " ");
            else if (signosAlternos % 2 == 0){
                System.out.print("+ " );
                signosAlternos++;
            }
            else { 
                System.out.print("- ");
                signosAlternos++;
            }
        }
    }
}
