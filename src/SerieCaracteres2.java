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
public class SerieCaracteres2 {
    private String num1, num2;
    public SerieCaracteres2(){
        this.num1 = "+";
        this.num2 = "+";
    }
    /**
     * <b>showSerieFor</b> muestra la serie usando el ciclo for S2:  + + ++ +++ +++++ ++++++++ +++++++++++++ ...
     * @param nroTerminos: numero de terminos para la serie
     * showSerieFor 
     */
    public void showSerieFor(int nroTerminos){
        if (nroTerminos < 1)
            System.out.println(num1);
        else if (nroTerminos < 2)
            System.out.println(num1 + " " + num2);
        else
            System.out.print(num1 + " " + num2 + " ");
            for (int i = 2; i < nroTerminos; i++) {
                String suma = num1 + num2;
                System.out.print(suma + " ");
                num1 = num2;
                num2 = suma;
            }
    }
    /**
     * <b>showSerieDowhile</b> muestra la serie usando el ciclo Dowhile S2:  + + ++ +++ +++++ ++++++++ +++++++++++++ ...
     * @param nroTerminos: numero de terminos para la serie
     * showSerieDowhile
     */
    public void showSerieDowhile(int nroTerminos){
        num1 = "+";
        num2 = "+";
        if (nroTerminos < 1)
            System.out.println(num1);
        else if (nroTerminos < 2)
            System.out.println(num1 + " " + num2);
        else {
            int i = 2;
            System.out.print(num1 + " " + num2 + " ");
            do {
                String suma = num1 + num2;
                System.out.print(suma + " ");
                num1 = num2;
                num2 = suma;
                // i++;
            } while (++i < nroTerminos);
        }      
    }
    /**
     * <b>showSerieWhile</b> muestra la serie usando el ciclo while S2:  + + ++ +++ +++++ ++++++++ +++++++++++++ ...
     * @param nroTerminos: numero de terminos para la serie
     * showSerieWhile
     */
    public void showSerieWhile(int nroTerminos){
        num1 = "+";
        num2 = "+";
        if (nroTerminos < 1)
            System.out.println(num1);
        else if (nroTerminos < 2)
            System.out.println(num1 + " " + num2);
        else {
            int i = 2;
            System.out.print(num1 + " " + num2 + " ");
            while (i++ < nroTerminos){
                String suma = num1 + num2;
                System.out.print(suma + " ");
                num1 = num2;
                num2 = suma;
                // i++;
            }
        }
    }
}