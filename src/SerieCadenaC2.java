import java.util.Scanner;

public class SerieCadenaC2 {


    public  void Frase2(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una frase:");
        String frase = scanner.nextLine();

        int contadorLetras = contarLetras(frase);

        System.out.println("La frase tiene " + contadorLetras + " letras.");
    }

    public  int contarLetras(String frase) {
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (Character.isLetter(caracter)) {
                contador++;
            }
        }

        return contador;
    }
}