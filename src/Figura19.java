/**
 * Copyright (C) 2K23B, Matheus Velasco
 * () matheus.velasco@epn.edu.ec
 * Version 1.0
 */

/**
 * Crea la siguiente serie de caracteres
 * @author: Matheus Velasco
 * @version: 1.0
 */

public class Figura19 {
    /**
     * <b>showFiguraFor</b> muestra la figura usando el ciclo for F18:
            2
            1   2
            1   3   2
            1   4   5   2
            1   5   9   7  2
            1   6   14  16  9  2
            ....
     * @param nroNiveles: numero de niveles para la figura
     * showFiguraFor 
     */

    public void figura19For(int nroNiveles) {
        int[][] arr = new int[nroNiveles][nroNiveles + 1];
        for (int i = 0; i < nroNiveles; i++) {
            arr[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
            arr[i][i + 1] = 2;

            for (int j = 0; j <= i + 1; j++) {
                if (j == 0 && i != 0) {
                    System.out.print(" +");
                } else if (arr[i][j] == 1) {
                    System.out.print(" +");
                } else if (arr[i][j] == 2) {
                    System.out.print(" *");
                } else {
                    System.out.print(" " + arr[i][j]);
                }
            }
            System.out.println();
        }
    }

    public void figuras19While(int nroNiveles) {
        int[][] arr = new int[nroNiveles][nroNiveles + 1];
        int i = 0;
        while (i < nroNiveles) {
            arr[i][0] = 1;
            int j = 1;
            while (j <= i) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                j++;
            }
            arr[i][i + 1] = 2;

            j = 0;
            while (j <= i + 1) {
                if (j == 0 && i != 0) {
                    System.out.print(" +");
                } else if (arr[i][j] == 1) {
                    System.out.print(" +");
                } else if (arr[i][j] == 2) {
                    System.out.print(" *");
                } else {
                    System.out.print(" " + arr[i][j]);
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }

public void figuras19DoWhile(int nroNiveles) {

        int[][] arr = new int[nroNiveles][nroNiveles + 1];
        int i = 0;
        do {
            arr[i][0] = 1;
            int j = 1;
            do {
                if (j <= i) {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                j++;
            } while (j <= i + 1);
            arr[i][i + 1] = 2;

            j = 0;
            do {
                if (j == 0 && i != 0) {
                    System.out.print(" +");
                } else if (arr[i][j] == 1) {
                    System.out.print(" +");
                } else if (arr[i][j] == 2) {
                    System.out.print(" *");
                } else {
                    System.out.print(" " + arr[i][j]);
                }
                j++;
            } while (j <= i + 1);
            System.out.println();
            i++;
        } while (i<nroNiveles);
    }
}

