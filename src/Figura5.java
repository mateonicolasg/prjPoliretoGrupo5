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
public class Figura5 {
    private int filas;
    private int nroCaracteres;
    private int espacio;

    public Figura5(){
        this.filas = filas;
        this.nroCaracteres = nroCaracteres;
        this.espacio = espacio;
    }
   /**
     * <b>showFiguraFor</b> muestra la figura usando el ciclo for F5:	
        *********
         *******
          *****
           ***                     
            *
     * @param nroNiveles: numero de niveles para la figura
     * showFiguraFor 
     */
    public void showFiguraFor(int nroNiveles){
        for (filas = nroNiveles; filas > 0; filas--) {
            for (espacio = nroNiveles; espacio > filas; espacio--) {
                System.out.print(" ");
            }
            for (nroCaracteres = 0; nroCaracteres < filas; nroCaracteres++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
