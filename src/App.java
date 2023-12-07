import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        MateoGrupo5 oSerieNumeros12 = new MateoGrupo5();
        SerieTercerEjercicio SerieTercerEjercicio = new SerieTercerEjercicio();

        SerieCaracteres1 oSerieCaracteres1 = new SerieCaracteres1();
        SerieCaracteres2 oSerieCaracteres2 = new SerieCaracteres2();
        SerieCaracteres4 oSerieCaracteres4 = new SerieCaracteres4();
        SerieCaracteres5 oSerieCaracteres5 = new SerieCaracteres5();
        SerieCaracteres6 oSerieCaracteres6 = new SerieCaracteres6();
        SerieCaracteres6B oSerieCaracteres6B = new SerieCaracteres6B();
        SerieCaracteres7 oSerieCaracteres7 = new SerieCaracteres7();
        SerieCaracteres9 serie9=new SerieCaracteres9();
        SerieNumero4 serieCuatro = new SerieNumero4();
        delays progressbar=new delays();
        figuras f16yf17=new figuras();
        Figura3 oFigura3 = new Figura3();
        Figura4 oFigura4 = new Figura4();
        System.out.println("GRUPO: ");        
        System.out.println("INTEGRANTES: Simbaña.Mateo, Vera.Edison, Negrete.Francisco, Unaucho.David, Velasco.Matheus, Santacruz.Estefano, Vanegas.German");        
        
        System.out.print("Ingrese el número de términos para las series: ");
        int nroTerminos = sc.nextInt();

        // MATHEUS VELASCO
        System.out.println("S9:");
        oSerieNumeros9.serienumeros_X2(nroTerminos);
        System.out.println();
        oSerieNumeros9.serienumeros_X2while(nroTerminos);
        System.out.println();
        oSerieNumeros9.serienumeros_X2doWhile(nroTerminos);

        System.out.println("S10:");
        oSerieNumeros10.serienumeros_X3(nroTerminos);
        System.out.println();
        oSerieNumeros10.serienumeros_X3while(nroTerminos);
        System.out.println();
        oSerieNumeros10.serienumeros_X3dowhile(nroTerminos);



        // German Vanegas
        System.out.println("S3: ");
        SerieTercerEjercicio.generarSerie(nroTerminos);
        SerieTercerEjercicio.mostrarSerie();
        
        //Francisco Torres
            System.out.println();
            System.out.println("S4: ");
            serieCuatro.TorresSerie4For(nroTerminos);
            System.out.println();
            serieCuatro.TorresSerie4while(nroTerminos);
            System.out.println();
            serieCuatro.TorresSerie4Dowhile(nroTerminos);
            System.out.println();
            System.out.println("S9: ");
            serie9.serieCaracteres9(nroTerminos);
            System.out.println();
            System.out.println("F16: ");
            f16yf17.f16(nroTerminos);
            System.out.println();
            System.out.println("F17: ");
            f16yf17.f17(nroTerminos);
            System.out.println();
            System.out.println("L01: ");
            progressbar.L01();
            System.out.println();
            System.out.println("L02: ");
            progressbar.L02();
            System.out.println();
            System.out.println("L03: ");
            progressbar.L03();
            
        // Mateo Simbaña
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

        System.out.println("F18:");
        System.out.println();
        oFigura18.figura18for(nroNiveles);
        System.out.println();
        oFigura18.figura18While(nroNiveles);
        System.out.println();
        oFigura18.figuras18DoWhile(nroNiveles);

        System.out.println("F19:");
        System.out.println();
        oFigura19.figura19For(nroNiveles);
        System.out.println();
        oFigura19.figuras19While(nroNiveles);
        System.out.println();
        oFigura19.figuras19DoWhile(nroNiveles);

        System.out.println("Loading04:");
        System.out.println();
        oLoading04.loading04();
        System.out.println();

        System.out.println("Loading05:");
        System.out.println();
        oLoading05.loading05();
        System.out.println();

        System.out.println("Loading06:");
        System.out.println();
        oLoading06.loading06();
        System.out.println();

        System.out.println("Loading07:");
        System.out.println();
        oLoading07.loading07();
        System.out.println();
        
        System.out.print("Introduce el valor de a: ");
            int a = sc.nextInt();

        System.out.print("Introduce el valor de b: ");
            int b = sc.nextInt();

        System.out.println("Recursion03:");
        System.out.println();
        System.out.println("El resultado es: " + oRecursion03.recusion03(a, b));
     }
}
