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

    
    public class Figura1 {
    /**
     * <b>showFiguraFor</b> muestra la figura usando el ciclo for F1:
            * * * * *
            *       *
            *       *  
            *       *           
            * * * * *
     * @param nroNiveles: numero de niveles para la figura
     * showFiguraFor 
     */
    public void showFiguraFor1(int nroNiveles){

        for (int i = 1; i <= nroNiveles; i++) {
            for (int j = 1; j <= nroNiveles; j++) {
                if (i == 1 || i == nroNiveles || j == 1 || j == nroNiveles || i == (nroNiveles / 2) + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
    
          }
       }
    /**
     * <b>showFiguraFor</b> muestra la figura usando el ciclo while F1:
            * * * * *
            *       *
            *       *  
            *       *           
            * * * * *
     * @param nroNiveles: numero de niveles para la figura
     * showFiguraFor 
     */
    public void showFiguraWhile1(int nroNiveles){
      int i = 1;
      while (i <= nroNiveles) {
          int j = 1;
          while (j <= nroNiveles) {
              if (i == 1 || i == nroNiveles || j == 1 || j == nroNiveles || i == (nroNiveles / 2) + 1) {
                  System.out.print("* ");
              } else {
                  System.out.print("  ");
              }
              j++;
          }
          System.out.println();
          i++;

    }
  }
  /**
     * <b>showFiguraFor</b> muestra la figura usando el ciclo Dowhile F1:
            * * * * *
            *       *
            *       *  
            *       *           
            * * * * *
     * @param nroNiveles: numero de niveles para la figura
     * showFiguraFor 
     */
  public void showFiguraDoWhile1(int nroNiveles) {
    int i = 1;

    do {
        int j = 1;
        do {
            if (i == 1 || i == nroNiveles || j == 1 || j == nroNiveles || i == (nroNiveles / 2) + 1) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
            j++;
        } while (j <= nroNiveles);
        System.out.println();
        i++;
    } while (i <= nroNiveles);
}
}

