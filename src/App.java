import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MateoGrupo5 oSerieNumeros12 = new MateoGrupo5();
        SerieTercerEjercicio SerieTercerEjercicio = new SerieTercerEjercicio();
        SerieCaracteres9 serie9=new SerieCaracteres9();
        delays carga=new delays();
        figuras f16yf17=new figuras();
        recursivo potencia=new recursivo();
        System.out.println("GRUPO: ");        
        System.out.println("INTEGRANTES: Simbaña.Mateo, Vera.Edison, Negrete.Francisco, Unaucho.David, Velasco.Matheus, Santacruz.Estefano, Vanegas.German");        
        
        System.out.print("Ingrese el número de términos para las series: ");
        int nroTerminos = sc.nextInt();
        int term2=sc.nextInt();

        
        // // German Vanegas
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
        System.out.println();
        System.out.println("S9: ");
        serie9.serieCaracteres9(10);
        System.out.println();
        System.out.println("F16: ");
        f16yf17.f16(nroTerminos);
        System.out.println();
        System.out.println("F17: ");
        f16yf17.f17(nroTerminos);
        System.out.println();
        System.out.println("L01: ");
        carga.L01();
        System.out.println();
        System.out.println("L02: ");
        carga.L02();
        System.out.println();
        System.out.println("L03: ");
        carga.L03();
        System.out.println();
        System.out.println("Recursividad:");
        int pot =potencia.potenciaRecursiva(nroTerminos, term2);
        System.out.println(pot);
        
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
