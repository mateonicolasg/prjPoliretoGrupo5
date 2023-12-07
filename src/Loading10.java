
 public class Loading10 {
 
 
 public void LoadingU() {
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