/**
 * Presentar ejercicios de recursividad
 * @author: CodeMasters
 * @version: 1.0
 */
public class showEjerciciosRecursion {
    EjerciciosRecursion oEjerciciosRecursion = new EjerciciosRecursion();
    ControlDatos oControlDatos = new ControlDatos();
    App oApp = new App();
    
    int a, b;
    int opcion;
    /**
     * <b>showMenu7</b> muestra el menú de los ejercicios de recurividad
     * showMenu7
     */
    public void showMenu7(){
        do{     
            System.out.println();
            System.out.println(App.YELLOW2 + "MENÚ EJERCICIOS RECURSIVIDAD" + App.RESET);
            System.out.println(App.YELLOW2 + "1." + App.RESET + " Factorial");
            System.out.println(App.YELLOW2 + "2." + App.RESET + " Suma");
            System.out.println(App.YELLOW2 + "3." + App.RESET + " Multiplicación");
            System.out.println(App.YELLOW2 + "4." + App.RESET + " Potencia");
            System.out.println(App.YELLOW2 + "5." + App.RESET + " Conteo progresivo hasta (n)");
            System.out.println(App.YELLOW2 + "6." + App.RESET + " conteo regresivo(n) hasta 0");
            System.out.println(App.RED +"0. Salir" + App.RESET);
            opcion = oControlDatos.getPositiveOp();
            switch(opcion){
                case 2:
                    System.out.println(App.CYAN + "Primer sumando" + App.RESET);
                    a = oControlDatos.getPositiveValor();
                    System.out.println(App.CYAN +"Segundo sumando" + App.RESET);
                    b = oControlDatos.getPositiveValor();
                    System.out.println();  
                    System.out.print("El resultado de " + a + " + " + b + " es: " + oEjerciciosRecursion.sumaRecursiva(a, b));
                    break;
                case 3:
                    System.out.println(App.CYAN +"Primer factor" + App.RESET);
                    a = oControlDatos.getPositiveValor();
                    System.out.println(App.CYAN +"Segundo factor" + App.RESET);
                    b = oControlDatos.getPositiveValor();
                    System.out.println();     
                    System.out.print("El resultado de " + a + " * " + b + " es: " + oEjerciciosRecursion.sumaRecursiva(a, b));   
                    break;
                case 4:
                    System.out.println(App.CYAN +"Base" + App.RESET);
                    a = oControlDatos.getPositiveValor();
                    System.out.println(App.CYAN +"Exponente" + App.RESET);
                    b = oControlDatos.getPositiveValor();
                    System.out.println();     
                    System.out.print("El resultado de " + a + " elevado a la " + b + " es: " + oEjerciciosRecursion.sumaRecursiva(a, b)); 
                    break;
                case 5:
                    b = oControlDatos.getPositiveValor();
                    System.out.println("Conteo progresivo hasta "+ b );     
                    oEjerciciosRecursion.conteoProgresivoRecursivo(1, b);
                    break;
                case 0:
                    System.out.println();
                    System.out.println(App.YELLOW2 + "Saliendo al Menú principal..." + App.RESET);
                    System.out.println();
                    oApp.MenuPrincipal();
                    break;
                default: 
                    System.out.println();
                    System.out.println(App.RED + "Opción inválida" + App.RESET);
                    opcion = 1;
            }
            System.out.println();
        } while (opcion > 0 && opcion <= 6);
    }
}
