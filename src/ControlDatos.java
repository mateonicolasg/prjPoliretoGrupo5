import java.util.InputMismatchException;

public class ControlDatos {
    /**
     * Verificar si es que el caracter ingresado es un símbolo
     * @return Character
     */
    public char getCaracter(){
        char caracter = ' ';
        boolean charValido = false;
        String comprobarCaracter;
        System.out.print("Ingrese un caracter: ");
        comprobarCaracter = App.sc.nextLine();
        caracter = comprobarCaracter.charAt(0);
        while (!charValido){
            if (comprobarCaracter.length() == 1 && !Character.isDigit(caracter) && !Character.isLetter(caracter)) {
                charValido = true;
                caracter = comprobarCaracter.charAt(0);
            } 
            else{
                System.out.println(App.RED + "Caracter inválido, ingrese un símbolo..." + App.RESET);
                System.out.print("Ingrese un caracter: ");
                comprobarCaracter = App.sc.nextLine();
                caracter = comprobarCaracter.charAt(0);
            }
        }

        // char caracter;
        // boolean encontrado = false;
        // System.out.print("Letra a eliminar de la frase: ");
        // caracter = App.sc.next().charAt(0);
        // while (!(Character.isLetter(caracter))){
        //     System.out.println(App.RED + "Ingrese una letra valida!" + App.RESET);
        //     System.out.print("Letra a eliminar de esa frase: ");
        //     caracter = App.sc.next().charAt(0);
        // }

        // for (char c1 : frase.toCharArray()){       
        //     if (caracter == c1)
        //         encontrado = true;
        // }
        // while (!encontrado){
        //     System.out.println(App.RED + "Letra no encontrada!" + App.RESET);
        //     System.out.println(App.CYAN + "Ingrese una letra que se encuentre en la frase..." + App.RESET);
        //     System.out.print("Letra a eliminar de la frase: ");
        //     caracter = App.sc.next().charAt(0);
        //     while (!(Character.isLetter(caracter)) && caracter == 'a' && caracter == 'e' && caracter == 'i' && caracter == 'o' && caracter == 'u'){
        //         System.out.println(App.RED + "Ingrese una letra valida!" + App.RESET);
        //         System.out.print("Letra a eliminar de esa frase: ");
        //         caracter = App.sc.next().charAt(0);
        //     }
        //     for (char c1 : frase.toCharArray()){       
        //         if (caracter == c1)
        //             encontrado = true;
        //     }
        // }
        return caracter;
    }
    /**
     * Verificar si es que el caracter ingresado es una vocal y si esa vocal existe en la frase
     * @return Character
     */
    public char getvocalValida(String frase){
        char caracter = ' ';
        boolean vocalEncontrada = false;
        while (!vocalEncontrada) {
            System.out.print("Ingrese una vocal: ");
            String comprobarLetra = App.sc.nextLine();
            if (comprobarLetra.length() == 1 && Character.isAlphabetic(comprobarLetra.charAt(0))) {
                caracter = Character.toLowerCase(comprobarLetra.charAt(0));
                    for (char c : frase.toCharArray()){       
                        if (caracter == c) {
                            vocalEncontrada = true;
                        }
                    }
                    if (vocalEncontrada == false){
                        System.out.println(App.RED + "No se encontró la vocal en la frase" + App.RESET);
                    }
            }
            else {
                System.out.println(App.RED + "Ingrese una vocal válida." + App.RESET);
            }
        }
        return caracter;
    }
    /**
     * Verificar si es que el caracter ingresado es una letra y si esa letra existe en la frase
     * @return Character
     */
    public char getLetraValida(String frase){
        char caracter = ' ';
        boolean letraEncontrada = false;
        while (!letraEncontrada) {
            System.out.print("Ingrese una letra: ");
            String comprobarLetra = App.sc.nextLine();
            if (comprobarLetra.length() == 1 && Character.isLetter(comprobarLetra.charAt(0))) {
                caracter = Character.toLowerCase(comprobarLetra.charAt(0));
                if (caracter != 'a' && caracter != 'e' && caracter != 'i' &&
                caracter != 'o' && caracter != 'u') {
                    for (char c : frase.toCharArray()){       
                        if (caracter == c) {
                            letraEncontrada = true;
                        }
                    }
                    if (letraEncontrada == false){
                        System.out.println(App.RED + "No se encontró la letra en la frase" + App.RESET);
                    }
                } else {
                    System.out.println(App.RED + "Ingrese una consonante válida." + App.RESET);
                }
            } else {
                System.out.println(App.RED + "Ingrese una letra válida." + App.RESET);
            }
        }
        return caracter;
    }
    /**
     * Verificar si es que la opcion ingresada es un entero positivo.
     * @return Integer
     */
    public int getPositiveValor(){
        boolean numValido = false;
        int valor = 0; 
        while (!numValido){ 
            try {
                System.out.print("Ingresa un valor: ");
                valor = App.sc.nextInt(); 
                if (valor < 0)
                    System.out.println(App.RED + "Solo ingresar números positivos!" + App.RESET);
                else 
                    numValido = true;
            } catch (InputMismatchException e) {
                System.out.println(App.RED + "Ingresar un número válido!" + App.RESET);
                App.sc.next();
            }
        }
        return valor;
    }
    /**
     * Verificar si es que la opcion ingresada es un entero positivo.
     * @return Integer
     */
    public int getPositiveOp(){
        boolean numValido = false;
        int opcion = 0; 
        while (!numValido){ 
            try {
                System.out.print("Ingresa una opción: ");
                opcion = App.sc.nextInt(); 
                if (opcion < 0)
                    System.out.println(App.RED + "Solo ingresar números positivos!" + App.RESET);
                else 
                    numValido = true;
            } catch (InputMismatchException e) {
                System.out.println(App.RED + "Ingresar un número válido!" + App.RESET);
                App.sc.next();
            }
        }
        return opcion;
    }
    /**
     * Verificar si es que el numero de términos ingresado es un entero positivo.
     * @return Integer
     */
    public int getPositiveNum(){
        boolean numValido = false;
        int nroTerminos = 0; 
        while (!numValido){ 
            try {
                System.out.print("Ingrese el número de términos: "); 
                nroTerminos = App.sc.nextInt(); 
                if (nroTerminos < 0)
                    System.out.println(App.RED + "Solo ingresar números positivos!" + App.RESET);
                else 
                    numValido = true;
            } catch (InputMismatchException e) {
                System.out.println(App.RED + "Ingresar un número válido!" + App.RESET);
                App.sc.next();
            }
        }
        return nroTerminos;
    }
    /**
     * Verificar si es que el número de niveles ingresado es un entero positivo.
     * @return Integer
     */
    public int getPositiveLevel(){
        boolean numValido = false;
        int nroNiveles = 0; 
        while (!numValido){ 
            try {
                System.out.print("Ingrese el tamaño: "); 
                nroNiveles = App.sc.nextInt(); 
                if (nroNiveles < 0)
                    System.out.println(App.RED + "Solo ingresar números positivos!" + App.RESET);
                else 
                    numValido = true;
            } catch (InputMismatchException e) {
                System.out.println(App.RED + "Ingresar un número válido!" + App.RESET);
                App.sc.next();
            }
        }
        return nroNiveles;
    }
    /**
     * Verificar si la frase que ingresa el usuario es una cadena de letras y espacios, no numeros
     * @return cadena de letras
     */
    public String leerFrase() {
        String frase = "";
        boolean esFraseValida = false;
        while (!esFraseValida) {
            System.out.print("Ingrese una frase: ");
            frase = App.sc.nextLine();
            esFraseValida = !frase.matches("[^a-zA-ZñÑ\\s]+") && !frase.matches(".*\\d+.*");
            if (!esFraseValida) {
                System.out.println(App.RED + "La frase no es válida. Ingrese solo letras y espacios" + App.RESET);
            } 
      }
      return frase; 
    } 
}
