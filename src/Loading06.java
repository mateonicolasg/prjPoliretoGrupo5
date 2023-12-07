import java.util.Collections;

public class Loading06 {
    public void loading06() {
        int retraso = 100;
        String barra = "<=>";

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
}
