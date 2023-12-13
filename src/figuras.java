/**
 * Crear las siguientes figuras
 * @author: CodeMasters
 * @version: 1.0
 */
public class Figuras {
    /**
     * <b>showFigura1For</b> muestra la figura usando el ciclo for F1:
        * * * * *
        *       *
        *       *  
        *       *           
        * * * * *
     * @author: David Unaucho
     * @param nroNiveles: numero de niveles para la figura
     * showFigura1For 
     */
    public void showFigura1For(int nroNiveles){
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
     * <b>showFigura2For</b> muestra la figura usando el ciclo for F2:
        * + * + *
        +       +
        *       *  
        +       +           
        * + * + *
     * @author: David Unaucho
     * @param nroNiveles: numero de niveles para la figura
     * showFigura2For 
     */
       public void showFigura2For(int nroNiveles){
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
     * <b>showFigura3For</b> muestra la figura usando el ciclo for F3:
        *            
        * *          
        * * *        
        * * * *       
        * * * * *
     * @author: Mateo Simbaña
     * @param nroNiveles: numero de niveles para la figura
     * showFigura3For 
     */
    public void showFigura3For(int nroNiveles){
        System.out.println();
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
     * @author: Mateo Simbaña
     * @param nroNiveles: numero de niveles para la figura
     * showFigura4For 
     */
    public void showFigura4For(int nroNiveles){
        System.out.println();
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
     * @author: Mateo Simbaña
     * @param nroNiveles: numero de niveles para la figura
     * showFigura5For 
     */
    public void showFigura5For(int nroNiveles){
        System.out.println();
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
     * @author: Mateo Simbaña
     * @param nroNiveles: numero de niveles para la figura
     * showFigura6For 
     */
    public void showFigura6For(int nroNiveles){
        System.out.println();
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
     * <b>showFigura7For</b> muestra la figura usando el ciclo for F7:	
         ___
            |___
                |___
                    |___
                        |___ 
     * @author: Edison Vera
     * @param nroNiveles: numero de niveles para la figura
     * showFigura7For 
     */
    public void showFigura7For(int nroNiveles){
        int limiteEspacio = 0;
        int barraEspaciadora = 32; // espacio
        int barraVertical = 124; // Barra vertical
        int guion = 45; // Guion
    
    
        for(int i=1; i<nroNiveles; i++){
            if(i % 2 != 0){
                for(int k=0; k<limiteEspacio; k++){               // Permite 
                    System.out.print((char)barraEspaciadora);    // dar saltos  
                }                                                 // de espacios
                for(int j=0; j<3; j++){
                    System.out.print((char)guion);
                }
                System.out.println();
                limiteEspacio+=2;
            }
            else{
                for(int k=0; k<limiteEspacio; k++){               // Permite 
                    System.out.print((char)barraEspaciadora);    // dar saltos  
                }                                                 // de espacios
                System.out.println((char)barraVertical);
                limiteEspacio+=1;
            }
        }
    }
    /**
     * <b>showFigura8For</b> muestra la figura usando el ciclo for F8:	
                        ___
                    ___|
                ___|                    
            ___|
        ___| 
     * @author: Edison Vera
     * @param nroNiveles: numero de niveles para la figura
     * showFigura8For 
     */
    public void showFigura8For(int nroNiveles){
        int barraEspaciadora = 32; // espacio
        int barraVertical = 124; // Barra vertical
        int guion = 45; // Guion
        
        int i = 1;
        while(nroNiveles>=0){
            for(int n=nroNiveles; n>0; n--){
                System.out.print((char)barraEspaciadora);
            }
            // System.out.println("aqui");
            
            if(i % 2 != 0){
                for(int j=0; j<3; j++){
                    System.out.print((char)guion);
                }
                System.out.println();
                nroNiveles-=1;
            }
            else{
                System.out.println((char)barraVertical);
                nroNiveles-=2;
            }
            i++;
        }
    }
    /**
     * <b>showFigura9For</b> muestra la figura usando el ciclo for F9:	
                            ___   
                        ___|   |___
                    ___|	       |___
                ___|		           |___
            ___|			               |___
     * @author: Mateo Simbaña 
     * @param nroNiveles: numero de niveles para la figura
     * showFigura9For
     */
    public void showFigura9For(int nroNiveles){
        // int especial = nroNiveles;
        for (int espacio1 = 0; espacio1 < nroNiveles; espacio1++)
            System.out.print("    ");
        System.out.print("___");
        System.out.println();
        for (int filas = 0; filas < nroNiveles; filas++){
            // especial--;
            for (int espacio2 = 1; espacio2 < nroNiveles - filas; espacio2++)
                System.out.print("    ");
            System.out.print("___|");
            for (int espacio3 = nroNiveles + 1; espacio3 > nroNiveles - filas; espacio3--)
                System.out.print("   ");
            for (int espacio4 = nroNiveles; espacio4 > nroNiveles - filas; espacio4--)
                System.out.print("     ");
            System.out.print("|___");
            System.out.println();
        }

    }
    /**
     * <b>showFigura10For</b> muestra la figura usando el ciclo for F10:	
            _+_
                |_-_
                    |_+_                        
                        |_-_
                            |_+_
                                |
     * @author: Mateo Simbaña 
     * @param nroNiveles: numero de niveles para la figura
     * showFigura10For
     */
    public void showFigura10For (int nroNiveles){
        // int especial = nroNiveles;
        for (int filas = nroNiveles; filas > 0; filas--){
            // --especial;
            System.out.println(((filas%2 == 0) ? "_-_" : "_+_"));
            System.out.print("   ");
            for (int espacios = 0; espacios < nroNiveles - filas; espacios++)
                System.out.print("    ");
            // if (filas%2 == 0)
            //     System.out.print("|_-_");
            // else
            //     System.out.print("|_+_");
            if (filas > 1)
                System.out.print("|");
        }
        System.out.println();
    }
    /**
     * <b>showFigura11For</b> muestra la figura usando el ciclo for F11:	
            | _ 
               | _ _
                    | _ _ _
                           | _ _ _ _            
                                    | _ _ _ _ _
     * @author: Mateo Simbaña 
     * @param nroNiveles: numero de niveles para la figura
     * showFigura11For
     */  
    public void showFigura11For (int nroNiveles){
        StringBuilder caracteres = new StringBuilder("|");
        StringBuilder espacios = new StringBuilder(""); 
        StringBuilder addespacios = new StringBuilder("   ");
        for (int filas = 0; filas < nroNiveles; filas++){
            System.out.println(caracteres.append(" _"));
            System.out.print(espacios.append(addespacios));
            addespacios.append("  ");
        }
    }
    /**
     * <b>showFigura12For</b> muestra la figura usando el ciclo for F12:	
        ...
        123456789
        12345678
        1234567
        123456
        12345
        1234
        123
        12                  
        1
     * @author: Edison Vera
     * @param nroNiveles: numero de niveles para la figura
     * showFigura12For
     */  
    public void showFigura12For(int nroNiveles){
        for(int i=nroNiveles; i>0; i--){
        
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    /**
     * <b>showFigura13For</b> muestra la figura usando el ciclo for F13:	
        1
        12
        123
        1234
        12345               
        123456
        1234567
        12345678
        123456789
        ...
     * @author: Edison Vera
     * @param nroNiveles: numero de niveles para la figura
     * showFigura13For
     */  
    public void showFigura13For(int nroNiveles){
        for(int i=0; i<=nroNiveles; i++){
        
            for(int j=1; j<=i; j++){
                System.out.print(j);
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
     * @author: Francisco Negrete          
     * @param nroNiveles: numero de niveles para la figura
     * showFigura16For 
     */
    public void showFigura16For(int nroNiveles){
        System.out.println();
        for (int i = 0; i < nroNiveles; i++) {
            for (int j = 0; j < nroNiveles; j++) {
                if (i==j || i==nroNiveles-1-j) {
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
    }
    /**
     * <b>showFigur17aFor</b> muestra la figura usando el ciclo for F17:
            1				1
                0		0
                    1                   
                0		0
            1				1
            ....
     * @author: Francisco Negrete     
     * @param nroNiveles: numero de niveles para la figura
     * showFigura17For 
     */
    public void showFigura17For(int nroNiveles){
        System.out.println();
        for (int i = 0; i < nroNiveles; i++) {
            for (int j = 0; j < nroNiveles; j++) {
                if (i==j || i==nroNiveles-1-j) {
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
     * @author: Matheus Velasco
     * @param nroNiveles: numero de niveles para la figura
     * showFigura18For 
     */
    public void showFigura18For(int nroNiveles){
        int[][] arr = new int[nroNiveles][nroNiveles + 1];
        System.out.println();
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
     * @author: Matheus Velasco
     * @param nroNiveles: numero de niveles para la figura
     * showFigura19For 
     */
    public void showFigura19For(int nroNiveles) {
        int[][] arr = new int[nroNiveles][nroNiveles + 1];
        System.out.println();
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
