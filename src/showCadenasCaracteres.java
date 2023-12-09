public class showCadenasCaracteres {
    CadenasCaracteres oCadenasCaracteres = new CadenasCaracteres();
    App oApp = new App();
    
    String frase;
    int opcion;

    public void showMenu4(){
        do{     
            System.out.println();
            System.out.println("MENÚ CADENAS CARACTERES");
            System.out.println("5. Cadena de caracteres 5");
            System.out.println("6. Cadena de caracteres 6");
            System.out.println("7. Cadena de caracteres 7");
            System.out.println("9. Cadena de caracteres 9");
            System.out.println("0. Salir");
            System.out.print("Ingresa una opción: ");

            
            opcion = App.sc.nextInt();

            switch(opcion){
                case 5:
                    System.out.print("Ingrese una frase: ");
                    frase = App.sc.nextLine();
                    oCadenasCaracteres.showFrase5For(frase);
                    
                    break;
                case 6:
                    System.out.print("Ingrese una frase: ");    
                    frase = App.sc.nextLine();   
                    oCadenasCaracteres.showFrase6For(frase);
                    break;
                case 7:
                    System.out.print("Ingrese una frase: ");
                    frase = App.sc.nextLine();
                    oCadenasCaracteres.showFrase7For(frase);
                    break;
                case 9:
                    System.out.print("Ingrese una frase: ");
                    frase = App.sc.nextLine();
                    oCadenasCaracteres.showFrase9For(frase);
                    break;
                case 0:
                    oApp.MenuPrincipal();
            }
        } while (opcion >= 0 && opcion <= 9);
    }
}
