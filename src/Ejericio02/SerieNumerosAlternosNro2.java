package Ejericio02;

public class SerieNumerosAlternosNro2 {
    
    int NroIntervalo2;

    // Constructor
    public SerieNumerosAlternosNro2(int N) {
        this.NroIntervalo2 = N;
    }

    // Método para generar la serie
    public void generarSerie2() {
        int valor = 1; // Iniciar con el primer valor
        for (int i = 0; i < NroIntervalo2; i++) {
            System.out.print(valor + " ");
            if (i % 2 == 0) {
                valor += 2; // Si el índice es par, aumenta en 2
            } else {
                valor++; // Si el índice es impar, aumenta en 1
            }
        }
        // Salto de línea al final de la serie
        System.out.println();
    }
}
    

