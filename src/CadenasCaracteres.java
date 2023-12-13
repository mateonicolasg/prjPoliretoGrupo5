/**
 * Crear las siguientes cadenas de caracteres
 * @author: CodeMasters
 * @version: 1.0
 */
public class CadenasCaracteres {
     /**
     * <b>showFrase1For</b> muestra el número de vocales de una cadena usando el ciclo forC01) Pedir una frase y contador las vocales. 
     * @author: David Unaucho
     * @param frase: frase para contar las vocales
     * showFrase1For
     */
    public void showFrase1For(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char caracter = Character.toLowerCase(frase.charAt(i));
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        System.out.println("El número de vocales en la frase es: " + contador);
        
    }
     /**
     * <b>showFrase2For</b> muestra el número de letras de una cadena usando el ciclo for C02) Pedir una frase y contador las letras. 
     * @author: David Unaucho
     * @param frase: frase para contar las letras 
     * showFrase2For
     */
    public void showFrase2For(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (Character.isLetter(caracter)) {
                contador++;
            }
        }
        System.out.println("La frase tiene " + contador + " letras.");
    }
     /**
     * <b>showFrase3For</b> muestra la cadena usando el ciclo for C03: Pedir una frase y una vocal, eliminar la vocal ingresada de la frase.
     * @author: Edison Vera
     * @param frase: frase para eliminar la letra que el usuario escoja
     * @param letra: letra que se eliminará en la frase
     * showFrase3For
     */
    public void showFrase3For (String frase, char letra){
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == letra){
                System.out.print(" ");
            }
            else{
                System.out.print(frase.charAt(i));
            }
        }
    }
     /**
     * <b>showFrase4For</b> muestra la cadena usando el ciclo for C04: Pedir una frase y una letra, eliminar la letra ingresada de la frase.
     * @author: Mateo Simbaña
     * @param frase: frase para eliminar la letra que el usuario escoja
     * @param letra: letra que se eliminará en la frase
     * showFrase4For
     */
    public void showFrase4For (String frase, char letra){
        String fraseSinLetra = frase.replace(letra, ' ');
        System.out.println();
        System.out.print(fraseSinLetra);
    }   
    /**
     * <b>showFrase5For</b> muestra la cadena usando el ciclo for C05: Pedir una frase y presentar la invertida con las vocales en mayusculas. 
     * @author: Mateo Simbaña
     * @param frase: frase para invertir con las vocales en mayúsculas
     * showFrase5For
     */
    public void showFrase5For (String frase){
        char [] fraseCaracteres;
        fraseCaracteres = frase.toCharArray();
        System.out.println();
        for (int i = fraseCaracteres.length - 1; i >= 0; i--) {
            if (fraseCaracteres[i] == 'a' || fraseCaracteres[i] == 'e' || fraseCaracteres[i] == 'i' || fraseCaracteres[i] == 'o' || fraseCaracteres[i] == 'u'){
                fraseCaracteres[i] = Character.toUpperCase(fraseCaracteres[i]);
                System.out.print(fraseCaracteres[i]);
            }
            else
                System.out.print(fraseCaracteres[i]);
        }
    }
    /**
     * <b>showFrase6For</b> muestra la cadena usando el ciclo for C06: Pedir una frase y presentar la invertida con las letras en mayusculas. 
     * @author: Mateo Simbaña
     * @param frase: frase para invertir con las letras en mayúsculas
     * showFrase6For
     */
    public void showFrase6For (String frase){
        char [] fraseCaracteres;
        fraseCaracteres = frase.toCharArray();
        System.out.println();
        for (int i = fraseCaracteres.length - 1; i >= 0; i--) {
            if (fraseCaracteres[i] == 'a' || fraseCaracteres[i] == 'e' || fraseCaracteres[i] == 'i' || fraseCaracteres[i] == 'o' || fraseCaracteres[i] == 'u')
                System.out.print(fraseCaracteres[i]);
            else {
                fraseCaracteres[i] = Character.toUpperCase(fraseCaracteres[i]);
                System.out.print(fraseCaracteres[i]);
            }
        }
    }
    /**
     * <b>showFrase7For</b> muestra la cadena usando el ciclo foreach C07: Pedir una frase y presentarla en mayusculas y sin la J.
     * @author: Mateo Simbaña
     * @param frase: frase para presentarla en mayúsculas y sin la J 
     * showFrase7For
     */
    public void showFrase7For (String frase){
        char [] fraseCaracteres;
        fraseCaracteres = frase.toCharArray();
        System.out.println();
        for (char fraseInvertida : fraseCaracteres) {
            if (fraseInvertida != 'j')
                System.out.print(Character.toUpperCase(fraseInvertida));
            }
    } 
    /**
     * <b>showFrase9For</b> muestra la cadena usando el ciclo for C09: Ingresa una frase y convertir una letra a mayusculas y otra a minisculas 
     * @author: Mateo Simbaña
     * @param frase: frase para convertir una letra en mayúscula y otra en minúscula
     * showFrase9For
     */
    public void showFrase9For (String frase){
        char [] fraseCaracteres;
        fraseCaracteres = frase.toCharArray();
        System.out.println();
        for (int i = 0; i < fraseCaracteres.length; i++) {
            if (i % 2 == 0)
                System.out.print(Character.toUpperCase(fraseCaracteres[i]));
            else 
                System.out.print(fraseCaracteres[i]);
        }
    }
}
