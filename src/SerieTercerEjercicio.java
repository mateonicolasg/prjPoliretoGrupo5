/*
 * (NombreEquipo), german.vanegas@epn.edu.ec
 * Version 1.0
 */
/**
 * Crear la siguiente serie: 0/1 1/3 1/5 2/7 3/9 5/11 8/13 13/15 ...
 * 
 * @author German Vanegas
 * @version 1.0
 * 
 */
public class SerieTercerEjercicio {
    private int[] numeradores;
    private int[] denominadores;

    public void generarSerie(int numeroTerminos) {

        numeradores = new int[numeroTerminos];
        denominadores = new int[numeroTerminos];

        numeradores[0] = 0;
        numeradores[1] = 1;
        denominadores[0] = 1;
        denominadores[1] = 3;
        for (int i = 2; i < numeroTerminos; i++) {
            numeradores[i] = numeradores[i - 1] + numeradores[i - 2];
            denominadores[i] = denominadores[i - 1] + 2;
        }
    }

    public void mostrarSerie() {
        System.out.println("La serie es: ");

        for (int i = 0; i < numeradores.length; i++) {
            System.out.print(numeradores[i] + "/" + denominadores[i] + "  ");
        }
    }

}
