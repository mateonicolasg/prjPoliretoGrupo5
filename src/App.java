import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MateoGrupo5 oSerieNumeros12 = new MateoGrupo5();

        System.out.println("GRUPO: ");        
        System.out.println("INTEGRANTES: Simbaña.Mateo, Vera.Edison, Negrete.Francisco, Unaucho.David, Velasco.Matheus, Santacruz.Estefano, Vanegas.German");        
        
        System.out.print("Ingrese el número de términos para las series: ");
        int Nrotermino = sc.nextInt();

        System.out.println("S12: ");
        oSerieNumeros12.showSerieFor(Nrotermino); 
        System.out.println();
        oSerieNumeros12.showSerieWhile(Nrotermino);
        System.out.println();
        oSerieNumeros12.showSerieDowhile(Nrotermino);

        sc.close();
    }
}
