/**
 * Crear las siguientes series de caracteres
 * @author: CodeMasters
 * @version: 1.0
 */
public class SeriesCaracteres {
    /**
     * <b>showSerie1For</b> muestra la serie usando el ciclo for 1:  + - + - + - + ...
     * @author: Mateo Simbaña 
     * @param nroTerminos: numero de terminos para la serie
     * showSerie1For 
     */
    public void showSerie1For (int nroTerminos){
        char par, impar;
        par = '+';
        impar = '-';
        System.out.println();
        for (int i = 0; i < nroTerminos; i++) {
            if (i % 2 == 0)
                System.out.print(par + " ");
            else
                System.out.print(impar + " ");
        }
    }
    /**
     * <b>showSerie2For</b> muestra la serie usando el ciclo for S2:  + + ++ +++ +++++ ++++++++ +++++++++++++ ...
     * @author: Mateo Simbaña
     * @param nroTerminos: numero de terminos para la serie
     * showSerie2For 
     */
    public void showSerie2For(int nroTerminos){
        String num1, num2;
        num1 = "+";
        num2 = "-";
        System.out.println();
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
     * <b>showSerie3For</b> muestra la serie usando el ciclo for S3:  ++ +++ +++++ +++++++ +++++++++++ +++++++++++++ ...
     * @author: David Unaucho
     * @param nroTerminos: numero de terminos para la serie
     * showSerie3For 
     */ 
    public void showSerie3For (int nroTerminos){
        char num1 = '+';
        int num = 2;
        int contador;
        while (nroTerminos > 0) {
            contador = 0;
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    contador = 1;
                    break;
                }
            }
            if (contador == 0) {
                --nroTerminos;
                for (int j = 0; j < num; ++j) {
                    System.out.print(num1);
                }
                System.out.print(" ");
            }
            ++num;
        }
        System.out.println();
    }
    /**
     * <b>showSeri4eFor</b> muestra la serie usando el ciclo for S4:  +  -  *  /  +  -  *  / +  -  *  /  ...
     * @author: Mateo Simbaña
     * @param nroTerminos: numero de terminos para la serie
     * showSerie4For 
     */
    public void showSerie4For(int nroTerminos){
        char[] serie;
        serie = new char[] {'+','-','*','/'};
        // int residuo;
        System.out.println();
        for (int i = 0; i < nroTerminos; i++) {
            // residuo = i % 4;
            System.out.print(serie[i % 4] + " ");
        }
    }
    /**
     * <b>showSerie5For</b> muestra la serie usando el ciclo for S5:  \  |  /    -   |   \  |  /    -   |    \  |  /    -   |  ....
     * @author: Mateo Simbaña
     * @param nroTerminos: numero de terminos para la serie
     * showSerie5For 
     */
    public void showSerie5For (int nroTerminos){
        String [] patron;
        patron = new String[] {"\\","|","/"," -"," | "};
        System.out.println();
        for (int i = 0; i < nroTerminos; i++) {
            System.out.print(patron[i%5] + " ");
        }
    }
    /**
    * <b>showSerie6For</b> muestra la serie usando el ciclo for S6:  a  b   c   d   e   f   g   h   ...
    * @author: Mateo Simbaña
    * @param nroTerminos: numero de terminos para la serie
    * showSerie6For 
    */
    public void showSerie6For(int nroTerminos){
        char abecedario;
        abecedario = 97;
        System.out.println();
        for (int i = 0; i < nroTerminos; i++) {
            if (i == 26)
                abecedario = 97;
            System.out.print(abecedario + " ");
            abecedario += 1;
        }
    }
    /**
    * <b>showSerie7For</b> muestra la serie usando el ciclo for  S6B:  a  +   c   -   e   +   g   -   ...
    * @author: Mateo Simbaña
    * @param nroTerminos: numero de terminos para la serie
    * showSerie7For 
    */
    public void showSerie7For(int nroTerminos){
        char abecedario;
        int signosAlternos;
        abecedario = 97;
        signosAlternos = 0;
        System.out.println();
        for (int i = 0; i < nroTerminos; i++) {
            if (i== 26)
                abecedario = 97;
            if ((i % 2) == 0)
                System.out.print(abecedario++ + " ");
            else if (signosAlternos % 2 == 0){
                System.out.print("+ " );
                signosAlternos++;
            }
            else { 
                System.out.print("- ");
                signosAlternos++;
            }
        }
    }
    /**
    * <b>showSerie8For</b> muestra la serie usando el ciclo for S7:  aa   bbbb  cccccc  dddddddd    ...
    * @author: Mateo Simbaña
    * @param nroTerminos: numero de terminos para la serie
    * showSerie8For 
    */
    public void showSerie8For(int nroTerminos){
        char abecedario;
        abecedario = 97;
        System.out.println();
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
    * <b>showSerie9For</b> muestra la serie usando el ciclo for S9: a  b  c  dd  eee  fffff  gggggggg ...
    * @author: Francisco Negrete
    * @param nroTerminos: numero de terminos para la serie
    * showSerie9For 
    */
    public void showSerie9For(int nroTerminos){
        int num1=0,num2=1,num3;
        char letra='c';
        System.out.print("a "+" b ");
        for (int i = 1; i <= nroTerminos-2; i++) {
            num3=num1+num2;
            for (int j = 0; j < num3; j++) {
                System.out.print(" "+letra);
            }
            letra++;
           num1=num2;
           num2=num3;
           System.out.print(" ");
        }
    }
    /**
    * <b>showSerie10For</b> muestra la serie usando el ciclo for S10:  a  bbb  ccccc  ddddddd eeeeeeeee...            
    * @author: Edison Vera
    * @param nroTerminos: numero de terminos para la serie
    * showSerie9For 
    */
    public void showSerie10For(int nroTerminos){
        int codigoA = 97;
        for(int j=1; j<nroTerminos * 2; j+=2){
            
            for (int i = 0; i < j; i++) {
                System.out.print((char)codigoA);
            }
            System.out.print(" ");
            codigoA++;
        }
    }
}
