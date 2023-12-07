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
public class Figura6 {
    private int filas;
    private int nroCaracteres;
    private int espacio;

    public Figura6(){
        this.filas = filas;
        this.nroCaracteres = nroCaracteres;
        this.espacio = espacio;
    }
    /**
     * <b>showFiguraFor</b> muestra la figura usando el ciclo for F6:	
		     *
		    ***
		   *****                    
		  *******
		 *********
     * @param nroNiveles: numero de niveles para la figura
     * showFiguraFor 
     */
    public void showFiguraFor(int nroNiveles){
        for (filas = nroNiveles; filas > 0; filas--) {
            for (espacio = 0; espacio < filas; espacio++) {
                System.out.print(" ");
            }
            for (nroCaracteres = nroNiveles; nroCaracteres >= filas; nroCaracteres--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
