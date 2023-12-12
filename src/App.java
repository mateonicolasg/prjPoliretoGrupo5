/**
 * Presentar Poliretos
 * @author: CodeMasters
 * @version: 1.0
 */
import java.util.Scanner;
public class App {
    public static Scanner sc = new Scanner(System.in);

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String YELLOW2 = "\u001B[93m";
    public static void main(String[] args) {
        App oApp = new App();
        oApp.MenuPrincipal();
    }
    public void MenuPrincipal() {
        showSeriesNumeros oShowSeriesNumeros = new showSeriesNumeros();
        showSeriesCaracteres oShowSeriesCaracteres = new showSeriesCaracteres();
        showFiguras oShowFiguras = new showFiguras();
        showCadenasCaracteres oCadenasCaracteres = new showCadenasCaracteres();
        showArrays oArrays = new showArrays();
        showLoadings oLoadings = new showLoadings();
        showEjerciciosRecursion oEjerciciosRecursion = new showEjerciciosRecursion();
        int opcion;
        System.out.println(RED + "***BIENVENIDO A LOS POLIRETOS***" + RESET);

        System.out.println("GRUPO 5 - CodeMasters");        
        System.out.println("INTEGRANTES: Simbaña.Mateo, Vera.Edison, Negrete.Francisco, Unaucho.David, Velasco.Matheus, Santacruz.Estefano");
        do{        
            System.out.println(GREEN + "1. Series numéricas" + RESET);
            System.out.println(YELLOW + "2. Series de caracteres" + RESET);
            System.out.println(BLUE + "3. Figuras" + RESET);
            System.out.println(PURPLE + "4. Cadena de caracteres" + RESET);
            System.out.println(CYAN + "5. Arrays" + RESET);
            System.out.println(WHITE + "6. Loading" + RESET);
            System.out.println(YELLOW2 + "7. Recursión" + RESET);
            System.out.println(RED + "0. Salir" + RESET);
            System.out.print("Ingresa una opción: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    oShowSeriesNumeros.showMenu1();
                    break;
                case 2:
                    oShowSeriesCaracteres.showMenu2();
                    break;
                case 3:
                    oShowFiguras.showMenu3();
                    break;
                case 4:
                    oCadenasCaracteres.showMenu4();
                    break;
                case 5:
                    oArrays.showMenu5();
                    break;
                case 6:
                    oLoadings.showMenu6();
                    break;
                case 7:
                    oEjerciciosRecursion.showMenu7();
                    break;  
                case 0: 
                    System.out.println();
                    System.out.println(App.YELLOW + "Saliendo del programa..." + App.RESET); 
                    break;
                default:
                    System.out.println();
                    System.out.println(RED + "Opción inválida" + RESET);
                    System.out.println();
            }     
        }while (opcion < 0 || opcion > 7);

    }
}