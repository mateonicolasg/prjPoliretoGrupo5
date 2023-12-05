/*Copyright (C) 2K23, David Unaucho
 * (Nombre grupo), david.unaucho@epn.edu.ec
 * Version 1.0
 */

 /**
  * Crea la siguiente figura
  * @author David Unaucho
  * @version 1.0
  */

    // Método para generar la figura
public class Figura2 {
 /**
     * <b>showFiguraFor2</b> muestra la figura usando el ciclo for F2:

            * + * + *
            +       +          
            *       *   
            +       +
            * + * + *
* @param nroNiveles: numero de niveles para la figura
     * showFiguraFor2 
     */
    public void showFiguraFor2(int nroNiveles){
        

        for (int i = 1; i <= nroNiveles; i++) {
            for (int j = 1; j <= nroNiveles; j++) {
                if ((i == 1 || i == nroNiveles || i == (nroNiveles / 2) + 1) && (j % 2 != 0)) {
                    System.out.print("* ");
                } else if ((j == 1 || j == nroNiveles) && (i % 2 == 0)) {
                    System.out.print("+ ");
                } else {
                    System.out.print("  ");
                }
            }


}
}
 /**
     * <b>showFiguraWhile</b> muestra la figura usando el ciclo while F2:

            * + * + *
            +       +          
            *       *   
            +       +
            * + * + *
* @param nroNiveles: numero de niveles para la figura
     * showFiguraWhile 
     */
    public void showFiguraWhile2(int nroNiveles){
    int i = 1;

    while (i <= nroNiveles) {
        int j = 1;
        while (j <= nroNiveles) {
            if ((i == 1 || i == nroNiveles || i == (nroNiveles / 2) + 1) && (j % 2 != 0)) {
                System.out.print("* ");
            } else if ((j == 1 || j == nroNiveles) && (i % 2 == 0)) {
                System.out.print("+ ");
            } else {
                System.out.print("  ");
            }
            j++;
        }
        System.out.println(); // Salto de línea al final de cada fila
        i++;

    }
}
/**
     * <b>showFiguraDoWhile</b> muestra la figura usando el ciclo Dowhile F2:

            * + * + *
            +       +          
            *       *   
            +       +
            * + * + *
* @param nroNiveles: numero de niveles para la figura
     * showFiguraDowhile 
     */

    public void showFiguraDoWhile2(int nroNiveles){
    int i = 1;

    do {
        int j = 1;
        do {
            if ((i == 1 || i == nroNiveles || i == (nroNiveles / 2) + 1) && (j % 2 != 0)) {
                System.out.print("* ");
            } else if ((j == 1 || j == nroNiveles) && (i % 2 == 0)) {
                System.out.print("+ ");
            } else {
                System.out.print("  ");
            }
            j++;
        } while (j <= nroNiveles);
        System.out.println(); // Salto de línea al final de cada fila
        i++;
    } while (i <= nroNiveles);
    }
}

