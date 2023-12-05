import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        SerieNumero1 oSerieNumero1 = new SerieNumero1();
        SerieNumero2 oSerieNumero2 = new SerieNumero2();
        MateoGrupo5 oSerieNumeros12 = new MateoGrupo5();
        SerieTercerEjercicio SerieTercerEjercicio = new SerieTercerEjercicio();
        SerieNumero4 serieCuatro = new SerieNumero4();

        SerieCaracteres1 oSerieCaracteres1 = new SerieCaracteres1();
        SerieCaracteres2 oSerieCaracteres2 = new SerieCaracteres2();
        SerieCaracteresS3 oSerieCaracteresS3 = new SerieCaracteresS3();
        SerieCaracteres4 oSerieCaracteres4 = new SerieCaracteres4();
        SerieCaracteres5 oSerieCaracteres5 = new SerieCaracteres5();
        SerieCaracteres6 oSerieCaracteres6 = new SerieCaracteres6();
        SerieCaracteres6B oSerieCaracteres6B = new SerieCaracteres6B();
        SerieCaracteres7 oSerieCaracteres7 = new SerieCaracteres7();

        Figura1 oFigura1 = new Figura1();
        Figura2 oFigura2 = new Figura2();
        Figura3 oFigura3 = new Figura3();
        Figura4 oFigura4 = new Figura4();

        System.out.println("GRUPO: ");        
        System.out.println("INTEGRANTES: Simbaña.Mateo, Vera.Edison, Negrete.Francisco, Unaucho.David, Velasco.Matheus, Santacruz.Estefano, Vanegas.German");        
        
        System.out.print("Ingrese el número de términos para las series: ");
        int nroTerminos = sc.nextInt();

        // // German Vanegas
        // System.out.println("S3: ");
        // SerieTercerEjercicio.generarSerie(nroTerminos);
        // SerieTercerEjercicio.mostrarSerie();
        
        // //Francisco Torres
        //     System.out.println();
        //     System.out.println("S4: ");
        //     serieCuatro.TorresSerie4For(nroTerminos);
        //     System.out.println();
        //     serieCuatro.TorresSerie4while(nroTerminos);
        //     System.out.println();
        //     serieCuatro.TorresSerie4Dowhile(nroTerminos);

        // // David Unaucho


        // System.out.println();
        // System.out.println("S1: ");
        // oSerieNumero1.UnauchoSerie1for(nroTerminos);
        // System.out.println();
        // oSerieNumero1.UnauchoSerie1while(nroTerminos);
        // System.out.println();
        // oSerieNumero1.UnauchoSerie1Dowhile(nroTerminos);

        // System.out.println();
        // System.out.println("S2: ");
        // oSerieNumero2.UnauchoSerie2for(nroTerminos);
        // System.out.println();
        // oSerieNumero2.UnauchoSerie2while(nroTerminos);
        // System.out.println();
        // oSerieNumero2.UnauchoSerie2Dowhile(nroTerminos);

       
        // System.out.println();
        // System.out.println("S-C 3: ");
        // oSerieCaracteresS3.showSerieFor(nroTerminos);
        // System.out.println();
        // oSerieCaracteresS3.showSerieDoWhile(nroTerminos);
        // System.out.println();
        // oSerieCaracteresS3.showSerieWhile(nroTerminos);
        

        // // Mateo Simbaña
        // System.out.println();
        // System.out.println("S12: ");
        // oSerieNumeros12.showSerieFor(nroTerminos); 
        // System.out.println();
        // oSerieNumeros12.showSerieWhile(nroTerminos);
        // System.out.println();
        // oSerieNumeros12.showSerieDowhile(nroTerminos);

        // System.out.println();
        // System.out.println("------------------------");
        // System.out.println("SERIES CARACTERES");
        // System.out.println();
        // System.out.println("S1: ");
        // oSerieCaracteres1.showSerieFor(nroTerminos);
        // System.out.println();
        // oSerieCaracteres1.showSerieDowhile(nroTerminos);
        // System.out.println();
        // oSerieCaracteres1.showSerieWhile(nroTerminos);

        // System.out.println();
        // System.out.println("S2: ");
        // oSerieCaracteres2.showSerieFor(nroTerminos);
        // System.out.println();
        // oSerieCaracteres2.showSerieDowhile(nroTerminos);
        // System.out.println();
        // oSerieCaracteres2.showSerieWhile(nroTerminos);

        // System.out.println();
        // System.out.println("S4: ");
        // oSerieCaracteres4.showSerieFor(nroTerminos);
        // System.out.println();
        // oSerieCaracteres4.showSerieDowhile(nroTerminos);
        // System.out.println();
        // oSerieCaracteres4.showSerieWhile(nroTerminos);
        
        // System.out.println();
        // System.out.println("S5: ");
        // oSerieCaracteres5.showSerieFor(nroTerminos);
        // System.out.println();
        // oSerieCaracteres5.showSerieDowhile(nroTerminos);
        // System.out.println();
        // oSerieCaracteres5.showSerieWhile(nroTerminos);

        // System.out.println();
        // System.out.println("S6: ");
        // oSerieCaracteres6.showSerieFor(nroTerminos);
        // System.out.println();
        // oSerieCaracteres6.showSerieDowhile(nroTerminos);
        // System.out.println();
        // oSerieCaracteres6.showSerieWhile(nroTerminos);
        // System.out.println();

        // System.out.println();
        // System.out.println("6B: ");
        // oSerieCaracteres6B.showSerieFor(nroTerminos);
        // System.out.println();
        // oSerieCaracteres6B.showSerieDowhile(nroTerminos);
        // System.out.println();
        // oSerieCaracteres6B.showSerieWhile(nroTerminos);

        // System.out.println();
        // System.out.println("6B: ");
        // oSerieCaracteres7.showSerieFor(nroTerminos);
        // System.out.println();
        // oSerieCaracteres7.showSerieDowhile(nroTerminos);
        // System.out.println();
        // oSerieCaracteres7.showSerieWhile(nroTerminos);
        // System.out.println();

        System.out.print("Ingrese el número de niveles o tamaños para las figuras: ");
        int nroNiveles = sc.nextInt();
        
        System.out.println("F1:");
        System.out.println();
        oFigura1.showFiguraFor1(nroNiveles);
        System.out.println();
        oFigura1.showFiguraDoWhile1(nroNiveles);
        System.out.println();
        oFigura1.showFiguraWhile1(nroNiveles);

        System.out.println("F2:");
        System.out.println();
        oFigura2.showFiguraFor2(nroNiveles);
        System.out.println();
        oFigura2.showFiguraDoWhile2(nroNiveles);
        System.out.println();
        oFigura2.showFiguraWhile2(nroNiveles);
        
        System.out.println("F3:");
        System.out.println();
        oFigura3.showFiguraFor(nroNiveles);
        System.out.println();
        oFigura3.showFiguraDowhile(nroNiveles);
        System.out.println();
        oFigura3.showFiguraWhile(nroNiveles);
        
        System.out.println("F4:");
        System.out.println();
        oFigura4.showFiguraFor(nroNiveles);
        System.out.println();
        oFigura4.showFiguraDowhile(nroNiveles);
        System.out.println();
        oFigura4.showFiguraWhile(nroNiveles);
        System.out.println();
       
        
    }
}
