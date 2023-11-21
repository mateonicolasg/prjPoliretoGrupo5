/*Copyright (C) 2K23, Francisco Torres
 * (Nombre grupo), francisco.torres@epn.edu.ec
 * Version 1.0
 */

 /**
  * Crea la siguiente serie:  0/2  1/4  1/6  2/8  3/10  5/12  8/14  13/16 ...
  * @author Francisco Torres
  * @version 1.0
  */
  public class SerieNumero4{

        
        public void TorresSerie4(int numSerie){
            int n1=0,n2=1,temp=4;
            switch(numSerie){
                case 1:
                        System.out.print("0/2 ");
                break;
                case 2:
                        System.out.print("0/2 "+"1/4 ");
                break;
                default:
                System.out.print("0/2 "+"1/4 ");
                    for(int i=0;i<numSerie-2;i++){
                            int n3=n1+n2;
                            temp+=2;
                            System.out.print(n3+"/"+temp+" ");
                            n1=n2;
                            n2=n3;
                    }
                break;
            }
                

            

        }
  }