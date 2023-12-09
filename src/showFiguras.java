public class showFiguras {
    Figuras oFigura = new Figuras();

    App oApp = new App();
    
    int nroNiveles;
    int opcion;

    public void showMenu3(){
        do{     
            System.out.println();
            System.out.println("MENÚ FIGURAS");
            System.out.println("3. Figura 3");
            System.out.println("4. Figura 4");
            System.out.println("5. Figura 5");
            System.out.println("6. Figura 6");
            System.out.println("16. Figura 16");
            System.out.println("17. Figura 17");
            System.out.println("18. Figura 18");
            System.out.println("19. Figura 19");
            System.out.println("0. Salir");
            System.out.print("Ingresa una opción: ");

            
            opcion = App.sc.nextInt();

            switch(opcion){
                case 3:
                    System.out.print("Ingrese un tamaño: ");
                    nroNiveles = App.sc.nextInt();
                    oFigura.showFigura3For(nroNiveles);
                    
                    break;
                case 4:
                    System.out.print("Ingrese un tamaño: ");    
                    nroNiveles = App.sc.nextInt();   
                    oFigura.showFigura4For(nroNiveles);
                    break;
                case 5:
                    System.out.print("Ingrese un tamaño: ");
                    nroNiveles = App.sc.nextInt();
                    oFigura.showFigura5For(nroNiveles);
                    break;
                case 6:
                    System.out.print("Ingrese un tamaño: ");
                    nroNiveles = App.sc.nextInt();
                    oFigura.showFigura6For(nroNiveles);
                    break;
                case 16:
                    System.out.print("Ingrese un tamaño: ");
                    nroNiveles = App.sc.nextInt();
                    oFigura.showFigura16For(nroNiveles);
                    break;
                case 17:
                    System.out.print("Ingrese un tamaño: ");
                    nroNiveles = App.sc.nextInt();
                    oFigura.showFigura17For(nroNiveles);
                    break;
                case 18:
                    System.out.print("Ingrese un tamaño: ");
                    nroNiveles = App.sc.nextInt();
                    oFigura.showFigura18For(nroNiveles);
                    break;
                case 19:
                    System.out.print("Ingrese un tamaño: ");
                    nroNiveles = App.sc.nextInt();
                    oFigura.showFigura19For(nroNiveles);
                    break;
                case 0:
                    oApp.MenuPrincipal();
            }
        } while (opcion >= 0 && opcion <= 19);
    }
}


