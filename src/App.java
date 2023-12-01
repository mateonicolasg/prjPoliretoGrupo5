import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MateoGrupo5 oSerieNumeros12 = new MateoGrupo5();
        SerieTercerEjercicio SerieTercerEjercicio = new SerieTercerEjercicio();

        SerieCaracteres1 oSerieCaracteres1 = new SerieCaracteres1();
        SerieCaracteres6 oSerieCaracteres6 = new SerieCaracteres6();

        System.out.println("GRUPO: ");        
        System.out.println("INTEGRANTES: Simbaña.Mateo, Vera.Edison, Negrete.Francisco, Unaucho.David, Velasco.Matheus, Santacruz.Estefano, Vanegas.German");        
        
        System.out.print("Ingrese el número de términos para las series: ");
        int nroTerminos = sc.nextInt();

        // German Vanegas
        System.out.println("S3: ");
        SerieTercerEjercicio.generarSerie(nroTerminos);
        SerieTercerEjercicio.mostrarSerie();
        
        //Francisco Torres
            SerieNumero4 serieCuatro = new SerieNumero4();
            System.out.println();
            System.out.println("S4: ");
            serieCuatro.TorresSerie4For(nroTerminos);
            System.out.println();
            serieCuatro.TorresSerie4while(nroTerminos);
            System.out.println();
            serieCuatro.TorresSerie4Dowhile(nroTerminos);

        // Mateo Simbaña
        System.out.println();
        System.out.println("S12: ");
        oSerieNumeros12.showSerieFor(nroTerminos); 
        System.out.println();
        oSerieNumeros12.showSerieWhile(nroTerminos);
        System.out.println();
        oSerieNumeros12.showSerieDowhile(nroTerminos);

        System.out.println();
        System.out.println("------------------------");
        System.out.println("SERIES CARACTERES");
        System.out.println();
        System.out.println("S1: ");
        oSerieCaracteres1.showSerieFor(nroTerminos);
        System.out.println();
        oSerieCaracteres1.showSerieDowhile(nroTerminos);
        System.out.println();
        oSerieCaracteres1.showSerieWhile(nroTerminos);

        System.out.println();
        System.out.println("S6: ");
        oSerieCaracteres6.showSerieFor(nroTerminos);
        System.out.println();
        oSerieCaracteres6.showSerieDowhile(nroTerminos);
        System.out.println();
        oSerieCaracteres6.showSerieWhile(nroTerminos);
        sc.close();
    }
}
