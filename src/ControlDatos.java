import java.util.InputMismatchException;

public class ControlDatos {
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
