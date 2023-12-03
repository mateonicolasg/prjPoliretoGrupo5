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
public class Figura4 {
    /**
     * <b>showFiguraFor</b> muestra la figura usando el ciclo for F4:
                *  
              * *       
            * * *       
          * * * *     
        * * * * *
     * @param nroNiveles: numero de niveles para la figura
     * showFiguraFor 
     */
    public void showFiguraFor(int nroNiveles){
        for (int filas = 1; filas <= nroNiveles; filas++) {
            for (int nroEspacios = nroNiveles; nroEspacios > filas; nroEspacios--) 
                System.out.print("  ");
            for (int nroCaracteres = 0; nroCaracteres < filas; nroCaracteres++) 
                System.out.print("* ");
            System.out.println();
        }
    }
    /**
     * <b>showFiguraDowhile</b> muestra la figura usando el ciclo Dowhile F4:
                *  
              * *       
            * * *       
          * * * *     
        * * * * *
     * @param nroNiveles: numero de niveles para la figura
     * showFiguraDowhile 
     */
    public void showFiguraDowhile(int nroNiveles){
        int filas = 1;
        do {
            int nroEspacios = nroNiveles;
            int nroCaracteres = 0;
            do{
                if (nroEspacios > filas)
                    System.out.print("  ");
            }while (--nroEspacios > filas);
            do{
                System.out.print("* ");
            }while (++nroCaracteres < filas);
            System.out.println();
        } while (++filas <= nroNiveles);
    }
    /**
     * <b>showFiguraWhile</b> muestra la figura usando el ciclo while F4:
                *  
              * *       
            * * *       
          * * * *     
        * * * * *
     * @param nroNiveles: numero de niveles para la figura
     * showFiguraWhile 
     */
    public void showFiguraWhile(int nroNiveles){
        int filas = 1;
        while (filas <= nroNiveles){
            int nroEspacios = nroNiveles;
            int nroCaracteres = 0;
            while (nroEspacios-- > filas)
                System.out.print("  ");
            while (nroCaracteres++ < filas)
                System.out.print("* ");
            System.out.println();
            filas++;
        }
    }
}
