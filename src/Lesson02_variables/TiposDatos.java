package Lesson02_Variables;

import java.util.ArrayList;
import java.util.Scanner;

public class TiposDatos {

    public static void main(String[] args) {

        // =========================
        // TIPOS DE DATOS PRIMITIVOS
        // =========================

        byte level = 3;
        short year = 2026;
        int number = 1;
        long population = 8000000000L;

        float temperature = 18.5f;
        double basePrice = 19.99;

        char grade = 'A';
        boolean isProgrammer = true;

        System.out.println(level); // 3
        System.out.println(year); // 2026
        System.out.println(number); // 1
        System.out.println(population); // 800000000
        System.out.println(temperature); // 18.5
        System.out.println(basePrice); // 19.99
        System.out.println(grade); // A
        System.out.println(isProgrammer); // true

        // =========================
        // TIPOS DE DATOS DE REFERENCIA
        // =========================

        String name = "Java";

        int[] numbers = {1, 2, 3};

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        System.out.println(name); // Java
        System.out.println(numbers[0]); // 1
        System.out.println(list); // [Java, Python]

        // =========================
        // SALIDA POR CONSOLA
        // =========================

        System.out.print("Hola ");
        System.out.print("Java\n"); // Hola Java

        System.out.println("Hola"); // Hola
        System.out.println("Java"); // Java

        int fixedAge = 20;
        System.out.printf("Tengo %d años%n", fixedAge); // Tengo 20 años

        //System.err.println("Error: dato incorrecto");


        // =========================
        // ENTRADA POR CONSOLA
        // =========================

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String userName = sc.nextLine();

        System.out.print("Introduce tu edad: ");
        int userAge = sc.nextInt();

        System.out.print("Introduce el precio: ");
        double userPrice = sc.nextDouble();

        System.out.print("¿Eres programador? (true/false): ");
        boolean programmer = sc.nextBoolean();

        // Mostrar datos introducidos

        System.out.println("Nombre: " + userName);
        System.out.println("Edad: " + userAge);
        System.out.println("Precio: " + userPrice);
        System.out.println("Programador: " + programmer);

        sc.close();
    }
}
