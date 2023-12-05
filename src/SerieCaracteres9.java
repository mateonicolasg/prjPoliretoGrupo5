/*Copyright (C) 2K23, Francisco Torres
 * (Nombre grupo), francisco.torres@epn.edu.ec
 * Version 1.0
 */

 /**
  * Crea la siguiente serie:  a  b  c  dd  eee  fffff  gggggggg ...
  * @author Francisco Torres
  * @version 1.0
  */

public class SerieCaracteres9{

    public void serieCaracteres9(int n){
        char letra = 'c';
        System.out.print("a "+"b ");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(letra);
            }

            System.out.print(" ");
            letra++;
    }
    
    
}
}