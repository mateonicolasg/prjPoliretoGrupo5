public class delays {

    public void L01(){

        String charge[]={"|","/","-","\\","|"};
        for (int i = 1; i <= 100; i++) {
            System.out.print("\r"+charge[i%4]+" "+i+"%");
            try {Thread.sleep(150);}
            catch (InterruptedException ie) {}
        }
        System.out.println();
    }

    
    public void L02(){
        System.err.println();
        char caracterCarga='#';
        for (int i = 1; i <= 101; i++) {
           if (i==1) {
                System.out.print("[");
           } 
           else if (i%5==0) {
               System.out.print(caracterCarga);
           } 
           else if (i==101) {
                System.out.print("]");
           }
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

           
            System.out.println();
    }
    public void L03(){
        System.out.println();
        char caracterDesplazamiento='-';
        System.out.print("Progreso de carga: [");

        for (int i = 1; i <= 20; i++) {
            System.out.print(" ");
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(caracterDesplazamiento + "\b"); 
        }

        System.out.println("] 100%");
    }
    
       
}
