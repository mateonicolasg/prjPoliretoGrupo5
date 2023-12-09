public class EjerciciosRecursion {
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
    /**
     * <b>multiplicacionRecursiva</b> muestra una recursividad para R03) crear un metodo recursivo para obtener la multiplicacion(a,b)
     * @param a: Primer factor
     * @param b: Segundo factor
     * multiplicacionRecursiva 
     */
    public int multiplicacionRecursiva(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + multiplicacionRecursiva(a, b - 1);
        }
    }
    /**
     * <b>potenciaRecursiva</b> muestra una recursividad para R04) crear un metodo recursivo para obtener la potencia(a,b)
     * @param base: Número inicial
     * @param exponente: Potencia a la cual se eleva el número inicial
     * potenciaRecursiva 
     */
    public int potenciaRecursiva(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        else {
            return base * potenciaRecursiva(base, exponente - 1);
        }
    }

}
