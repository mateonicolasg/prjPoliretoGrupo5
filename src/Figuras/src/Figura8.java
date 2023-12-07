public class Figura8 {
    
    int barraEspaciadora = 32; // espacio
    int barraVertical = 124; // Barra vertical
    int guion = 45; // Guion
    
    int m=15, i = 1;
    while(m>=0){
        for(int n=m; n>0; n--){
            System.out.print((char)barraEspaciadora);
        }
        // System.out.println("aqui");
        
        if(i % 2 != 0){
            for(int j=0; j<3; j++){
                System.out.print((char)guion);
            }
            System.out.println();
            m-=1;
        }
        else{
            System.out.println((char)barraVertical);
            m-=2;
        }
        i++;
    }
}
