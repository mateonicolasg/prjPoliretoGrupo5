public class showSeriesCaracteres {
    SeriesCaracteres oSeriesCaracteres = new SeriesCaracteres();
    ControlDatos oControlDatos = new ControlDatos();
    App oApp = new App();

    int nroTerminos;
    int opcion;

    public void showMenu2(){
        do{     
            System.out.println();
            System.out.println(App.YELLOW + "MENÚ SERIES CARACTERES" + App.RESET);
            System.out.println(App.YELLOW +"1. " + App.RESET + "Serie de caracteres " + App.YELLOW + "[1]"+ App.RESET);
            System.out.println(App.YELLOW +"2. " + App.RESET+ "Serie de caracteres " + App.YELLOW + "[2]"+ App.RESET);
            System.out.println(App.YELLOW +"4. " + App.RESET+ "Serie de caracteres " + App.YELLOW + "[4]"+ App.RESET);
            System.out.println(App.YELLOW +"5. " + App.RESET+ "Serie de caracteres " +App.YELLOW + "[5]"+ App.RESET);
            System.out.println(App.YELLOW +"6. " + App.RESET+ "Serie de caracteres " + App.YELLOW + "[6]"+ App.RESET);
            System.out.println(App.YELLOW +"7. " + App.RESET+ "Serie de caracteres " + App.YELLOW + "[7]"+ App.RESET);
            System.out.println(App.YELLOW +"8. " + App.RESET+ "Serie de caracteres " + App.YELLOW + "[8]"+ App.RESET);
            System.out.println(App.YELLOW +"9. " + App.RESET+ "Serie de caracteres " + App.YELLOW + "[9]"+ App.RESET);
            System.out.println(App.RED +"0. Salir" + App.RESET);
            System.out.print(App.WHITE + "Ingresa una opción: " + App.RESET);

            
            opcion = App.sc.nextInt();

            switch(opcion){
                case 1:
                    nroTerminos = oControlDatos.getPositiveNum(); 
                    oSeriesCaracteres.showSerie1For(nroTerminos);
                    
                    break;
                case 2:
                    nroTerminos = oControlDatos.getPositiveNum();        
                    oSeriesCaracteres.showSerie2For(nroTerminos);
                    break;
                case 4:
                    nroTerminos = oControlDatos.getPositiveNum(); 
                    oSeriesCaracteres.showSerie4For(nroTerminos);
                    break;
                case 5:
                    nroTerminos = oControlDatos.getPositiveNum(); 
                    oSeriesCaracteres.showSerie5For(nroTerminos);
                    break;
                case 6:
                    nroTerminos = oControlDatos.getPositiveNum(); 
                    oSeriesCaracteres.showSerie6For(nroTerminos);
                    break;
                case 7:
                    nroTerminos = oControlDatos.getPositiveNum(); 
                    oSeriesCaracteres.showSerie7For(nroTerminos);
                    break;
                case 8:
                    nroTerminos = oControlDatos.getPositiveNum(); 
                    oSeriesCaracteres.showSerie8For(nroTerminos);
                    break;
                case 9:
                    nroTerminos = oControlDatos.getPositiveNum(); 
                    oSeriesCaracteres.showSerie9For(nroTerminos);
                    break;
                case 0:
                    System.out.println();
                    System.out.println(App.YELLOW + "Saliendo al Menú principal..."+ App.RESET);
                    System.out.println();
                    oApp.MenuPrincipal();
                    break;
                default: 
                    System.out.println();
                    System.out.println(App.RED + "Opción inválida"+ App.RESET);
                    opcion = 1;
            }
            System.out.println();
        } while (opcion > 0 && opcion <= 9);
    }
}
