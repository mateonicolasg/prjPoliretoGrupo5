import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre completo:");
        String nombreCompleto = sc.nextLine();

        System.out.println("Ingrese los porcentajes de carga separados por espacios:");
        String porcentajesCargaInput = sc.nextLine();
        String[] porcentajesCargaString = porcentajesCargaInput.split(" ");

        int[] porcentajesCarga = new int[porcentajesCargaString.length];
        for (int i = 0; i < porcentajesCargaString.length; i++) {
            porcentajesCarga[i] = Integer.parseInt(porcentajesCargaString[i]);
        }

        mostrarCargaPorPalabra(nombreCompleto, porcentajesCarga);
    }

    public static void mostrarCargaPorPalabra(String nombreCompleto, int[] porcentajesCarga) {
        String[] palabras = nombreCompleto.split("\\s+");

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            int porcentaje = porcentajesCarga[i];

            int longitud = palabra.length();
            int carga = (int) Math.ceil((porcentaje * longitud) / 100.0);

            String barraCarga = "[" + "=".repeat(carga) + ">".repeat(longitud - carga) + "] " + porcentaje + "% ";

            System.out.println(barraCarga + palabra.substring(0, carga));
        }
    }
}

