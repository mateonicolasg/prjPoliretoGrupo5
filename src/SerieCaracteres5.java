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
public class SerieCaracteres5 {
    private String [] patron;
    public SerieCaracteres5(){
        this.patron = new String[] {"\\","|","/"," -"," | "};
    }
    /**
     * <b>showSerieFor</b> muestra la serie usando el ciclo for S5:  \  |  /    -   |   \  |  /    -   |    \  |  /    -   |  ....
     * @param nroTerminos: numero de terminos para la serie
     * showSerieFor 
     */
    public void showSerieFor (int nroTerminos){
        for (int i = 0; i < nroTerminos; i++) {
            System.out.print(patron[i%5] + " ");
        }
    }
    /**
     * <b>showSerieDowhile</b> muestra la serie usando el ciclo Dowhile S5:  \  |  /    -   |   \  |  /    -   |    \  |  /    -   |  ....
     * @param nroTerminos: numero de terminos para la serie
     * showSerieDowhile
     */
    public void showSerieDowhile (int nroTerminos){
        int i = 0;
        do{
            System.out.print(patron[i%5] + " ");
        }while (++i < nroTerminos);
    }
    /**
     * <b>showSerieWhile</b> muestra la serie usando el ciclo while S5:  \  |  /    -   |   \  |  /    -   |    \  |  /    -   |  ....
     * @param nroTerminos: numero de terminos para la serie
     * showSerieWhile
     */
    public void showSerieWhile (int nroTerminos){
        int i = 0;
        while (i < nroTerminos)
            System.out.print(patron[i++%5] + " ");
    }
}
