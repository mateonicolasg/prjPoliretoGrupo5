/** 
 * Crea la suguiente serie de numeros: 2, 4, 8, 16, 32, 64, 128, 256, ... 1024
 * @author Matheus Velasco
 * @version 1.0
*/
public class SerieNumeros_X2 {
// For
    public void serienumeros_X2(int NroTerminos) {
        for (int i = 1, serie = 2; i <= NroTerminos; i++, serie *= 2) {
            System.out.print(serie+", ");
        }
}


public void serienumeros_X2while(int NroTerminos) {
        int i = 1;
        int serie = 2;
        while (i <= NroTerminos) {
            System.out.print(serie+", ");
            serie = serie * 2;
            i++;
        }
    }


public void serienumeros_X2doWhile(int NroTerminos) {
        int i = 1;
        int serie = 2;
        do {
            System.out.print(serie+", ");
            serie *= 2;
            i++;
        } while (i <= NroTerminos);
        System.out.println();
}

}