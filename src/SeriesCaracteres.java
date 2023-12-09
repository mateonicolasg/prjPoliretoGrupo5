/**
 * Crear las siguientes series de caracteres
 * @author: CodeMasters
 * @version: 1.0
 */
public class SeriesCaracteres {
    /**
     * <b>showSerie1For</b> muestra la serie usando el ciclo for 1:  + - + - + - + ... 
     * @param nroTerminos: numero de terminos para la serie
     * showSerie1For 
     */
    public void showSerie1For (int nroTerminos){
        char par, impar;
        par = '+';
        impar = '-';
        for (int i = 0; i < nroTerminos; i++) {
            if (i % 2 == 0)
                System.out.print(par + " ");
            else
                System.out.print(impar + " ");
        }
    }
    /**
     * <b>showSerie2For</b> muestra la serie usando el ciclo for S2:  + + ++ +++ +++++ ++++++++ +++++++++++++ ...
     * @param nroTerminos: numero de terminos para la serie
     * showSerie2For 
     */
    public void showSerie2For(int nroTerminos){
        String num1, num2;
        num1 = "+";
        num2 = "-";
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
     * <b>showSeri4eFor</b> muestra la serie usando el ciclo for S4:  +  -  *  /  +  -  *  / +  -  *  /  ...
     * @param nroTerminos: numero de terminos para la serie
     * showSerie4For 
     */
    public void showSerie4For(int nroTerminos){
        char[] serie;
        serie = new char[] {'+','-','*','/'};
        // int residuo;
        for (int i = 0; i < nroTerminos; i++) {
            // residuo = i % 4;
            System.out.print(serie[i % 4] + " ");
        }
    }
    /**
     * <b>showSerie5For</b> muestra la serie usando el ciclo for S5:  \  |  /    -   |   \  |  /    -   |    \  |  /    -   |  ....
     * @param nroTerminos: numero de terminos para la serie
     * showSerie5For 
     */
    public void showSerie5For (int nroTerminos){
        String [] patron;
        patron = new String[] {"\\","|","/"," -"," | "};
        for (int i = 0; i < nroTerminos; i++) {
            System.out.print(patron[i%5] + " ");
        }
    }
    /**
    * <b>showSerie6For</b> muestra la serie usando el ciclo for S6:  a  b   c   d   e   f   g   h   ...
    * @param nroTerminos: numero de terminos para la serie
    * showSerie6For 
    */
    public void showSerie6For(int nroTerminos){
        char abecedario;
        abecedario = 97;
        for (int i = 0; i < nroTerminos; i++) {
            if (i == 26)
                abecedario = 97;
            System.out.print(abecedario + " ");
            abecedario += 1;
        }
    }
    /**
    * <b>showSerie7For</b> muestra la serie usando el ciclo for  S6B:  a  +   c   -   e   +   g   -   ...
    * @param nroTerminos: numero de terminos para la serie
    * showSerie7For 
    */
    public void showSerie7For(int nroTerminos){
        char abecedario;
        int signosAlternos;
        abecedario = 97;
        signosAlternos = 0;
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
    * @param nroTerminos: numero de terminos para la serie
    * showSerie8For 
    */
    public void showSerie8For(int nroTerminos){
        char abecedario;
        abecedario = 97;
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
    * @param nroTerminos: numero de terminos para la serie
    * showSerie9For 
    */
    public void showSerie9For(int nroTerminos){
        int num1=0,num2=1,num3;
        char letra='c';
        System.out.print("a "+"b ");
        for (int i = 1; i <= nroTerminos; i++) {
            num3=num1+num2;
            for (int j = 0; j < num3; j++) {
                System.out.print(" "+letra);
            }
            letra++;
           num1=num2;
           num2=num3;
        }
    }
}
