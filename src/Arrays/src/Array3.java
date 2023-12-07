public class Array3{

    int guion = 45; // Guion
    for (int i=12; i>0; i--){
        if(i==12){
            System.out.println(i + " |               n");
        }
        if(i==10){
            System.out.println(i+ " |            o");
        }
        if(i==8){
            System.out.println(i+ "  |         s");
        }
        if(i==6){
            System.out.println(i+ "  |      i");
        }
        if(i==4){
            System.out.println(i+ "  |   d");
        }
        if(i==2){
            System.out.println(i+ "  |e");
        }
        if(i % 2 !=0){
            if(i>9){
                System.out.println(i + " |");
            }
            else{
                System.out.println(i + "  |");
            }
        }
        
    }
    System.out.print("   ");
    for(int j=0; j<18; j++){
        System.out.print((char)guion);
    }
    System.out.println();
}