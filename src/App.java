import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------Bienvenido al programa de series de numeros del grupo 5----------------");
        System.out.println("Integrantes: .......");
        System.out.println("1. Serie Fibonacci");
        System.out.println("2. Serie Alternante");
        System.out.println("3. Serie Fraccion Fibonacci Impar");
        System.out.println("4. Serie Fraccion Fibonacci Par");
        System.out.println("5. Serie Numeros Primos");
        System.out.println("6. Serie Cuadrados");
        System.out.println("7. Serie Aritmetica");
        System.out.println("8. Serie Aritmetica +5");
        System.out.println("9. Serie Numeros Potencia de 2");
        System.out.println("10. Serie Numeros Potencia de 3");
        System.out.println("11. Serie Numeros Aritmetica +4");
        System.out.println("Ingrese el numero de la serie que desea ver: ");
        int NroSerie = scanner.nextInt();

        System.out.println("Ingrese el numero de terminos de la serie: ");
        int NroTerminos = scanner.nextInt();

        SerieNumeros_X2 serie_9 = new SerieNumeros_X2();
        SerieNumeros_X3 serie_10 = new SerieNumeros_X3();

        switch (NroSerie) {
            case 1:
                
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:
                
                break;
            case 5:

                break;
            case 6:
                
                break;
            case 7:
                
                break;
            case 8:
                
                break;
            case 9:
            // Matheus Velasco
                serie_9.serienumeros_X2(NroTerminos);
                break;
            case 10:
            // Matheus Velasco
                serie_10.serienumeros_X3(NroTerminos);   
                break;
            case 11:
                
                break;
            default:
                System.out.println("El numero de serie no existe");
                break;
        }
        scanner.close();
    }
}
