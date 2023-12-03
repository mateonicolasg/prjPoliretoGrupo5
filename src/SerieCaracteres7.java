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
public class SerieCaracteres7 {
    private char abecedario;
    public SerieCaracteres7(){
        this.abecedario = 97;
    }
    /**
    * <b>showSerieFor</b> muestra la serie usando el ciclo for S7:  aa   bbbb  cccccc  dddddddd    ...
    * @param nroTerminos: numero de terminos para la serie
    * showSerieFor 
    */
    public void showSerieFor(int nroTerminos){
        for (int i = 1; i < nroTerminos; i++) {
            if (i == 26)
                abecedario = 97;
            for (int j = 0; j < (i*2); j++)
                System.out.print(abecedario);
            abecedario++;
            System.out.print(" ");
        }
    }
    /**
    * <b>showSerieDowhile</b> muestra la serie usando el ciclo Dowhile S7:  aa   bbbb  cccccc  dddddddd    ...
    * @param nroTerminos: numero de terminos para la serie
    * showSerieDowhile
    */
    public void showSerieDowhile(int nroTerminos){
        int i = 1;
        abecedario = 97;
        do{
           if (i == 26)
                abecedario = 97;
            int j = 0;
            do{
                System.out.print(abecedario);
            } while (++j < i*2);
                abecedario++;
                System.out.print(" ");  
        }while(++i < nroTerminos);
    }
    /**
    * <b>showSerieWhile</b> muestra la serie usando el ciclo while S7:  aa   bbbb  cccccc  dddddddd    ...
    * @param nroTerminos: numero de terminos para la serie
    * showSerieWhile
    */
    public void showSerieWhile(int nroTerminos){
        int i = 0;
        abecedario = 97;
        while(++i < nroTerminos){
            if (i == 26)
                abecedario = 97;
            int j = 0;
            while (j++ < i*2)
                System.out.print(abecedario);
            abecedario++;
            // i++;
            System.out.print(" "); 
        }
    }
}
