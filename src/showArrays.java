/**
 * Presentar Arrays
 * @author: CodeMasters
 * @version: 1.0
 */
public class showArrays {
    Array oArray = new Array();
    ControlDatos oControlDatos = new ControlDatos();
    App oApp = new App();
    
    int opcion;
    int tamaño;
    /**
     * <b>showMenu5</b> muestra el menú de los Arrays
     * showMenu5 
     */
    public void showMenu5() {
        do{     
            System.out.println();
            System.out.println(App.CYAN + "MENÚ LOADINGS"+ App.RESET);
            System.out.println(App.CYAN + "1." + App.RESET + " Array" + App.CYAN + " [1]" + App.RESET);
            System.out.println(App.CYAN + "2." + App.RESET + " Array " + App.CYAN + "[2]" + App.RESET);
            System.out.println(App.CYAN + "3." + App.RESET+ " Array " + App.CYAN + "[3]" + App.RESET);
            System.out.println(App.CYAN + "4." + App.RESET+ " Array " + App.CYAN + "[4]" + App.RESET);
            System.out.println(App.CYAN + "5." + App.RESET + " Array " + App.CYAN + "[5]" + App.RESET);
            System.out.println(App.RED + "0. Salir" + App.RESET);
            opcion = oControlDatos.getPositiveOp();
            switch(opcion){
                case 1:
                    
                    break;
                case 2:
                    System.out.println("Array 2 ");
                    tamaño = oControlDatos.getPositiveLevel();
                    App.sc.nextLine();
                    char caracter = oControlDatos.getCaracter();
                    oArray.Array2(tamaño, caracter);
                    break;
                case 3:
                    System.out.println("Array 3");
                    oArray.Array3();
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Array 5");
                    oArray.Array5();
                    break;
                case 0:
                    System.out.println();
                    System.out.println(App.PURPLE + "Saliendo al Menú principal..." + App.RESET);
                    System.out.println();
                    oApp.MenuPrincipal();
                    break;
                default: 
                    System.out.println();
                    System.out.println(App.WHITE + "Opción inválida" + App.RESET);
                    opcion = 1;
            }
            System.out.println();
        } while (opcion > 0 && opcion <= 5);
    }
}
