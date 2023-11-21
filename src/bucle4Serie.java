/*Copyright (C) 2K23, Francisco Torres
 * (Nombre grupo), francisco.torres@epn.edu.ec
 * Version 1.0
 */

 /**
  * Crea la siguiente serie:  0/2  1/4  1/6  2/8  3/10  5/12  8/14  13/16 ...
  * @author Francisco Torres
  * @version 1.0
  */
import java.util.Scanner;
public class bucle4Serie{
    
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
            SerieNumero4 serieCuatro = new SerieNumero4();
            System.out.println("Ingrese un numero:");
            int numSerie=scanner.nextInt();
            serieCuatro.TorresSerie4For(numSerie);
            System.out.println();
            serieCuatro.TorresSerie4while(numSerie);
            System.out.println();
            serieCuatro.TorresSerie4Dowhile(numSerie);

    }
    }