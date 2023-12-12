public class Figuras {

    public void showFigura3For(int nroNiveles){
        for (int filas = 1; filas <= nroNiveles; filas++) {
            for (int nroCaracteres = 0; nroCaracteres < filas; nroCaracteres++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void showFigura4For(int nroNiveles){
        for (int filas = 1; filas <= nroNiveles; filas++) {
            for (int nroEspacios = nroNiveles; nroEspacios > filas; nroEspacios--) 
                System.out.print("  ");
            for (int nroCaracteres = 0; nroCaracteres < filas; nroCaracteres++) 
                System.out.print("* ");
            System.out.println();
        }
    }

    public void showFigura5For(int nroNiveles){
        for (int filas = nroNiveles; filas > 0; filas--) {
            for (int espacio = nroNiveles; espacio > filas; espacio--) {
                System.out.print(" ");
            }
            for (int nroCaracteres = 0; nroCaracteres < filas; nroCaracteres++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void showFigura6For(int nroNiveles){
        for (int filas = nroNiveles; filas > 0; filas--) {
            for (int espacio = 0; espacio < filas; espacio++) {
                System.out.print(" ");
            }
            for (int nroCaracteres = nroNiveles; nroCaracteres >= filas; nroCaracteres--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void figura18for(int nroNiveles){
        int[][] arr = new int[nroNiveles][nroNiveles + 1];
        for (int i = 0; i < nroNiveles; i++) {
            arr[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
            arr[i][i + 1] = 2;

            for (int j = 0; j <= i + 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

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
}
