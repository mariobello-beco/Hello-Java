package Lesson04_CadenasTexto;

import java.util.Scanner;

public class Exercise {
    
    public static void main(String[] args) {
         // =========================
        // EJERCICIO 1
        // CREAR Y MOSTRAR STRINGS
        // =========================

        String name = "Mario";
        String language = "Java";

        System.out.println("Nombre: " + name);
        System.out.println("Lenguaje: " + language);
        System.out.println("Longitud nombre: " + name.length());
        System.out.println("Longitud lenguaje: " + language.length());


        // =========================
        // EJERCICIO 2
        // CONCATENACIÓN DE STRINGS
        // =========================

        String message = "Hola, me llamo " + name + " y estoy aprendiendo " + language;
        System.out.println(message);


        // =========================
        // EJERCICIO 3
        // COMPARACIÓN DE STRINGS
        // =========================

        String text1 = "Java";
        String text2 = new String("Java");

        boolean comparisonReference = (text1 == text2);
        boolean comparisonContent = text1.equals(text2);

        System.out.println("Comparación con == : " + comparisonReference);
        System.out.println("Comparación con equals(): " + comparisonContent);


        // =========================
        // EJERCICIO 4
        // MÉTODOS BÁSICOS DE STRING
        // =========================

        String text = "Java desde cero";

        int length = text.length();
        char letter = text.charAt(2);
        String upperText = text.toUpperCase();
        String lowerText = text.toLowerCase();

        System.out.println("Texto original: " + text);
        System.out.println("Longitud: " + length);
        System.out.println("Carácter en posición 2: " + letter);
        System.out.println("Mayúsculas: " + upperText);
        System.out.println("Minúsculas: " + lowerText);


        // =========================
        // EJERCICIO 5
        // MANIPULACIÓN DE TEXTO
        // =========================

        String messageWithSpaces = "  Aprendiendo Java  ";

        String trimmedText = messageWithSpaces.trim();
        String replacedText = trimmedText.replace('a', 'A');
        String[] words = trimmedText.split(" ");

        System.out.println("Texto original: '" + messageWithSpaces + "'");
        System.out.println("Sin espacios: '" + trimmedText + "'");
        System.out.println("Texto reemplazado: " + replacedText);
        System.out.println("Palabras separadas:");

        for (String word : words) {
            System.out.println("- " + word);
        }


        // =========================
        // EJERCICIO 6
        // COMPROBACIÓN DE TEXTO
        // =========================

        String emptyText = "";

        boolean isEmpty = emptyText.isEmpty();
        int emptyLength = emptyText.length();

        System.out.println("¿Está vacía?: " + isEmpty);
        System.out.println("Longitud: " + emptyLength);


        // =========================
        // EJERCICIO 7
        // EJERCICIO FINAL INTEGRADOR
        // =========================

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String userText = sc.nextLine();

        int userTextLength = userText.length();
        String userTextUpper = userText.toUpperCase();
        boolean containsJava = userText.contains("Java");

        System.out.println("Longitud de la frase: " + userTextLength);
        System.out.println("Frase en mayúsculas: " + userTextUpper);
        System.out.println("¿Contiene la palabra 'Java'?: " + containsJava);

        String[] userWords = userText.split(" ");
        System.out.println("Palabras de la frase:");

        for (String word : userWords) {
            System.out.println("- " + word);
        }

        sc.close();
    }
}
