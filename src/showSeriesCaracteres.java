public class showSeriesCaracteres {
    SeriesCaracteres oSeriesCaracteres = new SeriesCaracteres();
    App oApp = new App();

    int nroTerminos;
    int opcion;

    public void showMenu2(){
        do{     
            System.out.println();
            System.out.println("MENÚ SERIES CARACTERES");
            System.out.println("1. Serie de caracteres 1");
            System.out.println("2. Serie de caracteres 2");
            System.out.println("4. Serie de caracteres 4");
            System.out.println("5. Serie de caracteres 5");
            System.out.println("6. Serie de caracteres 6");
            System.out.println("7. Serie de caracteres 7");
            System.out.println("8. Serie de caracteres 8");
            System.out.println("9. Serie de caracteres 9");
            System.out.println("0. Salir");
            System.out.print("Ingresa una opción: ");

            
            opcion = App.sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.print("Ingrese el número de términos: ");
                    nroTerminos = App.sc.nextInt();
                    oSeriesCaracteres.showSerie1For(nroTerminos);
                    
                    break;
                case 2:
                    System.out.print("Ingrese el número de términos: ");    
                    nroTerminos = App.sc.nextInt();   
                    oSeriesCaracteres.showSerie2For(nroTerminos);
                    break;
                case 4:
                    System.out.print("Ingrese el número de términos: ");
                    nroTerminos = App.sc.nextInt();
                    oSeriesCaracteres.showSerie4For(nroTerminos);
                    break;
                case 5:
                    System.out.print("Ingrese el número de términos: ");
                    nroTerminos = App.sc.nextInt();
                    oSeriesCaracteres.showSerie5For(nroTerminos);
                    break;
                case 6:
                    System.out.print("Ingrese el número de términos: ");
                    nroTerminos = App.sc.nextInt();
                    oSeriesCaracteres.showSerie6For(nroTerminos);
                    break;
                case 7:
                    System.out.print("Ingrese el número de términos: ");
                    nroTerminos = App.sc.nextInt();
                    oSeriesCaracteres.showSerie7For(nroTerminos);
                    break;
                case 8:
                    System.out.print("Ingrese el número de términos: ");
                    nroTerminos = App.sc.nextInt();
                    oSeriesCaracteres.showSerie8For(nroTerminos);
                    break;
                case 9:
                    System.out.print("Ingrese el número de términos: ");
                    nroTerminos = App.sc.nextInt();
                    oSeriesCaracteres.showSerie9For(nroTerminos);
                    break;
                case 0:
                    oApp.MenuPrincipal();
            }
        } while (opcion >= 0 && opcion <= 9);
    }
}
