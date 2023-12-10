import java.util.Collections;

/**
 * Crear los siguientes loadings
 * @author: CodeMasters
 * @version: 1.0
 */
public class Loadings {
    /**
     * <b>showLoading1</b> muestra la serie usando el ciclo for L01) Indicador de carga desde 0  a 100% usar los signos \|/-| para simular un movimiento rotacional de carga 0% hasta 100%   
     * showLoading1
     */
    public void showLoading1(){

        String charge[]={"|","/","-","\\","|"};
        for (int i = 1; i <= 100; i++) {
            System.out.print("\r"+charge[i%4]+" "+i+"%");
            try {Thread.sleep(150);}
            catch (InterruptedException ie) {}
        }
        System.out.println();
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
    /**
     * <b>showLoading2</b> muestra la serie usando el ciclo for L02) Pedir un caracter para la simular la carga y la logitud de la barra es de 20 caracteres   
     * showLoading2
     */
    public void showLoading2(){
        for (int i = 0; i <= 200; i = i + 20) {
            progressPercentage(i, 200);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
    /**
     * <b>showLoading3</b> muestra la serie usando el ciclo for L03) Pedir un caracter que se desplaza de izquierda a derecha en una la barra es de 20 caracteres 
     * showLoading3
     */
    public void showLoading3(){
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
    /**
     * <b>showLoading4</b> muestra la serie usando el ciclo for L04) Waiting que inicia en 0  a 100% usar los signos o0o para simular un movimiento de ida y vuelta en el mismo puesto 
     * showLoading4
     */
    public void showLoading4() {
        int retraso = 400; 
        String[] patron = {"0oo", "o0o", "oo0"};
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r"  +patron[i % patron.length] + " " + i + "%" ); 

            try {
                Thread.sleep(retraso); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * <b>showLoading5</b> muestra la serie usando el ciclo for L05) Crear una barra de 20 caracteres, la barra avanza cambiando la punta entre > - 
     * showLoading5
     */
    public void showLoading5() {
        int retraso = 100;
        String[] punta = {">", "-"};
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            int numIguales = i / 5;
            int numEspacios = 20 - numIguales;

            String barra = String.join("", Collections.nCopies(numIguales, "=")) +
                punta[i % punta.length] +
                String.join("", Collections.nCopies(numEspacios, " "));

            System.out.print("\r[" + barra + "] " + i + "%");

            try {
                Thread.sleep(retraso); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * <b>showLoading6</b> muestra la serie usando el ciclo for L06) Crear una barra es de 20 caracteres, la barra <=> se desplaza de izquierda a derecha 
     * showLoading6
     */
    public void showLoading6() {
        int retraso = 100;
        String barra = "<=>";
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            int posicionBarra = i / 5;
            int numEspaciosIzq = Math.min(posicionBarra, 20 - barra.length());
            int numEspaciosDer = 20 - numEspaciosIzq - barra.length();

            String carga = String.join("", Collections.nCopies(numEspaciosIzq, " ")) +
            barra +
            String.join("", Collections.nCopies(numEspaciosDer, " "));

            System.out.print("\r[" + carga + "] " + i + "%");

            try {
                Thread.sleep(retraso); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * <b>showLoading7</b> muestra la serie usando el ciclo for L07) Crear una barra es de 20 caracteres, la barra avanza cambiando la punta con movimiento rotacional signos \|/-| 
     * showLoading7
     */
    public void showLoading7() {
        int retraso = 100; 
        String[] puntero = {"\\", "|", "/", "-"};
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            int numIguales = i / 5;
            int numEspacios = 20 - numIguales;

            String barra = String.join("", Collections.nCopies(numIguales, "=")) +
                puntero[i % puntero.length] +
                String.join("", Collections.nCopies(numEspacios, " "));

            System.out.print("\r[" + barra + "] " + i + "%");

            try {
                Thread.sleep(retraso); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
