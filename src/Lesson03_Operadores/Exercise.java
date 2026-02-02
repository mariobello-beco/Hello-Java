package Lesson03_Operadores;

public class Exercise {
    
   public static void main(String[] args) {

        // =========================
        // EJERCICIO 1
        // OPERADORES ARITMÉTICOS
        // =========================

        int a = 10;
        int b = 5;

        int sum = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int module = a % b;

        System.out.println("Suma: " + sum);
        System.out.println("Resta: " + subtraction);
        System.out.println("Multiplicación: " + multiplication);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + module);

        System.out.println("La suma de a y b es: " + sum);


        // =========================
        // EJERCICIO 2
        // OPERADORES RELACIONALES Y LÓGICOS
        // =========================

        int age = 18;
        boolean hasID = true;

        boolean isAdult = age >= 18;
        boolean canEnter = age >= 18 && hasID;

        System.out.println("¿Es mayor de edad?: " + isAdult);
        System.out.println("¿Cumple ambas condiciones?: " + canEnter);


        // =========================
        // EJERCICIO 3
        // OPERADOR TERNARIO
        // =========================

        int score = 6;

        String result = (score >= 5) ? "Aprobado" : "Suspenso";

        System.out.println("Nota: " + score);
        System.out.println("Resultado: " + result);


        // =========================
        // EJERCICIO 4
        // OPERADOR DE INCREMENTO
        // =========================

        int contador = 0;

        contador++;
        contador++;
        contador++;

        System.out.println("Valor final del contador: " + contador);
    } 
}
