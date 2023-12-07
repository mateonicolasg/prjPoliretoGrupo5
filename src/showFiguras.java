public class showFiguras {
    Figuras oFigura = new Figuras();

    App1 oApp1 = new App1();
    
    int nroNiveles;
    int opcion;

    public void showMenu1(){
        do{
                
            System.out.println();
            System.out.println("MENÚ FIGURAS");
            System.out.println("1. Figura 1");
            System.out.println("2. Figura 2");
            System.out.println("3. Figura 3");
            System.out.println("4. Figura 4");
            System.out.println("18. Figura 18");
            System.out.println("19. Figura 19");
            System.out.println("0. Salir");
            System.out.print("Ingresa una opción: ");

            
            opcion = App.sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.print("Ingrese un tamaño: ");
                    nroNiveles = App.sc.nextInt();
                    oFigura.showFigura3For(nroNiveles);
                    
                    break;
                case 2:
                    System.out.print("Ingrese un tamaño: ");    
                    nroNiveles = App.sc.nextInt();   
                    oFigura.showFigura4For(nroNiveles);
                    break;
                case 3:
                    System.out.print("Ingrese un tamaño: ");
                    nroNiveles = App.sc.nextInt();
                    oFigura.showFigura5For(nroNiveles);
                    break;
                case 4:
                    System.out.print("Ingrese un tamaño: ");
                    nroNiveles = App.sc.nextInt();
                    oFigura.showFigura6For(nroNiveles);
                    break;
                case 18:
                    System.out.print("Ingrese un tamaño: ");
                    nroNiveles = App.sc.nextInt();
                    oFigura.figura18for(nroNiveles);
                    break;
                case 19:
                    System.out.print("Ingrese un tamaño: ");
                    nroNiveles = App.sc.nextInt();
                    oFigura.figura19For(nroNiveles);
                    break;
                case 0:
                oApp1.MenuPrincipal();
            }
        } while (opcion < 0 && opcion > 6);
    }
}


