/**
 * Presentar Loadings
 * @author: CodeMasters
 * @version: 1.0
 */
public class showLoadings {
    Loadings oLoadings = new Loadings();
    App oApp = new App();
    
    // String frase;
    int opcion;
    /**
     * <b>showMenu6</b> muestra el menú de los loadings
     * showMenu6 
     */
    public void showMenu6(){
        do{     
            System.out.println();
            System.out.println(App.WHITE + "MENÚ LOADINGS"+ App.RESET);
            System.out.println(App.WHITE + "1." + App.RESET + " Loading" + App.WHITE + " [1]" + App.RESET);
            System.out.println(App.WHITE + "2." + App.RESET + " Loading " + App.WHITE + "[2]" + App.RESET);
            System.out.println(App.WHITE + "3." + App.RESET+ " Loading " + App.WHITE + "[3]" + App.RESET);
            System.out.println(App.WHITE + "4." + App.RESET+ " Loading " + App.WHITE + "[4]" + App.RESET);
            System.out.println(App.WHITE + "5." + App.RESET + " Loading " + App.WHITE + "[5]" + App.RESET);
            System.out.println(App.WHITE + "6." + App.RESET + " Loading " + App.WHITE + "[6]" + App.RESET);
            System.out.println(App.WHITE + "7." + App.RESET + " Loading " + App.WHITE + "[7]" + App.RESET);
            System.out.println(App.RED + "0. Salir" + App.RESET);
            System.out.print(App.CYAN + "Ingresa una opción: " + App.RESET);

            
            opcion = App.sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Loading 1 ");
                    oLoadings.showLoading1();
                    
                    break;
                case 2:
                    System.out.println("Loading 2");       
                    oLoadings.showLoading2();
                    break;
                case 3:
                    System.out.println("Loading 3");
                    oLoadings.showLoading3();
                    break;
                case 4:
                    System.out.println("Loading 4");
                    oLoadings.showLoading4();
                    break;
                case 5:
                    System.out.println("Loading 5");
                    oLoadings.showLoading5();
                    break;
                case 6:
                    System.out.println("Loading 6");
                    oLoadings.showLoading6();
                    break;
                case 7:
                    System.out.println("Loading 7");
                    oLoadings.showLoading7();
                    break;
                case 0:
                    System.out.println();
                    System.out.println(App.WHITE + "Saliendo al Menú principal..." + App.RESET);
                    System.out.println();
                    oApp.MenuPrincipal();
                    break;
                default: 
                    System.out.println();
                    System.out.println(App.RED + "Opción inválida" + App.RESET);
                    opcion = 1;
            }
            System.out.println();
        } while (opcion > 0 && opcion <= 10);
    }
}
