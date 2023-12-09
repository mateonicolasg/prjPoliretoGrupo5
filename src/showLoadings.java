public class showLoadings {
    Loadings oLoadings = new Loadings();
    App oApp = new App();
    
    // String frase;
    int opcion;

    public void showMenu6(){
        do{     
            System.out.println();
            System.out.println("MENÚ LOADINGS");
            System.out.println("1. Cadena de caracteres 1");
            System.out.println("2. Cadena de caracteres 2");
            System.out.println("3. Cadena de caracteres 3");
            System.out.println("4. Cadena de caracteres 4");
            System.out.println("5. Cadena de caracteres 5");
            System.out.println("6. Cadena de caracteres 6");
            System.out.println("7. Cadena de caracteres 7");
            System.out.println("0. Salir");
            System.out.print("Ingresa una opción: ");

            
            opcion = App.sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.print("Loading 1 ");
                    oLoadings.showLoading1();
                    
                    break;
                case 2:
                    System.out.print("Loading 2 ");       
                    oLoadings.showLoading2();
                    break;
                case 3:
                    System.out.print("Loading 3 ");
                    oLoadings.showLoading3();
                    break;
                case 4:
                    System.out.print("Loading 4 ");
                    oLoadings.showLoading4();
                    break;
                case 5:
                    System.out.print("Loading 5 ");
                    oLoadings.showLoading5();
                    break;
                case 6:
                    System.out.print("Loading 6 ");
                    oLoadings.showLoading6();
                    break;
                case 7:
                    System.out.print("Loading 7 ");
                    oLoadings.showLoading7();
                    break;
                case 0:
                    oApp.MenuPrincipal();
            }
        } while (opcion >= 0 && opcion <= 10);
    }
}
