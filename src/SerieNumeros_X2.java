/** 
 * Crea la suguiente serie de numeros: 2, 4, 8, 16, 32, 64, 128, 256, ... 1024
 * @author Matheus Velasco
 * @version 1.0
*/
public class SerieNumeros_X2 {
    public void serienumeros_X2(int NroTerminos) {
        int i = 1;
        int serie = 2;
        while (i <= NroTerminos) {
            System.out.print(serie+", ");
            serie = serie * 2;
            i++;
        }
    }
}
