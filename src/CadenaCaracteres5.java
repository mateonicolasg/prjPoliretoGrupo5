/**
 * Copyright (C) 2K23B, Mateo Simbaña
 * () mateo.simbana@epn.edu.ec
 * Version 1.0
 */

/**
 * Crea la siguiente cadena de caracteres
 * @author: Mateo Simbaña
 * @version: 1.0
 */
public class CadenaCaracteres5 {
    private char [] fraseCaracteres;
    public CadenaCaracteres5(){
        
    }
    /**
     * <b>showFrase</b> muestra la cadena usando el ciclo for C05: Pedir una frase y presentar la invertida con las vocales en mayusculas. 
     * @param frase: frase para invertir con las vocales en mayúsculas
     * showFrase 
     */
    public void showFrase (String frase){
        fraseCaracteres = frase.toCharArray();
        for (int i = fraseCaracteres.length - 1; i >= 0; i--) {
            if (fraseCaracteres[i] == 'a' || fraseCaracteres[i] == 'e' || fraseCaracteres[i] == 'i' || fraseCaracteres[i] == 'o' || fraseCaracteres[i] == 'u'){
                fraseCaracteres[i] = Character.toUpperCase(fraseCaracteres[i]);
                System.out.print(fraseCaracteres[i]);
            }
            else
                System.out.print(fraseCaracteres[i]);
        }
    }
}
