/** 
 * Crea la suguiente serie de numeros: 3, 9, 27, 81, 243, 729, 2187, ... 19683
 * @author Matheus Velasco
 * @version 1.0
*/
public class SerieNumeros_X3 {
// For
    public void serienumeros_X3(int NroTerminos) {
        for (int i = 1, serie = 3; i <= NroTerminos; i++, serie *= 3) {
            System.out.print(serie+", ");
        }
}

// While
/* public void serienumeros_X3(int NroTerminos){
        int i = 1;
        int serie = 3;
        while (i <= NroTerminos){
            System.out.print(serie+", ");
            serie = serie * 3;
            i++;
        }
}*/

// Do While
/*    public void serienumeros_X3(int NroTerminos) {
        int i = 1;
        int serie = 3;
        do {
            System.out.print(serie+", ");
            serie *= 3;
            i++;
        } while (i <= NroTerminos);
        System.out.println();
}*/

}