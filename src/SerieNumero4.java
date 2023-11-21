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

        
        public void TorresSerie4For(int numSerie){
            int numerador1=0,numerador2=1,denominadorpar=4;
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
                            int numarador3=numerador1+numerador2;
                            denominadorpar+=2;
                            System.out.print(numarador3+"/"+denominadorpar+" ");
                            numerador1=numerador2;
                            numerador2=numarador3;
                    }
                break;
            }
        }
        public void TorresSerie4while(int numSerie){

            int numerador1=0,numerador2=1,denominadorpar=4;
            switch(numSerie){
                case 1:
                        System.out.print("0/2 ");
                break;
                case 2:
                        System.out.print("0/2 "+"1/4 ");
                break;
                default:
                System.out.print("0/2 "+"1/4 ");
                    int i=0;
                    while (i++<numSerie-2) {
                        int numarador3=numerador1+numerador2;
                            denominadorpar+=2;
                            System.out.print(numarador3+"/"+denominadorpar+" ");
                            numerador1=numerador2;
                            numerador2=numarador3;
                    }
                break;
            }
        }
        public void TorresSerie4Dowhile(int numSerie){

            int numerador1=0,numerador2=1,denominadorpar=4;
            switch(numSerie){
                case 1:
                        System.out.print("0/2 ");
                break;
                case 2:
                        System.out.print("0/2 "+"1/4 ");
                break;
                default:
                System.out.print("0/2 "+"1/4 ");
                    int i=0;
                    do {
                        int numarador3=numerador1+numerador2;
                            denominadorpar+=2;
                            System.out.print(numarador3+"/"+denominadorpar+" ");
                            numerador1=numerador2;
                            numerador2=numarador3;
                    } while (++i<numSerie-2);
                break;
            }
        }
            
    }
    
    
        