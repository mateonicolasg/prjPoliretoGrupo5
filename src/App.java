import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // German Vanegas
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de terminos que desea en la serie: min 2");
        int numeroTerminos = sc.nextInt();

        SerieTercerEjercicio SerieTercerEjercicio = new SerieTercerEjercicio();

        SerieTercerEjercicio.generarSerie(numeroTerminos);
        SerieTercerEjercicio.mostrarSerie();

    }
}
