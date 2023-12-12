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

    public void presentarBarra(int progreso, int total){
        int anchoBarra=20;
        float ubicacionCaracter=(float)progreso/total;
        int barraProgreso=(int)(anchoBarra*ubicacionCaracter);
        System.out.print("[");
        for (int i = 0; i < anchoBarra; i++) {
            if (i<barraProgreso) {
                System.out.print("#");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.printf("] %3d%%\r",(ubicacionCaracter*100));
        System.out.flush();
    }
    public static void progressPercentage(int remain, int total) {
        if (remain > total) {
            throw new IllegalArgumentException();
        }
        int maxBareSize = 10; 
        int remainProcent = ((100 * remain) / total) / maxBareSize;
        char defaultChar = '-';
        String icon = "*";
        String bare = new String(new char[maxBareSize]).replace('\0', defaultChar) + "]";
        StringBuilder bareDone = new StringBuilder();
        bareDone.append("[");
        for (int i = 0; i < remainProcent; i++) {
            bareDone.append(icon);
        }
        String bareRemain = bare.substring(remainProcent, bare.length());
        System.out.print("\r" + bareDone + bareRemain + " " + remainProcent * 10 + "%");
        if (remain == total) {
            System.out.print("\n");
        }
    }
    public void L02(){
        for (int i = 0; i <= 200; i = i + 20) {
            progressPercentage(i, 200);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    
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
    
       

