/* Copyright (C) 2K23B, Mateo Simbaña
 * () mateo.simbana@epn.edu.ec
 * Version 1.0
 */


/**
 * Crea la siguiente serie
 * @author: Mateo Simbaña
 * @version: 1.0
 */

public class MateoGrupo5 {

    private int primerFactor, segundoFactor;

    public MateoGrupo5 (){
        this.primerFactor = 2;
        this.segundoFactor = 1;
    }
    /**
     * <b>showSerieFor</b> muestra la serie usando el ciclo for S12: 2  6   12  20  30  42  56  72  ...
     * @param nroTerminos: numero de terminos para la serie
     * showSerieFor 
     */

    public void showSerieFor(int nroTerminos){
        // int primerFactor, segundoFactor;
        // primerFactor = 2;
        // segundoFactor = 1;
        for (int i = 0; i < nroTerminos; i++) 
            System.out.print(((primerFactor++)*(segundoFactor++)) + " ");
            // primerFactor++;
            // segundoFactor++;
     }

    /**
     * <b>showSerieWhile</b> muestra la serie usando el ciclo while S12: 2  6   12  20  30  42  56  72  ...
     * @param nroTerminos: numero de terminos para la serie
     * showSerieWhile 
     */

    public void showSerieWhile(int nroTerminos){
        // int primerFactor, segundoFactor;
        primerFactor = 2;
        segundoFactor = 1;
        while ((nroTerminos--) > 0)
            System.out.print(((primerFactor++)*(segundoFactor++)) + " ");
            // primerFactor++;
            // segundoFactor++;
            // nroTerminos--;
     }

    /**
     * <b>showSerieDowhile</b> muestra la serie usando el ciclo do-while S12: 2  6   12  20  30  42  56  72  ...
     * @param nroTerminos: numero de terminos para la serie
     * showSerieDoWhile 
     */
    public void showSerieDowhile(int nroTerminos){
        // int primerFactor,segundoFactor;
        primerFactor = 2;
        segundoFactor = 1;
        do
            System.out.print((primerFactor++)*(segundoFactor++) + " ");
            // primerFactor++;
            // segundoFactor++;
            // nroTerminos--;
        while((--nroTerminos) > 0);
    }   
}
