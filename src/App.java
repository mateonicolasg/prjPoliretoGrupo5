import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
<<<<<<< HEAD
        Scanner sc = new Scanner(System.in);
        MateoGrupo5 oSerieNumeros12 = new MateoGrupo5();

        System.out.println("GRUPO: ");        
        System.out.println("INTEGRANTES: Simbaña.Mateo, Vera.Edison, Negrete.Francisco, Unaucho.David, Velasco.Matheus, Santacruz.Estefano, Vanegas.German");        
        
        System.out.print("Ingrese el número de términos para las series: ");
        int nroTerminos = sc.nextInt();

        System.out.println("S12: ");
        oSerieNumeros12.showSerieFor(nroTerminos); 
        System.out.println();
        oSerieNumeros12.showSerieWhile(nroTerminos);
        System.out.println();
        oSerieNumeros12.showSerieDowhile(nroTerminos);

        sc.close();
=======
        System.out.println("Hello, World!");
        // German Vanegas
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de terminos que desea en la serie: min 2");
        int numeroTerminos = sc.nextInt();

        SerieTercerEjercicio SerieTercerEjercicio = new SerieTercerEjercicio();

        SerieTercerEjercicio.generarSerie(numeroTerminos);
        SerieTercerEjercicio.mostrarSerie();

>>>>>>> master
    }
}
