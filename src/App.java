import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        SerieNumero1 oSerieNumero1 = new SerieNumero1();
        SerieNumero2 oSerieNumero2 = new SerieNumero2();
        MateoGrupo5 oSerieNumeros12 = new MateoGrupo5();
        SerieTercerEjercicio SerieTercerEjercicio = new SerieTercerEjercicio();
        SerieNumero4 serieCuatro = new SerieNumero4();
        SerieNumeros_X2 oSerieNumeros9 = new SerieNumeros_X2();
        SerieNumeros_X3 oSerieNumeros10 = new SerieNumeros_X3();

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
        Figura18 oFigura18 = new Figura18();
        Figura19 oFigura19 = new Figura19();

        SerieCadenasC1 oSerieCadenasC1 =new SerieCadenasC1();
        SerieCadenaC2 oSerieCadenaC2 = new SerieCadenaC2();

        Loading04 oLoading04 = new Loading04(); 
        Loading05 oLoading05 = new Loading05();
        Loading06 oLoading06 = new Loading06();
        Loading07 oLoading07 = new Loading07();
        Loading10 oLoading10 = new Loading10();

        Recursion03 oRecursion03 = new Recursion03();

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

        //System.out.println("Loading10:");
        //System.out.println();
        //oLoading10.LoadingU();
        //System.out.println();

        //System.out.println("Cadena1");
        //System.out.println();
        //oSerieCadenasC1.Frase1();
        //System.out.println();

        //System.out.println("Cadena1");
        //System.out.println();
        //oSerieCadenaC2.Frase2();
        //System.out.println();

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
<<<<<<< HEAD
       
        
=======

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
>>>>>>> d881961d94a5688c5b421d04249d171d729226ad
    }
}
