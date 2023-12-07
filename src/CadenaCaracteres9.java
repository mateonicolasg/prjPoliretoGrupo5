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
public class CadenaCaracteres9 {
    private char [] fraseCaracteres;
    public CadenaCaracteres9(){
        
    }
    /**
     * <b>showFrase</b> muestra la cadena usando el ciclo for C09: Ingresa una frase y convertir una letra a mayusculas y otra a minisculas 
     * @param frase: frase para convertir una letra en mayúscula y otra en minúscula
     * showFrase 
     */
    public void showFrase (String frase){
        fraseCaracteres = frase.toCharArray();
        for (int i = 0; i < fraseCaracteres.length; i++) {
            if (i % 2 == 0)
                System.out.print(Character.toUpperCase(fraseCaracteres[i]));
            else 
                System.out.print(fraseCaracteres[i]);
        }
    }
}
