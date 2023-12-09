/**
 * Crear las siguientes figuras
 * @author: CodeMasters
 * @version: 1.0
 */
public class Figuras {
    /**
     * <b>showFigura3For</b> muestra la figura usando el ciclo for F3:
        *            
        * *          
        * * *        
        * * * *       
        * * * * *
     * @param nroNiveles: numero de niveles para la figura
     * showFigura3For 
     */
    public void showFigura3For(int nroNiveles){
        for (int filas = 1; filas <= nroNiveles; filas++) {
            for (int nroCaracteres = 0; nroCaracteres < filas; nroCaracteres++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /**
     * <b>showFigura4For</b> muestra la figura usando el ciclo for F4:
                *  
              * *       
            * * *       
          * * * *     
        * * * * *
     * @param nroNiveles: numero de niveles para la figura
     * showFigura4For 
     */
    public void showFigura4For(int nroNiveles){
        for (int filas = 1; filas <= nroNiveles; filas++) {
            for (int nroEspacios = nroNiveles; nroEspacios > filas; nroEspacios--) 
                System.out.print("  ");
            for (int nroCaracteres = 0; nroCaracteres < filas; nroCaracteres++) 
                System.out.print("* ");
            System.out.println();
        }
    }
   /**
     * <b>showFigura5For</b> muestra la figura usando el ciclo for F5:	
        *********
         *******
          *****
           ***                     
            *
     * @param nroNiveles: numero de niveles para la figura
     * showFigura5For 
     */
    public void showFigura5For(int nroNiveles){
        for (int filas = nroNiveles; filas > 0; filas--) {
            for (int espacio = nroNiveles; espacio > filas; espacio--) {
                System.out.print(" ");
            }
            for (int nroCaracteres = 0; nroCaracteres < filas; nroCaracteres++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /**
     * <b>showFigura6For</b> muestra la figura usando el ciclo for F6:	
		     *
		    ***
		   *****                    
		  *******
		 *********
     * @param nroNiveles: numero de niveles para la figura
     * showFigura6For 
     */
    public void showFigura6For(int nroNiveles){
        for (int filas = nroNiveles; filas > 0; filas--) {
            for (int espacio = 0; espacio < filas; espacio++) {
                System.out.print(" ");
            }
            for (int nroCaracteres = nroNiveles; nroCaracteres >= filas; nroCaracteres--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /**
     * <b>showFigura16For</b> muestra la figura usando el ciclo for F16:
            +				+
                -		-
                    +                       
                -		-
            +				+
            ....
     * @param nroNiveles: numero de niveles para la figura
     * showFigura16For 
     */
    public void showFigura16For(int nroNiveles){
        System.out.println();
        for (int i = 0; i < nroNiveles; i++) {
            for (int j = 0; j < nroNiveles; j++) {
                if (i==j || i==nroNiveles-j) {
                    if (i%2==0 && j%2==0) {
                        System.out.print("- ");
                    }
                    else
                        System.out.print("+ ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    /**
     * <b>showFigur17aFor</b> muestra la figura usando el ciclo for F17:
            1				1
                0		0
                    1                   
                0		0
            1				1
            ....
     * @param nroNiveles: numero de niveles para la figura
     * showFigura17For 
     */
    public void showFigura17For(int nroNiveles){
        System.out.println();
        for (int i = 0; i < nroNiveles; i++) {
            for (int j = 0; j < nroNiveles; j++) {
                if (i==j || i==nroNiveles-j) {
                    if (i%2==0 && j%2==0) {
                        System.out.print("0 ");
                    }
                    else
                        System.out.print("1 ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
    }
    System.out.println();
    }
    /**
     * <b>showFigura18For</b> muestra la figura usando el ciclo for F18:
            2
            1   2
            1   3   2
            1   4   5   2
            1   5   9   7  2
            1   6   14  16  9  2
            ....
     * @param nroNiveles: numero de niveles para la figura
     * showFigura18For 
     */
    public void showFigura18For(int nroNiveles){
        int[][] arr = new int[nroNiveles][nroNiveles + 1];
        for (int i = 0; i < nroNiveles; i++) {
            arr[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
            arr[i][i + 1] = 2;

            for (int j = 0; j <= i + 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    /**
     * <b>showFigura19For</b> muestra la figura usando el ciclo for F19:
            *
            +   *
            +   3   *                   
            +   4   5   *
            +   5   9   7  *
            +   6   14  16  9  *
     * @param nroNiveles: numero de niveles para la figura
     * showFigura19For 
     */
    public void showFigura19For(int nroNiveles) {
        int[][] arr = new int[nroNiveles][nroNiveles + 1];
        for (int i = 0; i < nroNiveles; i++) {
            arr[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
            arr[i][i + 1] = 2;

            for (int j = 0; j <= i + 1; j++) {
                if (j == 0 && i != 0) {
                    System.out.print(" +");
                } else if (arr[i][j] == 1) {
                    System.out.print(" +");
                } else if (arr[i][j] == 2) {
                    System.out.print(" *");
                } else {
                    System.out.print(" " + arr[i][j]);
                }
            }
            System.out.println();
        }
    }
}
