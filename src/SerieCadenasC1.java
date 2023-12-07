import java.util.Scanner;

public class SerieCadenasC1 {


    public void Frase1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una frase:");
        String frase = scanner.nextLine().toLowerCase(); // Convertir la frase a minúsculas para simplificar el conteo

        int contadorVocales = contarVocales(frase);

        System.out.println("La frase tiene " + contadorVocales + " vocales.");
    }

    public  int contarVocales(String frase) {
        int contador = 0;
        int vocalesA = 0, vocalesE = 0, vocalesI = 0, vocalesO = 0, vocalesU = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            switch (caracter) {
                case 'a':
                    vocalesA++;
                    contador++;
                    break;
                case 'e':
                    vocalesE++;
                    contador++;
                    break;
                case 'i':
                    vocalesI++;
                    contador++;
                    break;
                case 'o':
                    vocalesO++;
                    contador++;
                    break;
                case 'u':
                    vocalesU++;
                    contador++;
                    break;
                default:
                    // Ignorar otros caracteres
                    break;
            }
        }

        // Imprimir el contador de cada vocal
        System.out.println("Vocal A: " + vocalesA);
        System.out.println("Vocal E: " + vocalesE);
        System.out.println("Vocal I: " + vocalesI);
        System.out.println("Vocal O: " + vocalesO);
        System.out.println("Vocal U: " + vocalesU);

        return contador;
    }
}