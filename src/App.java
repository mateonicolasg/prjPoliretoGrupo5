import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MateoGrupo5 oSerieNumeros12 = new MateoGrupo5();
        SerieTercerEjercicio SerieTercerEjercicio = new SerieTercerEjercicio();

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

        
        sc.close();
    }
}
