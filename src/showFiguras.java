/**
 * Presentar Figuras
 * @author: CodeMasters
 * @version: 1.0
 */
public class showFiguras {
    Figuras oFigura = new Figuras();
    ControlDatos oControlDatos = new ControlDatos();
    App oApp = new App();
    
    int nroNiveles;
    int opcion;
    /**
     * <b>showMenu3</b> muestra el menú de las figuras.
     * showMenu3 
     */
    public void showMenu3(){
        do{     
            System.out.println();
            System.out.println(App.BLUE + "MENÚ FIGURAS" + App.RESET);
            System.out.println(App.BLUE + "1.  " + App.RESET + "Figura " + App.BLUE + "[1]" + App.RESET);
            System.out.println(App.BLUE + "2.  " + App.RESET + "Figura " + App.BLUE + "[2]" + App.RESET);
            System.out.println(App.BLUE + "3.  " + App.RESET + "Figura " + App.BLUE + "[3]" + App.RESET);
            System.out.println(App.BLUE + "4.  "+ App.RESET + "Figura " + App.BLUE + "[4]"+ App.RESET);
            System.out.println(App.BLUE + "5.  "+ App.RESET + "Figura " + App.BLUE + "[5]" + App.RESET);
            System.out.println(App.BLUE + "6.  "+ App.RESET + "Figura " + App.BLUE + "[6]" + App.RESET);
            System.out.println(App.BLUE + "7.  "+ App.RESET + "Figura " + App.BLUE + "[7]" + App.RESET);
            System.out.println(App.BLUE + "8.  "+ App.RESET + "Figura " + App.BLUE + "[8]" + App.RESET);
            System.out.println(App.BLUE + "9.  "+ App.RESET + "Figura " + App.BLUE + "[9]" + App.RESET);
            System.out.println(App.BLUE + "10. "+ App.RESET + "Figura " + App.BLUE + "[10]" + App.RESET);
            System.out.println(App.BLUE + "11. "+ App.RESET + "Figura " + App.BLUE + "[11]" + App.RESET);
            System.out.println(App.BLUE + "12. "+ App.RESET + "Figura " + App.BLUE + "[12]" + App.RESET);
            System.out.println(App.BLUE + "13. "+ App.RESET + "Figura " + App.BLUE + "[13]" + App.RESET);
            System.out.println(App.BLUE + "14. "+ App.RESET + "Figura " + App.BLUE + "[14]" + App.RESET);
            System.out.println(App.BLUE + "15. "+ App.RESET + "Figura " + App.BLUE + "[15]" + App.RESET);
            System.out.println(App.BLUE + "16. "+ App.RESET + "Figura " + App.BLUE + "[16]" + App.RESET);
            System.out.println(App.BLUE + "17. "+ App.RESET + "Figura " + App.BLUE + "[17]" + App.RESET);
            System.out.println(App.BLUE + "18. "+ App.RESET + "Figura " + App.BLUE + "[18]" + App.RESET);
            System.out.println(App.BLUE + "19. "+ App.RESET + "Figura " + App.BLUE + "[19]" + App.RESET);
            System.out.println(App.RED +"0. Salir" + App.RESET);
            opcion = oControlDatos.getPositiveOp();
            switch(opcion){
                case 1:
                    nroNiveles = oControlDatos.getPositiveLevel();
                    oFigura.showFigura1For(nroNiveles);
                    break;
                case 2:
                    nroNiveles = oControlDatos.getPositiveLevel();
                    oFigura.showFigura2For(nroNiveles);
                    break;
                case 3:
                    nroNiveles = oControlDatos.getPositiveLevel();
                    oFigura.showFigura3For(nroNiveles);
                    break;
                case 4:    
                    nroNiveles = oControlDatos.getPositiveLevel();   
                    oFigura.showFigura4For(nroNiveles);
                    break;
                case 5:
                    nroNiveles = oControlDatos.getPositiveLevel();
                    oFigura.showFigura5For(nroNiveles);
                    break;
                case 6:
                    nroNiveles = oControlDatos.getPositiveLevel();
                    oFigura.showFigura6For(nroNiveles);
                    break;
                case 7:
                    nroNiveles = oControlDatos.getPositiveLevel();
                    oFigura.showFigura7For(nroNiveles);
                    break;
                case 8:
                    nroNiveles = oControlDatos.getPositiveLevel();
                    oFigura.showFigura8For(nroNiveles);
                    break;
                case 9:
                    nroNiveles = oControlDatos.getPositiveLevel();
                    oFigura.showFigura9For(nroNiveles);
                    break;
                case 10:
                    nroNiveles = oControlDatos.getPositiveLevel();
                    oFigura.showFigura10For(nroNiveles);
                    break;
                case 11:
                    nroNiveles = oControlDatos.getPositiveLevel();
                    oFigura.showFigura11For(nroNiveles);
                    break;
                case 12:
                    nroNiveles = oControlDatos.getPositiveLevel();
                    oFigura.showFigura12For(nroNiveles);
                    break;
                case 13:
                    nroNiveles = oControlDatos.getPositiveLevel();
                    oFigura.showFigura13For(nroNiveles);
                    break;
                case 14:
                    nroNiveles = oControlDatos.getPositiveLevel();
                    oFigura.showFigura14For(nroNiveles);
                    break;
                case 15:
                    nroNiveles = oControlDatos.getPositiveLevel();
                    oFigura.showFigura15For(nroNiveles);
                    break;
                case 16:
                    nroNiveles = oControlDatos.getPositiveLevel();
                    oFigura.showFigura16For(nroNiveles);
                    break;
                case 17:
                    nroNiveles = oControlDatos.getPositiveLevel();
                    oFigura.showFigura17For(nroNiveles);
                    break;
                case 18:
                    nroNiveles = oControlDatos.getPositiveLevel();
                    oFigura.showFigura18For(nroNiveles);
                    break;
                case 19:
                    nroNiveles = oControlDatos.getPositiveLevel();
                    oFigura.showFigura19For(nroNiveles);
                    break;
                case 0:
                    System.out.println();
                    System.out.println(App.BLUE + "Saliendo al Menú principal..."+ App.RESET);
                    System.out.println();
                    oApp.MenuPrincipal();
                    break;
                default: 
                     System.out.println();   
                    System.out.println(App.RED + "Opción inválida" + App.RESET);
                    opcion = 1;
            }
            System.out.println();
        } while (opcion > 0 && opcion <= 19);
    }
}


