public class showCadenasCaracteres {
    CadenasCaracteres oCadenasCaracteres = new CadenasCaracteres();
    ControlDatos oControlDatos = new ControlDatos();
    App oApp = new App();
    
    String frase;
    int opcion;

    public void showMenu4(){
        do{     
            System.out.println();
            System.out.println(App.PURPLE + "MENÚ CADENAS CARACTERES" + App.RESET);
            System.out.println(App.PURPLE + "5." + App.RESET + " Cadena de caracteres" + App.PURPLE + " [5]"+ App.RESET);
            System.out.println(App.PURPLE + "6." + App.RESET + " Cadena de caracteres" + App.PURPLE + " [6]"+ App.RESET);
            System.out.println(App.PURPLE + "7." + App.RESET  + " Cadena de caracteres" + App.PURPLE + " [7]"+ App.RESET);
            System.out.println(App.PURPLE + "9." + App.RESET + " Cadena de caracteres" + App.PURPLE + " [9]"+ App.RESET);
            System.out.println(App.RED + "0. Salir" + App.RESET);
            System.out.print(App.WHITE + "Ingresa una opción: " + App.RESET);

            
            opcion = App.sc.nextInt();

            switch(opcion){
                case 5:
                    App.sc.nextLine();
                    frase = oControlDatos.leerFrase(); 
                    oCadenasCaracteres.showFrase5For(frase);
                    break;
                case 6:
                    App.sc.nextLine();
                    frase = oControlDatos.leerFrase(); 
                    oCadenasCaracteres.showFrase6For(frase);
                    break;
                case 7:
                    App.sc.nextLine();
                    frase = oControlDatos.leerFrase(); 
                    oCadenasCaracteres.showFrase7For(frase);
                    break;
                case 9:
                    App.sc.nextLine();
                    frase = oControlDatos.leerFrase(); 
                    oCadenasCaracteres.showFrase9For(frase);
                    break;
                case 0:
                    System.out.println();
                    System.out.println(App.PURPLE + "Saliendo al Menú principal..."+ App.RESET);
                    System.out.println();
                    oApp.MenuPrincipal();
                    break;
                default: 
                    System.out.println();
                    System.out.println(App.RED + "Opción inválida" + App.RESET);
                    opcion = 1;
            }
            System.out.println();
        } while (opcion > 0 && opcion <= 9);
    }
}
