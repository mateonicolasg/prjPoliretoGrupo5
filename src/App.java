import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        App oApp = new App();
        oApp.MenuPrincipal();
    }
    public void MenuPrincipal() {
        showSeriesNumeros oShowSeriesNumeros = new showSeriesNumeros();
        showSeriesCaracteres oShowSeriesCaracteres = new showSeriesCaracteres();
        showFiguras oShowFiguras = new showFiguras();
        showCadenasCaracteres oCadenasCaracteres = new showCadenasCaracteres();
        showLoadings oLoadings = new showLoadings();
        showEjerciciosRecursion oEjerciciosRecursion = new showEjerciciosRecursion();
        int opcion;
        System.out.println("***BIENVENIDO A LOS POLIRETOS***");
        System.out.println("GRUPO 5 - CodeMasters");        
        System.out.println("INTEGRANTES: Simbaña.Mateo, Vera.Edison, Negrete.Francisco, Unaucho.David, Velasco.Matheus, Santacruz.Estefano");
        do{        
            System.out.println("1. Series numéricas");
            System.out.println("2. Series de caracteres");
            System.out.println("3. Figuras");
            System.out.println("4. Cadena de caracteres");
            System.out.println("5. Arrays");
            System.out.println("6. Loading");
            System.out.println("7. Recursión");
            System.out.println("0. Salir");
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

                    break;
                case 6:
                    oLoadings.showMenu6();
                    break;
                case 7:
                    oEjerciciosRecursion.showMenu7();
                    break;  
            }     
        }while (opcion < 0 || opcion > 7);
    }
}
