/**
 * Copyright (C) 2K23B, Mateo Simbaña
 * () mateo.simbana@epn.edu.ec
 * Version 1.0
 */

/**
 * Crea la siguiente recursividad
 * @author: Mateo Simbaña
 * @version: 1.0
 */  
public class Recursion02 {
    /**
     * <b>sumaRecursiva</b> muestra una recursividad para R02: Crear un metodo recursivo para obtener la suma(a,b).
     * @param num1: Primer sumando
     * @param num1: Segundo sumando
     * sumaRecursiva 
     */
    public int sumaRecursiva(int num1, int num2){
        if (num1 == 0)
            return num2;
        else if (num2 == 0)
            return num1;
        else
            return 1 + sumaRecursiva(num1, num2 - 1);                                                                              
    }
}
