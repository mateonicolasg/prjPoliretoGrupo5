/** 
 * Crea la suguiente serie de numeros: 3, 9, 27, 81, 243, 729, 2187, ... 19683
 * @author Matheus Velasco
 * @version 1.0
*/
public class SerieNumeros_X3 {
    public void serienumeros_X3(int NroTerminos){
        int i = 1;
        int serie = 3;
        while (i <= NroTerminos){
            System.out.print(serie+", ");
            serie = serie * 3;
            i++;
        }
    }
}
