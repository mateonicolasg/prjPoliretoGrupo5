import java.util.Collections;

public class Loading07 {
    public void loading07() {
        int retraso = 100; 
        String[] puntero = {"\\", "|", "/", "-"};

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
