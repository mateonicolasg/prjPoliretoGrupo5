public class SerieCaracteres8 {
    
    int codigoA = 97;
        for(int j=1; j<10; j+=2){
            
            for (int i = 0; i < j; i++) {
                System.out.print((char)codigoA);
            }
            System.out.print(" ");
            codigoA++;
        }
}
