public class Array {
    public void Array1() {
        String[] palabras = {"David Nicolas Unaucho Guarnizo"};
        // int cantidadPalabras = palabras.length;

        // int porcentajeBase = 100 / cantidadPalabras;
        int porcentaje = 25; // Empezamos con 25%

        System.out.println("\n");
        for (int i = 0; i < palabras.length; i++) {
            int longitud = palabras[i].length();
            int cargaReal = (porcentaje * longitud) / 100;

            String cargaVisual = "[" + "=".repeat(cargaReal) + ">".repeat(longitud - cargaReal) + "]";
            
            System.out.printf("%s %3d%% %s%n", cargaVisual, porcentaje, palabras[i].substring(0, cargaReal));
            porcentaje += 25; // Incrementamos el porcentaje en 25 para la siguiente palabra
        }
    }
    /**
     * <b>Array2</b> muestra la serie usando el ciclo for A02) Crear una matriz solicitando el tamaño y caracter para almacenar la iniciales de su nombre y apellido y presentar la matriz
     * @author: Mateo Simbaña
     * @param tamaño: tamaño de las iniciales del nombre y apellido del autor
     * @param caracter: caracter con el que se imprimirán las iniciales 
     * Array2
     */
    public void Array2 (int tamaño, char caracter){
        System.out.println("Mi nombre es: " + App.YELLOW + "Mateo Simbaña" + App.RESET);
        System.out.println("Iniciales de mi nombre y apellido con " + caracter + ": ");
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
    /**
     * <b>Array3</b> muestra la serie A03) Dibujar un plano de coordenadas positivo y graficar f(x) = 2x usando como caracteres las letras de su nombre
     * @author: Edison Vera
     * Array3
     */
    public void Array3(){
        int guion = 45; // Guion
        for (int i=12; i>0; i--){
            if(i==12){
                System.out.println(i + " |               n");
            }
            if(i==10){
                System.out.println(i+ " |            o");
            }
            if(i==8){
                System.out.println(i+ "  |         s");
            }
            if(i==6){
                System.out.println(i+ "  |      i");
            }
            if(i==4){
                System.out.println(i+ "  |   d");
            }
            if(i==2){
                System.out.println(i+ "  |e");
            }
            if(i % 2 !=0){
                if(i>9){
                    System.out.println(i + " |");
                }
                else{
                    System.out.println(i + "  |");
                }
            }
            
        }
        System.out.print("   ");
        for(int j=0; j<18; j++){
            System.out.print((char)guion);
        }
        System.out.println();
    }
    /**
     * <b>Array4</b> muestra la serie A04) Crear un matriz donde forme una X con su nombre y apellido
     * @author: Estefano Santacruz
     * Array4
     */
    public void Array4() {
        String nombre = "Estefano";
        String apellido = "Santacruz";
        int tamañoMatriz = Math.max(nombre.length(), apellido.length()) * 1 + 1;

        char[][] matriz = new char[tamañoMatriz][tamañoMatriz];
        for (int i = 0; i < tamañoMatriz; i++) {
            for (int j = 0; j < tamañoMatriz; j++) {
                matriz[i][j] = ' ';
            }
        }
        for (int i = 0; i < nombre.length(); i++) {
            matriz[i][i] = nombre.charAt(i);
        }

        for (int i = 0; i < apellido.length(); i++) {
            matriz[i][tamañoMatriz - i - 1] = apellido.charAt(i);
        }

        for (int i = 0; i < tamañoMatriz; i++) {
            for (int j = 0; j < tamañoMatriz; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    /**
     * <b>Array5</b> muestra la serie usando el ciclo foreach A05) Crear un matriz cuadrada del tamaño de su nombre, colocar cada letra de sus nombres completos de forma randomica/aleatorio.
     * @author: Mateo Simbaña
     * Array5
     */
    public void Array5(){
        System.out.println("Mis nombres completos son: " + App.GREEN + "Mateo Nicolas Simbaña Guarnizo" + App.RESET);
        System.out.println("A continuación se muestra una matriz cuadrada del tamaño de mi nombre: ");
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
