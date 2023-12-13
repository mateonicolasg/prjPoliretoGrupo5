/**
 * Presentar series de números
 * @author: CodeMasters
 * @version: 1.0
 */
public class showSeriesNumeros {
    SeriesNumeros oSeriesNumeros = new SeriesNumeros();
    ControlDatos oControlDatos = new ControlDatos();
    App oApp = new App();
    
    int nroTerminos;
    int opcion;
    /**
     * <b>showMenu1</b> muestra el menú de las series de números
     * showMenu1
     */
    public void showMenu1(){
        do{     
            System.out.println();
            System.out.println(App.GREEN + "MENÚ SERIES NUMÉRICAS" + App.RESET);
            System.out.println(App.GREEN + "1.  " + App.RESET + "Serie de números " + App.GREEN + "[1]" + App.RESET);
            System.out.println(App.GREEN + "2.  " + App.RESET + "Serie de números " + App.GREEN + "[2]" + App.RESET);
            System.out.println(App.GREEN + "3.  " + App.RESET + "Serie de números " + App.GREEN + "[3]" + App.RESET);
            System.out.println(App.GREEN + "4.  " + App.RESET + "Serie de números " + App.GREEN + "[4]" + App.RESET);
            System.out.println(App.GREEN + "9.  " + App.RESET + "Serie de números " + App.GREEN + "[9]" + App.RESET);
            System.out.println(App.GREEN + "10. " + App.RESET + "Serie de números " + App.GREEN + "[10]" + App.RESET);
            System.out.println(App.GREEN + "12. " + App.RESET + "Serie de números " + App.GREEN + "[12]" + App.RESET);
            System.out.println(App.RED + "0. Salir" + App.RESET);
            opcion = oControlDatos.getPositiveOp();
            switch(opcion){
                case 1:  
                    nroTerminos = oControlDatos.getPositiveNum();  
                    oSeriesNumeros.showSerie1For(nroTerminos);
                    break;
                case 2:
                    nroTerminos = oControlDatos.getPositiveNum();    
                    oSeriesNumeros.showSerie2For(nroTerminos);
                    break;
                case 3:
                    nroTerminos = oControlDatos.getPositiveNum(); 
                    oSeriesNumeros.showSerie3For(nroTerminos);
                    break;
                case 4:
                    nroTerminos = oControlDatos.getPositiveNum(); 
                    oSeriesNumeros.showSerie4For(nroTerminos);
                    break;
                case 9:
                    nroTerminos = oControlDatos.getPositiveNum(); 
                    oSeriesNumeros.showSerie9For(nroTerminos);
                    break;
                case 10:
                    nroTerminos = oControlDatos.getPositiveNum(); 
                    oSeriesNumeros.showSerie10For(nroTerminos);
                    break;
                case 12:
                    nroTerminos = oControlDatos.getPositiveNum(); 
                    oSeriesNumeros.showSerie12For(nroTerminos);
                    break;
                case 0:
                    System.out.println();
                    System.out.println(App.GREEN + "Saliendo al Menú principal..." + App.RESET);
                    System.out.println();
                    oApp.MenuPrincipal();
                    break;
                default: 
                    System.out.println();
                    System.out.println(App.RED +"Opción inválida" + App.RESET);
                    opcion = 1;
            }
            System.out.println();
        } while (opcion > 0 && opcion <= 12);
    }
}
