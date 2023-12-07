public class Figura7 {
    
    int limiteEspacio = 0;
    int barraEspaciadora = 32; // espacio
    int barraVertical = 124; // Barra vertical
    int guion = 45; // Guion


    for(int i=1; i<10; i++){
        if(i % 2 != 0){
            for(int k=0; k<limiteEspacio; k++){               // Permite 
                System.out.print((char)barraEspaciadora);    // dar saltos  
            }                                                 // de espacios
            for(int j=0; j<3; j++){
                System.out.print((char)guion);
            }
            System.out.println();
            limiteEspacio+=2;
        }
        else{
            for(int k=0; k<limiteEspacio; k++){               // Permite 
                System.out.print((char)barraEspaciadora);    // dar saltos  
            }                                                 // de espacios
            System.out.println((char)barraVertical);
            limiteEspacio+=1;
        }
    }
    
}
