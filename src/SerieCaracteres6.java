/** 
 * Copyright (C) 2K23B, Mateo Simbaña
 * () mateo.simbana@epn.edu.ec
 * Version 1.0
 */


/**
 * Crea la siguiente serie
 * @author: Mateo Simbaña
 * @version: 1.0
 */
public class SerieCaracteres6 {
    private char abecedario;
    public SerieCaracteres6(){
        this.abecedario = 97;
    }
    /**
    * <b>showSerieFor</b> muestra la serie usando el ciclo for S6:  a  b   c   d   e   f   g   h   ...
    * @param nroTerminos: numero de terminos para la serie
    * showSerieFor 
    */
    public void showSerieFor(int nroTerminos){
        for (int i = 0; i < nroTerminos; i++) {
            if (i == 26)
                abecedario = 97;
            System.out.print(abecedario + " ");
            abecedario += 1;
        }
    }
    /** 
    * <b>showSerieDowhile</b> muestra la serie usando el ciclo Dowhile S6:  a  b   c   d   e   f   g   h   ...
    * @param nroTerminos: numero de terminos para la serie
    * showSerieDowhile 
    */
    public void showSerieDowhile (int nroTerminos){
        int i = 0;
        abecedario = 97;
        do{
            if (i == 26)
                abecedario = 97;
            System.out.print(abecedario + " ");
            abecedario += 1;  

        }while (++i < nroTerminos);
    }
    /** 
    * <b>showSerieWhile</b> muestra la serie usando el ciclo While S6:  a  b   c   d   e   f   g   h   ...
    * @param nroTerminos: numero de terminos para la serie
    * showSerieWhile 
    */
    public void showSerieWhile(int nroTerminos){
        int i = 0;
        abecedario = 97;
        while (i < nroTerminos){
            if (i++ == 26)
                abecedario = 97;
            System.out.print(abecedario + " ");
            abecedario += 1;
        }
    }
}
