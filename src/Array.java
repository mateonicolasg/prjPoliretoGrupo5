public class Array {
    public void Array2 (int tamaño, char caracter){
        char matrizM [][] = new char [tamaño][tamaño];
        char matrizS [][] = new char[tamaño][tamaño];
        for (int fila = 0; fila < tamaño; fila++) {
            for (int columna = 0; columna < tamaño; columna++) {
                if (columna == 0 || columna == tamaño - 1 || (columna == fila) && (fila < tamaño / 2) || fila + columna == tamaño - 1 && (fila < tamaño / 2) ||(fila == tamaño /2) && (columna == tamaño/2)) {
                    matrizM[fila][columna] = caracter;
                } else {
                    matrizM[fila][columna] = ' ';
                }
            }
        }    
        for (int fila = 0; fila < tamaño; fila++) {
            for (int columna = 0; columna < tamaño; columna++) {
                if (fila == 0 || fila == tamaño - 1 || fila == tamaño / 2 || (fila < tamaño / 2 && columna == 0) || (fila > tamaño / 2 && columna == tamaño - 1)) {
                    matrizS[fila][columna] = caracter;
                } else {
                    matrizS[fila][columna] = ' ';
                }
            }
        }    
        for (int fila = 0; fila < tamaño; fila++) {
            for (int columna = 0; columna < tamaño; columna++) {
                System.out.print(matrizM[fila][columna]);
            }
            System.out.print("   ");
            for (int columna = 0; columna < tamaño; columna++) {
                System.out.print(matrizS[fila][columna]);
            }
            System.out.println();
        }  
    }

    public void Array5(){
        char [] nombresCompletos = {'M','a','t','e','o','N','i','c','o','l','a','s','S','i','m','b','a','n','a','G','u','a','r','n','i','z','o'};
        int tamaño = 5;
        
        Character [][] matriz = new Character[tamaño][tamaño];
        for(int caracter = 0; caracter < nombresCompletos.length; caracter++){
            int fila, columna;
            fila = (int)(Math.random()*5);
            columna = (int)(Math.random()*5);
            matriz[fila][columna] = (matriz[fila][columna] !=null) ? '*' : nombresCompletos[caracter];
            // if (matriz[fila][columna] !=null)
            //     matriz[fila][columna] = '*';
            // else
            //     matriz[fila][columna] = nombresCompletos[caracter];
        }

        for (Character[] fila : matriz) {
            for (Character columna : fila) {
                System.out.print((columna == null) ? "    " : columna + "   ");
                // if (columna == null)
                //     System.out.print("  ");
                // else
                //     System.out.print(columna + " ");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
            System.out.println();
        }
    }
}
