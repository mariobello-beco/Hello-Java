package Lesson02_variables;

public class Variables {

    static int total = 0; // Variable estática (de clase)
    String value;         // Variable de instancia

    public static void main(String[] args) {

        // ==================
        // Variables locales
        // ==================

        String name;
        int year;
        boolean programmer;

        // Inicialización
        name = "Java";
        year = 2026;
        programmer = true;

        // Declaración e inicialización
        String city = "Madrid";

        // Declaración e inicialización de variables en una misma línea
        int number0 = 0, number1 = 1, number2 = 2, number3 = 3;

        // Uso de variable estática
        total++;

        // Crear objeto para usar variable de instancia
        Variables obj = new Variables();
        obj.value = "Variable de instancia";

        // Salida por pantalla
        System.out.println("Hello World"); // Hello Word
        System.out.println(name); // Java
        System.out.println(year); // 2026
        System.out.println(programmer); // true
        System.out.println(city); // Madrid
        System.out.println(total);// 1
        System.out.println(obj.value); // Variable de instancia

        // Concatenación
        System.out.println("Números: " + number0 + ", " + number1 + ", " + number2); // Números: 0, 1, 2
    }
}
