/**
 * Copyright (C) 2K23B, Mateo Simbaña
 * () mateo.simbana@epn.edu.ec
 * Version 1.0
 */

/**
 * Crea la siguiente figura
 * @author: Mateo Simbaña
 * @version: 1.0
 */
public class Figura3 {
    /**
     * <b>showFiguraFor</b> muestra la figura usando el ciclo for F3:
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
            for (int nroCaracteres = 0; nroCaracteres < filas; nroCaracteres++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /**
     * <b>showFiguraFor</b> muestra la figura usando el ciclo Dowhile F3:
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
            int nroCaracteres = 0;
            do {
                System.out.print("* ");
            } while (++nroCaracteres < filas);
            System.out.println();
        }while (++filas <= nroNiveles);
    }   
    /**
     * <b>showFiguraWhile</b> muestra la figura usando el ciclo while F3:
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
            int nroCaracteres = 0;
            while (nroCaracteres++ < filas)
                System.out.print("* ");
            System.out.println();
            filas++;
        }
    }   
}
