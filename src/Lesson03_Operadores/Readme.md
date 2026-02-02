# Operadores en Java
<p align="center">
  <img 
    src="../../img/Operadores_Java.png" 
    width="900" 
    alt="Operadores en Java">
  <br>
  <em>Curso Java desde O</em>
</p>

Los `operadores` en Java permiten realizar operaciones sobre variables y valores, como cálculos matemáticos, comparaciones o decisiones lógicas.

Son una parte fundamental del lenguaje y se usan constantemente en cualquier programa.

## Qué es un operador en Java
Un `operador` es un símbolo especial que indica al compilador que debe realizar una operación concreta.

## Tipos de operadores en Java
Java dispone de los siguientes grupos de operadores:

- Operadores aritméticos
- Operadores de asignación
- Operadores de comparación (relacionales)
- Operadores lógicos
- Operadores ternarios
- Operadores bit a bit

## Operadores aritméticos en Java
En Java, los `operadores aritméticos` se utilizan para realizar operaciones matemáticas básicas entre valores numéricos, como sumas, restas, multiplicaciones o divisiones.

Estos operadores trabajan principalmente con tipos de datos numéricos (int, double, float, long, etc.) y devuelven un resultado que puede almacenarse en una variable o mostrarse por consola.

| Operador | Nombre | Descripción |
|----------|--------|-------------|
| `+` | Suma | Suma dos valores |
| `-` | Resta | Resta un valor a otro |
| `*` | Multiplicación | Multiplica dos valores |
| `/` | División | Divide un valor entre otro |
| `%` | Módulo | Devuelve el resto de una división |
| `++` | Incremento | Incrementa el valor en una unidad |
| `--` | Decremento | Decrementa el valor en una unidad |

```Java
 int a = 10;
 int b = 3;

        // Suma
        int suma = a + b;
        System.out.println("Suma: " + suma); 

        // Resta
        int resta = a - b;
        System.out.println("Resta: " + resta); 

        // Multiplicación
        int multiplicacion = a * b;
        System.out.println("Multiplicación: " + multiplicacion); 

        // División
        int division = a / b;
        System.out.println("División: " + division); 

        // Módulo
        int modulo = a % b;
        System.out.println("Módulo: " + modulo); 

        // Asignar resultado a variable
        int sum = a + b;
        System.out.println("Asignación a variable: " + sum);
```

```Text
Suma: 13
Resta: 7
Multiplicación: 30
División: 3
Módulo: 1
Asignación a variable: 13
```

> ⚠️ Nota:  
> Cuando se realiza una división entre dos variables de tipo `int`, el resultado también será un `int`.  
> Para obtener decimales, al menos uno de los operandos debe ser de tipo `double` o `float`.

### Operador de contatenación en Java
El `operador aritmético +`, además de realizar operaciones de suma con valores numéricos, también se utiliza en Java para concatenar cadenas de texto (String).

La concatenación permite unir dos o más cadenas de texto en una sola, y es una de las formas más habituales de construir mensajes dinámicos combinando texto con variables.

Cuando uno de los operandos es de tipo String, Java interpreta el operador + como un operador de concatenación, no como una suma matemática.

```Java
String name = "Java";
String message = "Hola " + name;

System.out.println(message);

```
```Text
Hola Java

```

Con el operador de concatenación es importante el orden. Java concatena de izquierda a derecha.

```Java
System.out.println("Resultado: " + 5 + 5); // Orden de concatenación erronea

System.out.println("Resultado: " + (5 + 5)); // Orden de concatenación correcta

```
```Text
Resultado: 55
Resultado: 10


```

# Operadores asignación en Java
Los `operadores de asignación` en Java permiten asignar valores a variables y, en muchos casos, combinar una operación aritmética con la asignación en una sola instrucción, facilitando la actualización de valores como contadores, acumuladores y cálculos progresivos.

El operador básico es el signo igual (=), pero Java incluye operadores de asignación compuestos que simplifican operaciones frecuentes y mejoran la legibilidad del código.

| Operador | Nombre                        | Descripción                                               |
| -------- | ----------------------------- | --------------------------------------------------------- |
| `=`      | Asignación simple             | Asigna un valor a una variable                            |
| `+=`     | Asignación con suma           | Suma un valor a la variable y guarda el resultado         |
| `-=`     | Asignación con resta          | Resta un valor a la variable y guarda el resultado        |
| `*=`     | Asignación con multiplicación | Multiplica la variable por un valor y guarda el resultado |
| `/=`     | Asignación con división       | Divide la variable entre un valor y guarda el resultado   |
| `%=`     | Asignación con módulo         | Aplica el módulo y guarda el resto de la división         |

```Java
 int number = 10;

        // Asignación simple (=)
        number = 5;
        System.out.println("Asignación simple (=): " + number); 

        // Asignación con suma (+=)
        number += 3; // number = number + 3
        System.out.println("Asignación con suma (+=): " + number); 

        // Asignación con resta (-=)
        number -= 2; // number = number - 2
        System.out.println("Asignación con resta (-=): " + number); 

        // Asignación con multiplicación (*=)
        number *= 4; // number = number * 4
        System.out.println("Asignación con multiplicación (*=): " + number); 

        // Asignación con división (/=)
        number /= 3; // number = number / 3
        System.out.println("Asignación con división (/=): " + number); /

        // Asignación con módulo (%=)
        number %= 5; // number = number % 5
        System.out.println("Asignación con módulo (%=): " + number); 

```
```Text
Asignación simple (=): 5
Asignación con suma (+=): 8
Asignación con resta (-=): 6
Asignación con multiplicación (*=): 24
Asignación con división (/=): 8
Asignación con módulo (%=): 3

```

# Operadores de comparación en Java

Los `operadores de comparación` en Java se utilizan para comparar dos valores.
El resultado de una comparación siempre es un valor booleano: true o false.

Un operador de comparación es un símbolo que evalúa una condición entre dos valores y devuelve:

- true → si la condición se cumple
- false → si la condición no se cumple

Estos operadores son fundamentales para trabajar con condiciones, decisiones y estructuras de control como if, while o for.

| Operador | Nombre            | Descripción                                     |
| -------- | ----------------- | ----------------------------------------------- |
| `==`     | Igual a           | Comprueba si dos valores son iguales            |
| `!=`     | Distinto de       | Comprueba si dos valores son diferentes         |
| `>`      | Mayor que         | Comprueba si un valor es mayor que otro         |
| `<`      | Menor que         | Comprueba si un valor es menor que otro         |
| `>=`     | Mayor o igual que | Comprueba si un valor es mayor o igual que otro |
| `<=`     | Menor o igual que | Comprueba si un valor es menor o igual que otro |


```Java
 int a = 10;
        int b = 5;

        // Igual a
        System.out.println("a == b: " + (a == b)); 

        // Distinto de
        System.out.println("a != b: " + (a != b)); 

        // Mayor que
        System.out.println("a > b: " + (a > b)); 

        // Menor que
        System.out.println("a < b: " + (a < b)); 

        // Mayor o igual que
        System.out.println("a >= b: " + (a >= b)); 

        // Menor o igual que
        System.out.println("a <= b: " + (a <= b)); 
```
```Text
a == b: false
a != b: true
a > b: true
a < b: false
a >= b: true
a <= b: false

```

### Comparación de cadenas (String) en Java

En Java no es recomendable usar el operador == para comparar cadenas de texto (String).
El operador == compara referencias en memoria, no el contenido del texto.

Para comparar correctamente cadenas de texto, la forma recomendada es utilizar el método .equals().

El método .equals() compara el contenido de las cadenas y devuelve:

- true → si los textos son iguales
- false → si los textos son diferentes

```Java
String text1 = "Java";
String text2 = new String("Java");

System.out.println(text1.equals(text2));

```
```Text
true
```

> ⚠️ Nota: 
> 
> La función .equals() se utiliza para comparar el contenido de dos objetos, especialmente cadenas de texto (String).
> Devuelve un valor booleano:
> - true → si los contenidos son iguales
> - false → si los contenidos son diferentes
> 
> A diferencia del operador ==, que compara referencias en memoria, .equals() permite comprobar si dos valores representan el mismo contenido lógico.

# Operadores de lógica en Java
Los `operadores lógicos` en Java se utilizan para combinar o negar expresiones booleanas (true / false) y son fundamentales para construir condiciones complejas.

Permiten evaluar una o varias condiciones y producir un único resultado booleano (true o false), siendo ampliamente utilizados en estructuras if / else, bucles while y for, validaciones de datos y en el control del flujo del programa.

| Operador | Nombre lógico  | Descripción                                                  |
|----------|---------------|--------------------------------------------------------------|
| `&&`     | AND (Y lógico) | Devuelve `true` si **todas** las condiciones son verdaderas  |
| `\|\|`   | OR (O lógico)  | Devuelve `true` si **al menos una** condición es verdadera   |
| `!`      | NOT (Negación) | Invierte el valor de una condición                           |

```Java
boolean isAdult = true;
boolean isStudent = false;

// Operador AND
boolean resultAnd = isAdult && isStudent;
System.out.println(resultAnd);


// Operador OR
boolean resultOr = isAdult || isStudent;
System.out.println(resultOr);

// Operador NOT
boolean resultNot = !isStudent;
System.out.println(resultNot);

```
```Text
false
true
true

```

### Tabla de verdad en Java

`AND(&&)`
| A     | B     | Resultado |
| ----- | ----- | --------- |
| true  | true  | true      |
| true  | false | false     |
| false | true  | false     |
| false | false | false     |

`OR(||)`
| A     | B     | Resultado |
| ----- | ----- | --------- |
| true  | true  | true      |
| true  | false | true      |
| false | true  | true      |
| false | false | false     |

`NOT(!)`
| A     | Resultado |
| ----- | --------- |
| true  | false     |
| false | true      |

# Operadores ternarios en Java
El operador ternario es una forma abreviada de escribir una condición if / else en una sola línea. 

Se utiliza cuando queremos evaluar una condición y asignar un valor según el resultado (true o false).

```Java
// Sintaxis de operador ternario
condicion ? valorSiTrue : valorSiFalse;

``` 

```Java
int age = 20;

String result = age >= 18 ? "Mayor de edad" : "Menor de edad";

System.out.println(result);

```
```Text
Mayor de edad

```
# Operadores de incremento y decremento en java
Los operadores de incremento (++) y decremento (--) en Java se utilizan para aumentar o disminuir el valor de una variable en una unidad (1).

Son operadores muy comunes y se emplean especialmente en:

- Contadores
- Bucles (for, while)
- Iteraciones y control de flujo

Estos operadores pueden colocarse:

- Antes de la variable (forma prefija)
- Después de la variable (forma postfija)

```Java
// Incremento posfijo
int x = 5;
x++;
System.out.println(x);

// Incremento prefijo
int y = 5;
++y;
System.out.println(y);

// Decremento posfijo
int a = 5;
a--;
System.out.println(a);

// Decremento prefijo
int b = 5;
--b;
System.out.println(b);

```
```Text
6
6
4
4
```

# Operadores bit a bit en Java
Los operadores bit a bit permiten trabajar directamente con los bits (0 y 1) que componen los valores numéricos enteros.

En lugar de operar con números completos, estos operadores manipulan cada bit individualmente.

Se utilizan principalmente en:

- Optimización de bajo nivel
- Control de permisos
- Operaciones binarias
- Programación de sistemas y embebida

Representación binaria.
- 5 = 0101
- 3 = 0011

| Operador | Nombre           | Descripción                                               |
|----------|------------------|-----------------------------------------------------------|
| `&`      | AND bit a bit    | 1 si ambos bits son 1                                     |
| `|`      | OR bit a bit     | 1 si al menos uno de los bits es 1                        |
| `^`      | XOR bit a bit    | 1 si los bits son diferentes                             |
| `~`      | NOT bit a bit    | Invierte todos los bits                                   |
| `<<`     | Desplazamiento izquierda | Desplaza los bits a la izquierda                  |
| `>>`     | Desplazamiento derecha   | Desplaza los bits a la derecha conservando el signo |
| `>>>`    | Desplazamiento sin signo | Desplaza a la derecha rellenando con ceros        |

```Java
int a = 4; // binario: 0100
int b = 2; // binario: 0010

// AND &
System.out.println(a & b);

// OR |
System.out.println(a | b);

// XOR ^
System.out.println(a ^ b);

// NOT ~
System.out.println(~a);

// Desplazamiento a la izquierda <<
System.out.println(a << 1);

// Desplazamiento a la derecha >>
System.out.println(a >> 1);


```
```Text
0
6
6
-5
8
2

```
> ⚠️ Nota:
> Los operadores bit a bit pertenecen a un nivel más avanzado del lenguaje Java y se utilizan principalmente en escenarios de bajo nivel, optimización y manipulación directa de datos binarios.
>
> En las primeras etapas de aprendizaje, es suficiente conocer su existencia y propósito general, ya que su uso no es habitual en la mayoría de aplicaciones básicas. 

# Resumen

En esta lección hemos aprendido qué son los operadores en Java y cómo se utilizan para trabajar con valores y variables dentro de un programa.

✅ Operadores aritméticos  
Permiten realizar cálculos matemáticos básicos como sumas, restas, multiplicaciones, divisiones y operaciones de módulo.

✅ Operador de concatenación  
El operador `+` también se utiliza para unir cadenas de texto, permitiendo construir mensajes dinámicos combinando texto y variables.

✅ Operadores de asignación  
Facilitan la asignación y actualización de valores en una sola instrucción, mejorando la claridad y eficiencia del código.

✅ Operadores de comparación  
Permiten comparar valores y obtener resultados booleanos (`true` o `false`), siendo esenciales para tomar decisiones en el programa.

✅ Comparación de cadenas  
Para comparar textos (`String`), se utiliza el método `.equals()` en lugar del operador `==`, garantizando una comparación correcta del contenido.

✅ Operadores lógicos  
Permiten combinar o negar condiciones booleanas para construir expresiones más complejas.

✅ Operador ternario  
Ofrece una forma compacta y legible de escribir condiciones simples en una sola línea.

✅ Operadores de incremento y decremento  
Se utilizan para aumentar o disminuir valores, especialmente en contadores y bucles.

✅ Operadores bit a bit  
Permiten trabajar directamente con la representación binaria de los datos y forman parte de un nivel más avanzado del lenguaje.

Con el dominio de estos operadores, el estudiante adquiere una base sólida para avanzar hacia estructuras de control, lógica de programación y desarrollo de aplicaciones más complejas en Java.


# Ejercicios operadores en Java

## Ejercicio 1

1. Declara dos variables enteras:
   - `a = 10`
   - `b = 5`

2. Muestra por consola:
   - La suma
   - La resta
   - La multiplicación
   - La división
   - El módulo

3. Muestra un mensaje concatenando texto y el resultado de la suma.

## Ejercicio 2

1. Declara dos variables:
   - `int age = 18`
   - `boolean hasID = true`

2. Comprueba:
   - Si la edad es mayor o igual a 18
   - Si cumple ambas condiciones usando operadores lógicos

3. Muestra el resultado por consola.

## Ejercicio 3

1. Declara una variable `int score`.
2. Usa el operador ternario para:
   - Mostrar “Aprobado” si la nota es mayor o igual a 5
   - Mostrar “Suspenso” en caso contrario

## Ejercicio 4

1. Declara una variable contador con valor inicial 0.
2. Incrementa el valor tres veces.
3. Muestra el valor final por consola.

# Enlaces lección

[Fichero Java Operadores](https://github.com/mariobello-beco/Hello-Java/blob/main/src/Lesson03_Operadores/Operadores.java)


[Ejercicios Operadores](https://github.com/mariobello-beco/Hello-Java/blob/main/src/Lesson03_Operadores/Exercise.java)