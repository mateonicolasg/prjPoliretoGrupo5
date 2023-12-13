/**
 * Presentar series de caracteres
 * @author: CodeMasters
 * @version: 1.0
 */
public class showSeriesCaracteres {
    SeriesCaracteres oSeriesCaracteres = new SeriesCaracteres();
    ControlDatos oControlDatos = new ControlDatos();
    App oApp = new App();

    int nroTerminos;
    int opcion;
    /**
     * <b>showMenu2</b> muestra el menú de las series de caracteres
     * showMenu2 
     */
    public void showMenu2(){
        do{     
            System.out.println();
            System.out.println(App.YELLOW + "MENÚ SERIES CARACTERES" + App.RESET);
            System.out.println(App.YELLOW +"1.  " + App.RESET + "Serie de caracteres " + App.YELLOW + "[1]"+ App.RESET);
            System.out.println(App.YELLOW +"2.  " + App.RESET+ "Serie de caracteres " + App.YELLOW + "[2]"+ App.RESET);
            System.out.println(App.YELLOW +"3.  " + App.RESET+ "Serie de caracteres " + App.YELLOW + "[3]"+ App.RESET);
            System.out.println(App.YELLOW +"4.  " + App.RESET+ "Serie de caracteres " + App.YELLOW + "[4]"+ App.RESET);
            System.out.println(App.YELLOW +"5.  " + App.RESET+ "Serie de caracteres " +App.YELLOW + "[5]"+ App.RESET);
            System.out.println(App.YELLOW +"6.  " + App.RESET+ "Serie de caracteres " + App.YELLOW + "[6]"+ App.RESET);
            System.out.println(App.YELLOW +"7.  " + App.RESET+ "Serie de caracteres " + App.YELLOW + "[7]"+ App.RESET);
            System.out.println(App.YELLOW +"8.  " + App.RESET+ "Serie de caracteres " + App.YELLOW + "[8]"+ App.RESET);
            System.out.println(App.YELLOW +"9.  " + App.RESET+ "Serie de caracteres " + App.YELLOW + "[9]"+ App.RESET);
            System.out.println(App.YELLOW +"10. " + App.RESET+ "Serie de caracteres " + App.YELLOW + "[10]"+ App.RESET);
            System.out.println(App.RED +"0. Salir" + App.RESET);
            opcion = oControlDatos.getPositiveOp();
            switch(opcion){
                case 1:
                    nroTerminos = oControlDatos.getPositiveNum(); 
                    oSeriesCaracteres.showSerie1For(nroTerminos);
                    
                    break;
                case 2:
                    nroTerminos = oControlDatos.getPositiveNum();        
                    oSeriesCaracteres.showSerie2For(nroTerminos);
                    break;
                case 3:
                    nroTerminos = oControlDatos.getPositiveNum();        
                    oSeriesCaracteres.showSerie3For(nroTerminos);
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
                case 10:
                    nroTerminos = oControlDatos.getPositiveNum(); 
                    oSeriesCaracteres.showSerie10For(nroTerminos);
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
