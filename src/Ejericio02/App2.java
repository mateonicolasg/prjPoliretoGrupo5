package Ejericio02;

import java.util.Scanner;

public class App2 {

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Serie Nro.02=[ 1 0 3 0 5 0 7 0 9 ...]");
        System.out.println("Cantidad de N de la serie o nivel ingresado: ");
        int NroIntervalo2 = sc.nextInt();
        System.out.println("N =" + NroIntervalo2);

        SerieNumerosAlternosNro2 serie = new SerieNumerosAlternosNro2(NroIntervalo2);
        serie.generarSerie2();
    }
}
