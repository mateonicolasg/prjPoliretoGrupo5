public class showEjerciciosRecursion {
    EjerciciosRecursion oEjerciciosRecursion = new EjerciciosRecursion();
    App oApp = new App();
    
    int a, b;
    int opcion;

    public void showMenu7(){
        do{     
            System.out.println();
            System.out.println("MENÚ EJERCICIOS RECURSIVIDAD");
            System.out.println("1. Factorial");
            System.out.println("2. Suma");
            System.out.println("3. Multiplicación");
            System.out.println("4. Potencia");
            System.out.println("5. Conteo progresivo hasta (n)");
            System.out.println("6. conteo regresivo(n) hasta 0");
            System.out.println("0. Salir");
            System.out.print("Ingresa una opción: ");

            
            opcion = App.sc.nextInt();

            switch(opcion){
                case 2:
                    System.out.print("Introduce el valor de a: ");
                    a = App.sc.nextInt();
                    System.out.print("Introduce el valor de b: ");
                    b = App.sc.nextInt();     
                    System.out.println("El resultado es: " + oEjerciciosRecursion.sumaRecursiva(a, b));
                    break;
                case 3:
                    System.out.print("Introduce el valor de a: ");
                    a = App.sc.nextInt();
                    System.out.print("Introduce el valor de b: ");
                    b = App.sc.nextInt();     
                    System.out.println("El resultado es: " + oEjerciciosRecursion.multiplicacionRecursiva(a, b));   
                    break;
                case 4:
                    System.out.print("Introduce el valor de a: ");
                    a = App.sc.nextInt();
                    System.out.print("Introduce el valor de b: ");
                    b = App.sc.nextInt();     
                    System.out.println("El resultado es: " + oEjerciciosRecursion.potenciaRecursiva(a, b));
                    break;
                case 0:
                    oApp.MenuPrincipal();
            }
        } while (opcion >= 0 && opcion <= 6);
    }
}
