public class showSeriesNumeros {
    SeriesNumeros oSeriesNumeros = new SeriesNumeros();
    App oApp = new App();
    
    int nroTerminos;
    int opcion;

    public void showMenu1(){
        do{     
            System.out.println();
            System.out.println("MENÚ SERIES NUMÉRICAS");
            System.out.println("1. Serie de números 1");
            System.out.println("2. Serie de números 2");
            System.out.println("3. Serie de números 3");
            System.out.println("4. Serie de números 4");
            System.out.println("9. Serie de números 9");
            System.out.println("10. Serie de números 10");
            System.out.println("12. Serie de números 12");
            System.out.println("0. Salir");
            System.out.print("Ingresa una opción: ");

            
            opcion = App.sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.print("Ingrese el número de términos: ");
                    nroTerminos = App.sc.nextInt();
                    oSeriesNumeros.showSerie1For(nroTerminos);
                    
                    break;
                case 2:
                    System.out.print("Ingrese el número de términos: ");    
                    nroTerminos = App.sc.nextInt();   
                    oSeriesNumeros.showSerie2For(nroTerminos);
                    break;
                case 3:
                    System.out.print("Ingrese el número de términos: ");
                    nroTerminos = App.sc.nextInt();
                    oSeriesNumeros.showSerie3For(nroTerminos);
                    break;
                case 4:
                    System.out.print("Ingrese el número de términos: ");
                    nroTerminos = App.sc.nextInt();
                    oSeriesNumeros.showSerie4For(nroTerminos);
                    break;
                case 9:
                    System.out.print("Ingrese el número de términos: ");
                    nroTerminos = App.sc.nextInt();
                    oSeriesNumeros.showSerie9For(nroTerminos);
                    break;
                case 10:
                    System.out.print("Ingrese el número de términos: ");
                    nroTerminos = App.sc.nextInt();
                    oSeriesNumeros.showSerie10For(nroTerminos);
                    break;
                case 12:
                    System.out.print("Ingrese el número de términos: ");
                    nroTerminos = App.sc.nextInt();
                    oSeriesNumeros.showSerie12For(nroTerminos);
                    break;
                case 0:
                    oApp.MenuPrincipal();
            }
        } while (opcion >= 0 && opcion <= 12);
    }
}
