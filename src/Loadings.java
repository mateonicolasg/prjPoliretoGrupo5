import java.util.Collections;

/**
 * Crear los siguientes loadings
 * @author: CodeMasters
 * @version: 1.0
 */
public class Loadings {
    /**
     * <b>showLoading1</b> muestra la serie usando el ciclo for L01) Indicador de carga desde 0  a 100% usar los signos \|/-| para simular un movimiento rotacional de carga 0% hasta 100% 
     * @author: Francisco Negrete  
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
    /**
     * <b>showLoading2</b> muestra la serie usando el ciclo for L02) Pedir un caracter para la simular la carga y la logitud de la barra es de 20 caracteres   
     * @author: Francisco Negrete
     * showLoading2
     */
    public void showLoading2(){
        int longitudBarra = 20;
        int porcentaje = 0;

        while (porcentaje <= 100) {
            System.out.print("[");
            for (int i = 0; i < longitudBarra; i++) {
                if (i < (porcentaje * longitudBarra / 100)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentaje + "%  ");

            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.print("\r");

            porcentaje++;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * <b>showLoading3</b> muestra la serie usando el ciclo for L03) Pedir un caracter que se desplaza de izquierda a derecha en una la barra es de 20 caracteres 
     * @author: Francisco Negrete
     * showLoading3
     */
    public void showLoading3(){
        int longitudBarra = 20;
        int porcentaje = 0;
        while (porcentaje <= 100) {
            System.out.print("[");
            for (int i = 0; i < longitudBarra; i++) {
                if (i == (porcentaje * longitudBarra / 100)) {
                    System.out.print("-");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentaje + "%");
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r");
            porcentaje++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * <b>showLoading4</b> muestra la serie usando el ciclo for L04) Waiting que inicia en 0  a 100% usar los signos o0o para simular un movimiento de ida y vuelta en el mismo puesto 
     * @author: Matheus Velasco
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
     * @author: Matheus Velasco
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
     * @author: Matheus Velasco
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
     * @author: Matheus Velasco
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
    /**
     * <b>showLoading10</b> muestra la serie usando el ciclo for L10) Desplazar la figura a la derecha y regresar
           \|||/
           (> <)       
        ooO-(_)-Ooo                                    
     * @author: David Unaucho
     * showLoading10
     */
    public void showLoading10() {
        moverFiguraDerecha();
        moverFiguraIzquierda();
    }

    public  void moverFiguraDerecha() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" "); // Imprimir espacios en blanco para desplazar a la derecha
            }
            System.out.println("\\|||/");
            try {
                Thread.sleep(200); // Retraso para visualizar el movimiento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public  void moverFiguraIzquierda() {
        for (int i = 10; i > 0; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print(" "); // Imprimir espacios en blanco para desplazar a la izquierda
            }
            System.out.println("(< >)");
            try {
                Thread.sleep(200); // Retraso para visualizar el movimiento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
