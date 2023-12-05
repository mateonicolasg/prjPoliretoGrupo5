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

    public void serieCaracteres9(){
        int numero1=0,numero2=1,numero3;
        for(int i=0;i<10;i++){
            numero3=numero1+numero2;
            System.out.print(" "+numero3);
            numero1=numero2;
            numero2=numero3;
        }
    }
    
    
}