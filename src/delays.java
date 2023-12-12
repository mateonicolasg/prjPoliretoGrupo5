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

    
    public static void progressPercentage(int remain, int total, int barSize) {
        if (remain > total || barSize <= 0) {
            throw new IllegalArgumentException("Invalid arguments");
        }

        int maxBarSize = barSize;
        int remainProcent = ((100 * remain) / total) / (100 / maxBarSize);
        char defaultChar = ' ';
        String icon = "*";
        String bare = new String(new char[maxBarSize]).replace('\0', defaultChar) + "]";
        StringBuilder bareDone = new StringBuilder();
        bareDone.append("[");
        
        for (int i = 0; i < remainProcent; i++) {
            bareDone.append(icon);
        }
        
        String bareRemain = bare.substring(remainProcent, bare.length());
        System.out.print("\r" + bareDone + bareRemain + " " + remainProcent * (100 / maxBarSize) + "%");
        
        if (remain == total) {
            System.out.print("\n");
        }
    }

    public void L02(){
        int total = 200;
        int barSize = 20;

        for (int i = 0; i <= total; i = i + 20) {
            progressPercentage(i, total, barSize);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
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
    
       

