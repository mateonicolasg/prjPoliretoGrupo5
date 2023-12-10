/**
 * Crear las siguientes cadenas de caracteres
 * @author: CodeMasters
 * @version: 1.0
 */
public class CadenasCaracteres {
    /**
     * <b>showFrase5For</b> muestra la cadena usando el ciclo for C05: Pedir una frase y presentar la invertida con las vocales en mayusculas. 
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
     * @param frase: frase en mayúsculas y sin la J.
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
