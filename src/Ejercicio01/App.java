package Ejercicio01;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Serie Nro.01=[ 0 1 1 2 3 5 8 13 ...]");
        System.out.println("Cantidad de N de la serie o nivel ingresado: ");
        int NroIntervalo = sc.nextInt();
        System.out.print("N =" + NroIntervalo);
        // Imprimir sin salto de línea
        System.out.println(); 

        SerieNumerosAlternosNro1 oSerieNumerosAlternosNro1 = new SerieNumerosAlternosNro1(NroIntervalo);
        oSerieNumerosAlternosNro1.UnauchogenerarSerie();
    }
}