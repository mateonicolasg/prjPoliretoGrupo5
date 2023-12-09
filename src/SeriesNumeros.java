/**
 * Crear las siguientes series de números
 * @author: CodeMasters
 * @version: 1.0
 */
public class SeriesNumeros {
    /**
     * <b>showSerie1For</b> muestra la serie usando el ciclo for S1:  0 1 1 2 3 5 8 13 ...
     * @param nroTerminos: numero de terminos para la serie
     * showSerie1For 
     */
    public void showSerie1For(int nroTerminos) {
        int termino1, termino2, termino3;
        termino1 = 0;
        termino2 = 1;
        for (int i = 1; i <= nroTerminos; ++i) {
            if (i == 1) {
                System.out.print(termino1 + " ");
                continue;
            }
            if (i == 2) {
                System.out.print(termino2 + " ");
                continue;
            }
    
            termino3 = termino2 + termino1;
            termino1 = termino2;
            termino2 = termino3;
            System.out.print(termino3 + " ");
        }
        System.out.println();
    }
    /**
     * <b>showSerie2For</b> muestra la serie usando el ciclo for S2:  1 0 3 0 5 0 7 0 9 ...
     * @param nroTerminos: numero de terminos para la serie
     * showSerie2For 
     */
    public void showSerie2For(int nroTerminos) {
        int valor = 1; // Iniciar con el primer valor
        for (int i = 0; i < nroTerminos; i++) {
            System.out.print(valor + " ");
            if (i % 2 == 0) {
                valor += 2; // Si el índice es par, aumenta en 2
            } else {
                valor++; // Si el índice es impar, aumenta en 1
            }
        }
        // Salto de línea al final de la serie
        System.out.println();
    }
    /**
     * <b>showSerie3For</b> muestra la serie usando el ciclo for S3:  0/1  1/3  1/5  2/7  3/9   5/11  8/13  13/15 ...
     * @param nroTerminos: numero de terminos para la serie
     * showSerie3For 
     */
    public void showSerie3For(int nroTerminos) {
        int[] numeradores;
        int[] denominadores;
        numeradores = new int[nroTerminos];
        denominadores = new int[nroTerminos];
        numeradores[0] = 0;
        numeradores[1] = 1;
        denominadores[0] = 1;
        denominadores[1] = 3;
        for (int i = 2; i < nroTerminos; i++) {
            numeradores[i] = numeradores[i - 1] + numeradores[i - 2];
            denominadores[i] = denominadores[i - 1] + 2;
        }
        for (int i = 0; i < numeradores.length; i++) {
            System.out.print(numeradores[i] + "/" + denominadores[i] + "  ");
        }
    }
    /**
     * <b>showSerie4For</b> muestra la serie usando el ciclo for S4:  0/2  1/4  1/6  2/8  3/10  5/12  8/14  13/16 ...
     * @param nroTerminos: numero de terminos para la serie
     * showSerie4For 
     */
    public void showSerie4For(int nroTerminos){
        int numerador1=0,numerador2=1,denominadorpar=4;
        switch(nroTerminos){
            case 1:
                    System.out.print("0/2 ");
            break;
            case 2:
                    System.out.print("0/2 "+"1/4 ");
            break;
            default:
            System.out.print("0/2 "+"1/4 ");
                for(int i=0;i<nroTerminos-2;i++){
                        int numarador3=numerador1+numerador2;
                        denominadorpar+=2;
                        System.out.print(numarador3+"/"+denominadorpar+" ");
                        numerador1=numerador2;
                        numerador2=numarador3;
                }
            break;
        }
    }
    /**
     * <b>showSerie9For</b> muestra la serie usando el ciclo for S9:  2, 4, 8, 16, 32, 64, 128, 256, ...
     * @param nroTerminos: numero de terminos para la serie
     * showSerie9For 
     */
    public void showSerie9For(int NroTerminos) {
        for (int i = 1, serie = 2; i <= NroTerminos; i++, serie *= 2) {
            System.out.print(serie+", ");
        }
    }
    /**
     * <b>showSerie10For</b> muestra la serie usando el ciclo for S10: 3, 9, 27, 81, 243, 729, 2187, ...
     * @param nroTerminos: numero de terminos para la serie
     * showSerie10For 
     */    
    public void showSerie10For(int NroTerminos) {
        for (int i = 1, serie = 3; i <= NroTerminos; i++, serie *= 3) {
            System.out.print(serie+", ");
        }
    }
    /**
     * <b>showSerie12For</b> muestra la serie usando el ciclo for S12: 2  6   12  20  30  42  56  72  ...
     * @param nroTerminos: numero de terminos para la serie
     * showSerie12For 
     */
    public void showSerie12For(int nroTerminos){
        int primerFactor, segundoFactor;
        primerFactor = 2;
        segundoFactor = 1;
        for (int i = 0; i < nroTerminos; i++) 
            System.out.print(((primerFactor++)*(segundoFactor++)) + " ");
            // primerFactor++;
            // segundoFactor++;
     }
}
