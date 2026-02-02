
# Variables en Java

<p align="center">
  <img 
    src="../../img/Variables_Java.png" 
    width="900" 
    alt="Variables en Java">
  <br>
  <em>Curso Java desde O</em>
</p>

En Java, una **variable** es un espacio de memoria donde se almacena un dato cuyo valor puede cambiar durante la ejecución del programa.

## Buenas prácticas para nombrar variables en Java

- Usar camelCase: empezar en minúscula y cada palabra nueva con mayúscula.
- Nombres descriptivos: que indiquen qué almacena la variable.
- Evitar nombres excesivamente largos: claros, pero sin frases completas.
- No usar caracteres especiales ni acentos: evita problemas y mejora la compatibilidad.
- Evitar nombres de una sola letra: salvo contadores (i, j, k) en bucles.
- No contener espacios en blanco.
- No usar palabras reservadas: como int, class, public.

Buenas prácticas
```Java

int userAge;
double totalPrice;
String fullName;
boolean isActive;
int counter;

```
Malas prácticas
```Java

int UserAge;          
double total_price;   
String n;             
boolean is_valid;   
int usersThatLoggedInTodayInTheSystemCounter; 


```

## Declaración variables en Java

En Java, **declarar** una variable significa indicar su **tipo** y su **nombre**.  

Java es un lenguaje **fuertemente tipado**, por lo que siempre es obligatorio indicar el tipo de dato.

```Java
tipo nombreVariable; 

```

## Iniciación variables en Java 
**Inicializar** una variable significa asignarle un **valor inicial**.


```Java
nombreVariables = valor;
tipo nombreVariable = valor;

``` 
## Declara variables en Java

- Declaración individual.
- Declaración en una sola línea.
- Declaración de un valor para múltiples variables.

```Java
String name= "Java";

int numberOne = 1, numberTwo = 2, numberThree = 3;

int a, b, c;
a = b = c = 10;

```

# Tipos de datos en  Java
En Java, los tipos de datos indican qué tipo de valor puede almacenar una variable y cuánta memoria ocupa.
Java es un lenguaje fuertemente tipado, lo que significa que cada variable debe tener un tipo definido.

Los tipos de datos se dividen en primitivos y de referencia.

## Tipos de datos primitivos

Los tipos primitivos almacenan el valor directamente en memoria. Java dispone de 8 tipos primitivos.

| Tipo      | Descripción |
|-----------|-------------|
| `byte`    | Entero muy pequeño, útil para ahorrar memoria |
| `short`   | Entero corto, poco utilizado en aplicaciones modernas |
| `int`     | Entero más común y utilizado en Java |
| `long`    | Entero largo para valores muy grandes |
| `float`   | Número decimal con menor precisión |
| `double`  | Número decimal con mayor precisión (recomendado) |
| `char`    | Un único carácter Unicode |
| `boolean` | Valor lógico: verdadero o falso |

```Java
byte level = 3;

short year = 2026;

int score = 100;

long population = 8000000000L;

float temperature = 18.5f;

double total = 19.99;

char grade = 'A';

boolean isAvailable = true;

```
## Tipos de datos de referencia

Los tipos de referencia no almacenan el valor directamente, sino una referencia a un objeto en memoria.

| Tipo de referencia | Descripción |
|-------------------|-------------|
| `String`          | Cadena de texto. Representa una secuencia de caracteres y es inmutable |
| Arrays (`int[]`, `String[]`) | Almacenan un conjunto de elementos del mismo tipo |
| `Clases`            | Representan entidades mediante atributos y métodos |
| `Clases propias`    | Clases creadas por el programador para modelar objetos del programa |
| `Scanner`         | Clase para leer datos de entrada desde teclado o archivos |
| `ArrayList`       | Lista dinámica que permite añadir y eliminar elementos |
| `Interfaces`        | Definen un conjunto de métodos que deben ser implementados por una clase |
| `Enums`             | Representan un conjunto finito y fijo de valores constantes |

```Java
String name = "Java";

int[] numbers = {1, 2, 3};

class User {
    String username;
}

Scanner scanner = new Scanner(System.in);

ArrayList<String> list = new ArrayList<>();

interface Drawable {
    void draw();
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}

```

> En Java, los tipos de datos primitivos se pasan por valor.  
> Los objetos se pasan por valor de la referencia, lo que significa que se copia la referencia al objeto, no el objeto en sí.

# Como usar variables en Java
- `Asignar valores: `Una vez definida una variable, se puede asignar un valor a ella usando el signo igual (=).
```Java

String name= "Java";
```
- `Utilizar valores:` Una vez asignado un valor a una variable, se puede usar ese valor en una expresión o en una sentencia.
 ```Java
String name ="Java";
System.out.println(name) 
```
- `Modificar valores:` Una vez asignado un valor a una variable, se puede modificar ese valor en cualquier momento, utilizando operadores aritméticos o asignando un nuevo valor.
```Java
String name = "Java";
name = " Hello Java";
```

# Tipos de variables 
En Java, las variables se clasifican según dónde se declaran y cuánto tiempo existen durante la ejecución del programa.

## Variables locales

Las variables locales se declaran dentro de un método, constructor o bloque de código (if, for, while, etc.).

Características

- Solo existen dentro del bloque donde se declaran.
- No tienen valor por defecto, deben inicializarse antes de usarse.
- Se eliminan cuando termina la ejecución del método o bloque.
- Ideales para datos temporales.


```Java
public class Locale {

    public static void main(String[] args) {
        int numero = 10;   // Variable local
        System.out.println("Número: " + numero);
    }
}

```

## Variables de instancia

Las variables de instancia se declaran dentro de una clase, pero fuera de cualquier método.

Características

- Cada objeto tiene su propia copia.
- Permanecen mientras el objeto exista.
- Tienen valores por defecto si no se inicializan.
- Representan el estado del objeto.


| Tipo    | Valor por defecto |
|---------|-------------------|
| int     | 0                 |
| double  | 0.0               |
| boolean | false             |
| String  | null              |

```Java
public class Instancia {

    String nombre; // variable de instancia

    public static void main(String[] args) {
        Instancia p = new Instancia();
        p.nombre = "Mario";
        System.out.println(p.nombre);
    }
}

```

## Variables estáticas

Las variables estáticas se declaran con la palabra clave static y pertenecen a la clase, no a los objetos.

Características

- Existe una sola copia para toda la clase.
- Son compartidas por todos los objetos.
- Se pueden usar sin crear un objeto.
- Ideales para constantes o contadores globales.

```Java
public class Estatica {

    static int numero = 0; // variable estática

    public static void main(String[] args) {
        numero++;
        System.out.println(numero);
    }
}

```

# Variables con var en Java
## Uso de `var` en Java

La palabra clave `var` permite que el **compilador infiera automáticamente el tipo de dato** de una variable a partir del valor que se le asigna.

`var` **no convierte a Java en un lenguaje dinámico**: el tipo se determina en **tiempo de compilación** y no puede cambiar después.

> Disponible a partir de **Java 10**.

```Java
var message = "Hello Java"; // String
var year = 2026;            // int
var price = 19.99;          // double
```

## Buenas practicas para declarar variables con var en Java
- Solo puede usarse en variables locales.
- La variable debe inicializarse en la misma línea.
- No puede usarse en:

    - Atributos de clase
    - Parámetros de métodos
    - Valores de retorno

- No puede inicializarse con null.

```Java
var value;          // Error: debe inicializarse
var x = null;       // Error: tipo nulo

class User {
    var age = 30;   // Error: no se permite en atributos
}

```
# Constantes en Java

En Java, una constante es un valor que se asigna a una variable y no cambia durante la ejecución del programa. El valor de una constante se establece en el momento en que se declara y no puede cambiarse posteriormente.

Las constantes son útiles para almacenar valores que se utilizan repetidamente en el código y que no deben ser modificados.

```Java
final tipo nombre = valor;
```
## Declaración e iniciación de una constante en Java

En Java, se pueden declarar constantes utilizando la palabra clave `final`. Al declarar una variable como final, estamos indicando que su valor no cambiará a lo largo del programa. Para declararla en java usaremos mayúsculas, para diferenciar de las variables.

```Java
final String NAME = "Java";
```
## Errores comunes en variables en Java

- **Pensar que una variable puede cambiar de tipo de dato**  
  En Java, una variable **no puede cambiar su tipo**, solo puede cambiar su **valor** una vez declarada.
```java
  int number = 10;
  number = "ten"; // Error: no se puede asignar un String a un int
```

- **Confundir variables con constantes**  
  Las constantes se declaran con la palabra clave `final` y **no pueden cambiar de valor** después de su inicialización.
```Java
  final int MAX_USERS = 100;
  MAX_USERS = 200; // Error de compilación
```
- **Usar una variable local sin inicializar**  
  Las variables locales **no tienen valores por defecto** y deben inicializarse antes de ser utilizadas.
```Java
    int total;
    System.out.println(total); // Error: variable no inicializada
```
- **Creer que Java inicializa todas las variables automáticamente**  
  Java solo asigna valores por defecto a **variables de instancia** y **variables estáticas**, no a las locales.
```Java
  public static void main(String[] args) {
    int count;
    // System.out.println(count); // Error
    }
```
- **Usar mayúsculas en nombres de variables**  
  En Java, los nombres de variables deben comenzar en **minúscula** siguiendo la convención **camelCase**.  
  Los identificadores que empiezan por mayúscula se reservan para clases.
```Java
  int Age = 30; // Parece el nombre de una clase
  ```
## Salida de datos en Java

La **salida de datos** permite mostrar información al usuario durante la ejecución del programa.  
En Java, se realiza principalmente a través de la clase `System`, que proporciona distintos flujos de salida.


### `System.out.print()`

Muestra un texto o valor por pantalla **sin realizar un salto de línea** al final.  
Es útil cuando se desea continuar escribiendo en la misma línea.

```Java
  public static void main(String[] args) {
        System.out.print("Hola ");
        System.out.print("Java");
    }
```

```Text
Hola Java

```

### `System.out.println()`

Muestra un texto o valor por pantalla y añade un salto de línea automáticamente.
Es el método más utilizado para mostrar información de forma clara.

```Java
  public static void main(String[] args) {
        System.out.println("Hola");
        System.out.println("Java");
  }
```

```Text
Hola
Java

```

### `System.out.printf()`

Permite mostrar información con formato, similar a otros lenguajes como C.
Es especialmente útil para controlar el número de decimales o el formato del texto.

```Java
public static void main(String[] args) {
        int edad = 12;
        System.out.printf("Tengo %d años", edad);
    }
```

```Text
  Tengo 12 años

```
### `System.err.println()`

Se utiliza para mostrar mensajes de error o advertencias.
Aunque se visualiza en la consola, se trata de un flujo diferente al de salida estándar.

```Java
 public static void main(String[] args) {
        System.err.println("Error: dato incorrecto");
    }
```
```Text
Error: dato incorrecto

```
## Entrada de datos en Java

La entrada de datos permite al programa recibir información introducida por el usuario, normalmente desde el teclado.

En Java, la forma más sencilla y común de leer datos es mediante la clase Scanner, que trabaja junto a System.in.

### `Scanner con System.in`

System.in representa la entrada estándar del sistema (teclado).
La clase Scanner interpreta esos datos y los convierte al tipo correspondiente.
```Java
Scanner sc = new Scanner(System.in);

```
```Java
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name);
    }
}

```
### nextLine()

Lee una línea completa de texto, incluyendo espacios.
Se utiliza principalmente para leer cadenas (String).

```Java
System.out.print("Enter your name: ");
String name = sc.nextLine();
```


### nextInt()

Lee un número entero introducido por el usuario.
No consume el salto de línea final.

```Java
System.out.print("Enter your age: ");
int age = sc.nextInt();
```


### nextDouble()

Lee un número decimal (double) introducido por el usuario.

```Java
System.out.print("Enter the price: ");
double price = sc.nextDouble();
```


### nextBoolean()

Lee un valor lógico (true o false) introducido por el usuario.
```Java 
System.out.print("Are you active? ");
boolean active = sc.nextBoolean();
```


### Limpieza del buffer con nextLine()

Después de usar métodos como nextInt() o nextDouble(), puede quedar un salto de línea pendiente en el buffer.
Para evitar errores al leer texto, se debe limpiar el buffer.

```Java
Scanner sc = new Scanner(System.in);

System.out.print("Enter your age: ");
int age = sc.nextInt();

sc.nextLine(); // Consume el salto de línea pendiente

System.out.print("Enter your name: ");
String name = sc.nextLine();

System.out.println("Name: " + name);
System.out.println("Age: " + age);

```

# Resumen
En esta lección hemos aprendido qué son las variables en Java y cómo se utilizan para almacenar, modificar y trabajar con datos durante la ejecución de un programa. Una variable es un espacio de memoria al que se le asigna un tipo, un nombre y un valor, permitiendo reutilizar la información a lo largo del código.

✅ Variables en Java

Las variables en Java deben declararse indicando su tipo de dato antes de usarse.
Java es un lenguaje fuertemente tipado, lo que garantiza mayor control y seguridad en tiempo de compilación.

✅ Tipado estático

Java utiliza tipado estático, lo que significa que una variable no puede cambiar de tipo una vez declarada.
Esto reduce errores y mejora la robustez del programa.

✅ Tipos de datos

Java dispone de dos grandes grupos de tipos de datos:
Primitivos (int, double, boolean, char, etc.)
De referencia (String, arrays, clases, interfaces, listas, enums…)
Estos tipos permiten representar y manejar información de forma eficiente.

✅ Declaración e inicialización

Una variable puede declararse e inicializarse en una sola línea o en pasos separados.
También es posible declarar múltiples variables en una misma sentencia.

✅ Tipos de variables

Según su ámbito y tiempo de vida, las variables pueden ser:
Locales: existen solo dentro de un método o bloque.
De instancia: pertenecen a cada objeto creado.
Estáticas: pertenecen a la clase y son compartidas por todos los objetos.

✅ Uso de var

La palabra clave var permite al compilador inferir el tipo de dato automáticamente, manteniendo el tipado estático.
Solo puede utilizarse en variables locales y debe inicializarse en la misma línea.

✅ Constantes en Java

Las constantes se declaran usando la palabra clave final.
Una vez asignado su valor, no puede modificarse, lo que garantiza estabilidad y claridad en el código.

✅ Entrada y salida de datos

La salida de datos se realiza principalmente con System.out y System.err.
La entrada de datos se gestiona mediante la clase Scanner junto a System.in.
Estas herramientas permiten crear programas interactivos.

✅ Errores comunes

Conocer errores habituales ayuda a interpretar errores de compilación y a mejorar la calidad del código.

Errores mas comunes:
- Usar variables sin inicializar,
- Confundir variables con constantes,
- Intentar cambiar el tipo de una variable,

# Ejercicio variables en Java

## Variables

Crea las siguientes variables:

- Una variable con tu nombre
- Una variable con tu edad
- Una variable que indique si eres o no programador
- Usa el tipo de dato más adecuado para cada caso.

## Constante

Crea una constante que almacene el lenguaje de programación que estás aprendiendo.

## Variable con var

Crea una variable usando la palabra clave var que almacene un mensaje inicial.
Después, cambia el valor de esa variable por otro mensaje de despedida.

## Mostrar por consola

Muestra por consola:

- El nombre
- La edad
- Si eres programador
- El lenguaje que estás aprendiendo
- El valor inicial y final de la variable creada con var

## Entrada por consola

Modifica el programa para que:

- El nombre se introduzca por teclado
- La edad se introduzca por teclado
- Si eres programador se introduzca por teclado
- Vuelve a mostrar todos los datos por consola.

# Enlaces lección

[Fichero Java Variables](https://github.com/mariobello-beco/Hello-Java/blob/main/src/Lesson02_Variables/Variables.java)

[Fichero Java Tipo datos](https://github.com/mariobello-beco/Hello-Java/blob/main/src/Lesson02_Variables/TiposDatos.java)

[Ejercicios Variables](https://github.com/mariobello-beco/Hello-Java/blob/main/src/Lesson02_variables/Exercise.java)
