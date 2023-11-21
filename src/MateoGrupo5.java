/* Copyright (C) 2K23B, mateonicolasg
 * () mateo.simbana@epn.edu.ec
 * Version 1.0
 */


/**
 * Crea la siguiente serie
 * @author: mateonicolasg
 * @version: 1.0
 */

public class MateoGrupo5 {
    /**
     * <b>showSerie</b> muestra la serie usando el ciclo for S12: 2  6   12  20  30  42  56  72  ...
     * @param NroTerminos: numero de terminos para la serie
     * showSerie 
     */

    public void showSerieFor(int NroTerminos){
        int primero = 2, segundo = 1;
        // primero = 2;
        // segundo = 1;
        for (int i = 0; i < NroTerminos; i++) 
            System.out.print(((primero++)*(segundo++)) + " ");
            // primero++;
            // segundo++;
     }

    /**
     * <b>showSerie</b> muestra la serie usando el ciclo while S12: 2  6   12  20  30  42  56  72  ...
     * @param NroTerminos: numero de terminos para la serie
     * showSerie 
     */

    public void showSerieWhile(int NroTerminos){
        int primero = 2, segundo = 1;
        // primero = 2;
        // segundo = 1;
        while ((NroTerminos--) > 0)
            System.out.print(((primero++)*(segundo++)) + " ");
            // primero++;
            // segundo++;
            // NroTerminos--;
     }

    /**
     * <b>showSerie</b> muestra la serie usando el ciclo do-while S12: 2  6   12  20  30  42  56  72  ...
     * @param NroTerminos: numero de terminos para la serie
     * showSerie 
     */
    public void showSerieDowhile(int NroTerminos){
        int primero = 2 ,segundo = 1;
        // primero = 2;
        // segundo = 1;
        do
            System.out.print((primero++)*(segundo++) + " ");
            // primero++;
            // segundo++;
            // NroTerminos--;
        while((--NroTerminos) > 0);
    }   
}
