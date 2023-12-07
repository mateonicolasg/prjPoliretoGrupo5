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
        int num1=0,num2=1,num3;
        char letra='c';
        System.out.print("a "+"b ");
        for (int i = 1; i <= n; i++) {
            num3=num1+num2;
            for (int j = 0; j < num3; j++) {
                System.out.print(" "+letra);
            }
            letra++;
           num1=num2;
           num2=num3;
    }
    
    
}
}