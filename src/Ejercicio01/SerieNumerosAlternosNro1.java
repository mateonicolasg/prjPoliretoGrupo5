package Ejercicio01;
public class SerieNumerosAlternosNro1 {

    int NroIntervalo;
    int termino1;
    int termino2;
    int termino3;

    // Constructor
    public SerieNumerosAlternosNro1(int N) {
        this.NroIntervalo = N;
        this.termino1 = 0;
        this.termino2 = 1;
        this.termino3 = termino1 + termino2;
    }

    // Método para generar la serie
    public void UnauchogenerarSerie() {
        for (int i = 1; i <= NroIntervalo; ++i) {
            if (i == 1) {
                System.out.print(termino1 + " ");
                continue;
            }
            if (i == 2) {
                System.out.print(termino2 + " ");
                continue;
            }
    
            termino3 = termino2 + termino1;
            termino1 = termino2;
            termino2 = termino3;
            System.out.print(termino3 + " ");
        }
        // Salto de línea al final de la serie
        System.out.println();
    
        }
    }

