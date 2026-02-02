# String en Java

<p align="center">
  <img 
    src="../../img/String_Java.png" 
    width="900" 
    alt="Cadenas de texto en Java">
  <br>
  <em>Curso Java desde 0</em>
</p>

La `clase String` en Java se utiliza para representar y manipular cadenas de caracteres, es decir, texto.
Es una de las clases más importantes y utilizadas del lenguaje, ya que permite trabajar con nombres, mensajes, textos, entradas de usuario, validaciones y cualquier tipo de información textual.

En Java, String no es un tipo primitivo, sino una **clase**.

Esto implica que:

- String es un objeto
- Pertenece al paquete java.lang (se importa automáticamente)
- Proporciona métodos para trabajar con texto
- Es un tipo de dato de referencia

Aunque su uso es muy sencillo y directo, internamente Java está creando objetos de la clase String cada vez que se trabaja con texto.

> **Características importantes de String**
>
> 🔒 String es una clase final  
> La clase String es final, lo que significa que no puede heredarse.  
> Esto garantiza que su comportamiento no pueda ser alterado mediante herencia, aportando seguridad y consistencia al lenguaje.
>
> 🔐 String es inmutable  
> Los objetos de tipo String son inmutables, lo que significa que una vez creados, su contenido no puede modificarse.
>
> Cualquier operación que aparentemente modifique un String genera en realidad un nuevo objeto en memoria.


Esto significa que una vez creado un String, **su contenido no puede modificarse**.
Cualquier operación que parezca modificar un String, en realidad crea un nuevo objeto String en memoria.

## Crear objeto String 
Los objetos String pueden crearse de dos formas:

Usando una `cadena literal` (forma más habitual). Java optimiza esta forma y reutiliza valores internamente.

```Java
String string = "Hola Java";

```
Usando el `operador new`. Esta forma crea explícitamente un nuevo objeto en memoria.
```Java
String newString = new String("Hola Java");

```

## Concatenación de la clase String en Java
La concatenación de String en Java consiste en unir dos o más cadenas de texto para formar una sola.

En Java, la concatenación se realiza principalmente utilizando el operador +.
Cuando uno de los operandos es de tipo String, el operador + deja de actuar como suma matemática y pasa a funcionar como operador de concatenación.

`Sintaxis: String resultado = cadena1 + cadena2;`

```Java
String name = "Java";
String message = "Hola " + name;

System.out.println(message);

```
```Text
Hola Java
```
### Orden de concatenación 
La concatenación se evalúa de izquierda a derecha, por lo que el orden es muy importante.

```Java
// Concatenación en cadena de texto
System.out.println("Resultado: " + 5 + 5);

// Concatenación en operación
System.out.println("Resultado: " + (5 + 5));

```Text
Resultado: 55
Resultado: 10

```
Cada operación de concatenación crea un nuevo objeto String, ya que los String son inmutables.

Por este motivo, en concatenaciones muy repetidas o dentro de bucles, se recomienda utilizar otras clases como StringBuilder, que se verán más adelante en el curso.

## Comparación de Strings en Java
En Java, **no se debe usar el operador `==` para comparar el contenido de cadenas de texto**.

El operador `==` compara **referencias en memoria**, no el texto. Para comparar el contenido de dos Strings, se debe usar el método `.equals()`.

```java
String a = "Java";
String b = new String("Java");

System.out.println(a == b);        
System.out.println(a.equals(b));   

```

```Text
false
true

```
## Métodos de la clase String en Java
La clase String proporciona numerosos métodos para manipular y trabajar con texto.

### Métodos básicos
| Método                         | Descripción                          |
| ------------------------------ | ------------------------------------ |
| `length()`                     | Devuelve la longitud de la cadena    |
| `charAt(int index)`            | Devuelve el carácter de una posición |
| `concat(String str)`           | Une dos cadenas                      |
| `equalsIgnoreCase(String str)` | Compara sin distinguir mayúsculas    |
| `isEmpty()`                    | Comprueba si la cadena está vacía    |

```Java
String text = "Java";
String newText = "Hola";
String emptyText = "";

// length()
int length = text.length();

// charAt(int index)
char letter = text.charAt(1);

// concat(String str)
String result = newText.concat(" ").concat(text);

// Comprobación usando isEmpty() (sobre el String vacío)
boolean isEmptyValue = emptyText.isEmpty();

// Comprobación usando length() (sobre el String vacío)
int emptyLength = emptyText.length();

System.out.println("Longitud de text: " + length);
System.out.println("Carácter en posición 1: " + letter);
System.out.println("Concatenación: " + result);
System.out.println("¿emptyText está vacío?: " + isEmptyValue);
System.out.println("Longitud de emptyText: " + emptyLength);

```
```Text
Longitud de text: 4
Carácter en posición 1: a
Concatenación: Hola Java
¿emptyText está vacío?: true
Longitud de emptyText: 0


```
### Métodos de búsqueda
| Método                     | Descripción                            |
| -------------------------- | -------------------------------------- |
| `indexOf(String str)`      | Devuelve la posición de una subcadena  |
| `lastIndexOf(String str)`  | Devuelve la última posición encontrada |
| `contains(CharSequence s)` | Comprueba si contiene un texto         |

```Java
String text = "Aprendiendo Java desde cero";

// indexOf(String str)
int position = text.indexOf("Java"); 
// Devuelve la posición donde comienza la subcadena "Java"

// lastIndexOf(String str)
int lastPosition = text.lastIndexOf("e"); 
// Devuelve la última posición donde aparece el carácter "e"

// contains(CharSequence s)
boolean containsText = text.contains("Java"); 
// Comprueba si la cadena contiene el texto indicado

// Salida por consola
System.out.println("Texto original: " + text);
System.out.println("Posición de 'Java': " + position);
System.out.println("Última posición de 'e': " + lastPosition);
System.out.println("¿Contiene 'Java'?: " + containsText);

```
```Text
Texto original: Aprendiendo Java desde cero
Posición de 'Java': 12
Última posición de 'e': 27
¿Contiene 'Java'?: true

```
### Métodos de manipulación
| Método                          | Descripción                           |
| ------------------------------- | ------------------------------------- |
| `substring(int begin, int end)` | Extrae una parte del texto            |
| `toUpperCase()`                 | Convierte a mayúsculas                |
| `toLowerCase()`                 | Convierte a minúsculas                |
| `trim()`                        | Elimina espacios al inicio y al final |
| `replace(char old, char new)`   | Sustituye caracteres                  |
| `split(String regex)`           | Divide una cadena en partes           |

```Java
String text = "  Aprendiendo Java desde Cero  ";

// substring(int begin, int end)
String subText = text.substring(2, 13); 
// Extrae una parte del texto desde la posición 2 hasta la 12

// toUpperCase()
String upperText = text.toUpperCase(); 
// Convierte toda la cadena a mayúsculas

// toLowerCase()
String lowerText = text.toLowerCase(); 
// Convierte toda la cadena a minúsculas

// trim()
String trimmedText = text.trim(); 
// Elimina los espacios al inicio y al final

// replace(char old, char new)
String replacedText = text.replace('e', 'E'); 
// Sustituye todas las 'e' por 'E'

// split(String regex)
String[] words = trimmedText.split(" "); 
// Divide la cadena en partes usando el espacio como separador

// Salida por consola
System.out.println("Texto original: '" + text + "'");
System.out.println("Substring: " + subText);
System.out.println("Mayúsculas: " + upperText);
System.out.println("Minúsculas: " + lowerText);
System.out.println("Sin espacios: '" + trimmedText + "'");
System.out.println("Reemplazo: " + replacedText);
System.out.println("Palabras separadas:");

for (String word : words) {
    System.out.println("- " + word);
}

```
```Text
Texto original: '  Aprendiendo Java desde Cero  '
Substring: Aprendiendo
Mayúsculas:   APRENDIENDO JAVA DESDE CERO  
Minúsculas:   aprendiendo java desde cero  
Sin espacios: 'Aprendiendo Java desde Cero'
Reemplazo:   AprEndiEndo Java dEsdE CEro  
Palabras separadas:
- Aprendiendo
- Java
- desde
- Cero

```

# Resumen

En esta lección hemos aprendido qué es la clase String en Java y por qué es uno de los elementos más importantes del lenguaje para trabajar con texto.

✅ ¿Qué es un String en Java?
Un String es un objeto, no un tipo primitivo. Pertenece al paquete java.lang, es un tipo de dato de referencia y se utiliza para representar cadenas de caracteres.

✅ Características clave de String
Los objetos String son inmutables, lo que significa que su contenido no puede modificarse una vez creado.
Cualquier operación que aparentemente cambia un String, en realidad genera un nuevo objeto en memoria.

✅ Creación de Strings
Hemos aprendido a crear Strings mediante:

Cadenas literales

El operador new

✅ Concatenación de Strings
La concatenación permite unir cadenas de texto utilizando el operador + o el método concat().
El orden de concatenación es importante y se evalúa de izquierda a derecha.

✅ Comparación de Strings
Para comparar el contenido de cadenas de texto se debe utilizar el método .equals(), ya que el operador == compara referencias en memoria y no el contenido del texto.

✅ Métodos de la clase String
Hemos trabajado con los métodos más utilizados para:

Obtener información (length(), isEmpty())

Buscar texto (indexOf(), contains())

Manipular cadenas (substring(), toUpperCase(), trim(), replace(), split())

Gracias a estos métodos, es posible validar, transformar y analizar texto de forma eficiente.

Con el dominio de la clase String, el estudiante adquiere una base fundamental para trabajar con entrada de datos, validaciones, mensajes, procesamiento de texto y lógica de aplicaciones en Java.

# Ejercicios String en Java
## Crear y mostrar Strings

Declara las siguientes variables:

- Un String con tu nombre
- Un String con tu lenguaje de programación favorito

Muestra por consola:

- Tu nombre
- El lenguaje
- La longitud de cada String

## Concatenación de texto

Declara dos variables:

- String name
- String language

Concatena ambas variables para mostrar el siguiente mensaje:

Hola, me llamo [nombre] y estoy aprendiendo [lenguaje]


Muestra el resultado por consola.

## Comparación de Strings

Declara dos variables String con el mismo texto, una usando literal y otra usando new.

Comprueba:

- Si son iguales usando ==
- Si son iguales usando .equals()

Muestra ambos resultados por consola.

## Métodos básicos de String

Declara una variable:

String text = "Java desde cero";


Muestra por consola:

- La longitud del texto
- El carácter que se encuentra en la posición 2
- El texto en mayúsculas
- El texto en minúsculas

## Manipulación de texto

Declara una variable con espacios al inicio y al final:

String message = "  Aprendiendo Java  ";


Realiza las siguientes acciones:

- Elimina los espacios sobrantes
- Sustituye la letra a por A
- Divide el texto en palabras

Muestra cada palabra por consola.

## Comprobación de texto

Declara una variable String vacía.

Comprueba:

- Si está vacía usando isEmpty()
- Su longitud usando length()

Muestra los resultados por consola.

## Ejercicio final integrador ⭐

Pide al usuario una frase por consola.

Muestra:

- La longitud de la frase
- La frase en mayúsculas
- Si contiene la palabra "Java"
- Divide la frase en palabras y muéstralas una a una.

# Enlaces lección

[Fichero Java String](https://github.com/mariobello-beco/Hello-Java/blob/main/src/Lesson04_String/String.java)


[Ejercicios Operadores](https://github.com/mariobello-beco/Hello-Java/blob/main/src/Lesson04_String/Exercise.java)