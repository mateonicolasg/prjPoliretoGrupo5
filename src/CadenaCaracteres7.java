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
public class CadenaCaracteres7 {
	// C07)    Pedir una frase y presentarla en mayusculas y sin la J
    //         Ejemplo, frase: mujeres
    //                 salida: MUERES
    private char [] fraseCaracteres;
    public CadenaCaracteres7(){
        
    }
    /**
     * <b>showFrase</b> muestra la cadena usando el ciclo foreach C07: Pedir una frase y presentarla en mayusculas y sin la J.
     * @param frase: frase en mayúsculas y sin la J.
     * showFrase 
     */
    public void showFrase (String frase){
        fraseCaracteres = frase.toCharArray();
        for (char fraseInvertida : fraseCaracteres) {
            if (fraseInvertida != 'j')
                System.out.print(Character.toUpperCase(fraseInvertida));
            }
    } 
}
