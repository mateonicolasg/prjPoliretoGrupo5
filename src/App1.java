import java.util.Scanner;

public class App1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        App1 oApp1 = new App1();
        oApp1.MenuPrincipal();
    }
    public void MenuPrincipal() {
        showFiguras oShowFiguras = new showFiguras();
        int opcion;
        do{
            System.out.println("***BIENVENIDO A LOS POLIRETOS***");
            System.out.println("GRUPO 5");        
            System.out.println("INTEGRANTES: Simbaña.Mateo, Vera.Edison, Negrete.Francisco, Unaucho.David, Velasco.Matheus, Santacruz.Estefano");        
            System.out.println("1. Series numéricas");
            System.out.println("2. Series de caracteres");
            System.out.println("3. Figuras");
            System.out.println("4. Cadena de caracteres");
            System.out.println("5. Arrays");
            System.out.println("6. Loading");
            System.out.println("7. Recursión");
            System.out.println("0.Salir");
            System.out.print("Ingresa una opción: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    oShowFiguras.showMenu1();
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;  
            }          
        }while (opcion < 0 && opcion > 2);
    }
}
