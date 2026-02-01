package Lesson02_variables;

import java.util.Scanner;

public class Exercise {
        public static void main(String[] args) {

        // =========================
        // 1. VARIABLES
        // =========================
        String name = "Mario";      
        int age = 30;               
        boolean isProgrammer = true; 

        // =========================
        // 2. CONSTANTE
        // =========================
        final String LANGUAGE = "Java";

        // =========================
        // 3. VARIABLE CON var
        // =========================
        var message = "Hello Java";
        System.out.println("Mensaje inicial: " + message);

        message = "Bye bye Java";
        System.out.println("Mensaje final: " + message);

        // =========================
        // 4. MOSTRAR POR CONSOLA
        // =========================
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Programador: " + isProgrammer);
        System.out.println("Lenguaje: " + LANGUAGE);

        // =========================
        // 5. ENTRADA POR CONSOLA
        // =========================
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIntroduce tu nombre: ");
        name = sc.nextLine();

        System.out.print("Introduce tu edad: ");
        age = sc.nextInt();

        System.out.print("¿Eres programador? (true/false): ");
        isProgrammer = sc.nextBoolean();

        // =========================
        // MOSTRAR DATOS FINALES
        // =========================
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Programador: " + isProgrammer);
        System.out.println("Lenguaje: " + LANGUAGE);


        sc.close();
    }
}
