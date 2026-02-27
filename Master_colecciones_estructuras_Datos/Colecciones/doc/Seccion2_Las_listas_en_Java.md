# Clase-6 : 🗂️🗂️ INTERFAZ LIST-  📚

- La interfaz List es una subinterfaz de Collection que representa una colección ordenada de elementos. Permite elementos duplicados y proporciona métodos específicos para trabajar con listas, como acceder a elementos por índice, insertar elementos en posiciones específicas y buscar elementos.
- La interfaz List es ampliamente utilizada en Java para almacenar y manipular secuencias de elementos, como listas de nombres, números o cualquier otro tipo de datos. Algunas implementaciones comunes de la interfaz List incluyen ArrayList, LinkedList y Vector.
- Los métodos más comunes de la interfaz List incluyen metodos
- se pueden repetir elementos, acceder a elementos por índice, insertar elementos en posiciones específicas y buscar elementos. Algunos de los métodos más comunes de la interfaz List incluyen:

- **ListIterator** : Es una interfaz que extiende Iterator y proporciona métodos adicionales para recorrer y modificar una lista. Permite iterar en ambas direcciones (hacia adelante y hacia atrás) y realizar operaciones de inserción, eliminación y reemplazo durante la iteración.
- **ArrayList** : Es una implementación de la interfaz List que utiliza un array dinámico para almacenar los elementos. Es eficiente para acceder a elementos por índice, pero puede ser menos eficiente para insertar o eliminar elementos en posiciones específicas debido a la necesidad de desplazar los elementos.
- **LinkedList** : Es otra implementación de la interfaz List que utiliza una estructura de datos de lista enlazada para almacenar los elementos. Es eficiente para insertar o eliminar elementos en posiciones específicas, pero puede

metodos ->
- **Set** : Es una interfaz que representa una colección que no permite elementos duplicados. No garantiza un orden específico de los elementos. Algunas implementaciones comunes de la interfaz Set incluyen HashSet, LinkedHashSet y TreeSet.
- **subList** : Es un método de la interfaz List que devuelve una vista de una parte de la lista original. Permite trabajar con una sección específica de la lista sin modificar la lista original. La sublista es dinámica, lo que significa que los cambios realizados en la sublista se reflejan en la lista original y viceversa.
- **ListOf** : Es un método estático introducido en Java 9 que permite crear una lista inmutable a partir de un número variable de elementos. La lista creada con List.of es inmutable, lo que significa que no se pueden agregar, eliminar o modificar elementos después de su creación. Es útil para crear listas de manera concisa y segura cuando no se requiere mutabilidad.

# Clase-8 : 🗂️🗂️ CREACION DE ARRAYLIST Y ADICION DE ELEMENTOS-  📚
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html#method-summary

```text
Sí, la clase ArrayList implementa la interfaz List en Java. Esto significa que ArrayList hereda todos los métodos definidos en la interfaz List, como add, remove, get, size, etc.
En tu archivo C_08_ArrayList1.java, cuando declaras:
List<String> listaColores = new ArrayList<>();
Estás usando la interfaz List como tipo de referencia, y ArrayList como la implementación concreta. Esto es una buena práctica porque permite cambiar fácilmente la implementación (por ejemplo, a LinkedList) sin modificar el resto del código.
¿Quieres que agregue un comentario explicativo en tu archivo para aclarar este punto, o necesitas ejemplos de métodos de la interfaz List usados con ArrayList?
```

# Clase-9 : 🗂️🗂️ METODO DE INTERACCIÓN EN LAS LISTAS-  📚

## ¿ qué es el metodo Iterator?
rpta : El método `iterator()` es un método definido en la interfaz Collection que devuelve un objeto de tipo Iterator.
Un Iterator es una interfaz que proporciona métodos para recorrer los elementos de una colección de manera secuencial.
Permite acceder a los elementos de la colección sin exponer su estructura interna.

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Iterator.html

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ListIterator.html

![img](../img/img_01.png)

## 🎯 ¿Qué es Iterator?

### 📖 Definición

`Iterator` es una **interfaz** (NO un método) que pertenece al paquete `java.util`.

```java
public interface Iterator<E> {
    boolean hasNext();
    E next();
    void remove();
}
```

### 🏗️ Jerarquía

```
Collection (interfaz)
    ↓
    └─ iterator() (método que retorna Iterator)
           ↓
       Iterator<E> (interfaz)
```

---

## 🔍 Iterator vs ListIterator - Diferencias

### 📊 Tabla comparativa

| Característica | Iterator | ListIterator |
|----------------|----------|--------------|
| **Tipo** | Interfaz básica | Interfaz extendida (hereda de Iterator) |
| **Dirección** | ⏩ Solo hacia adelante | ⏩⏪ Adelante y atrás |
| **Funciona con** | Cualquier Collection | Solo con List |
| **Métodos básicos** | `hasNext()`, `next()`, `remove()` | Todo lo de Iterator + más |
| **Índices** | ❌ No maneja índices | ✅ Sí (`nextIndex()`, `previousIndex()`) |
| **Modificación** | Solo eliminar | Eliminar, agregar, reemplazar |

---

### 🎨 Visualización de la jerarquía

```
Iterator<E> (interfaz padre)
    ├─ boolean hasNext()
    ├─ E next()
    └─ void remove()
           ↑
           │ extiende
           │
ListIterator<E> (interfaz hija)
    ├─ Todo lo de Iterator +
    ├─ boolean hasPrevious()
    ├─ E previous()
    ├─ int nextIndex()
    ├─ int previousIndex()
    ├─ void set(E e)
    └─ void add(E e)
```

---

## 🔧 Métodos de Iterator

### 📋 Iterator (básico)

```java
Iterator<String> iterator = lista.iterator();

// Métodos disponibles:
iterator.hasNext()   // ¿Hay siguiente elemento?
iterator.next()      // Obtiene el siguiente elemento
iterator.remove()    // Elimina el elemento actual
```

### 📋 ListIterator (avanzado)

```java
ListIterator<String> listIterator = lista.listIterator();

// Métodos adicionales:
listIterator.hasPrevious()     // ¿Hay elemento anterior?
listIterator.previous()        // Obtiene elemento anterior
listIterator.nextIndex()       // Índice del siguiente
listIterator.previousIndex()   // Índice del anterior
listIterator.set("nuevo")      // Reemplaza elemento actual
listIterator.add("nuevo")      // Agrega elemento
```

---

## 🎯 ¿Cuál es el propósito de cada uno?

### 🔹 Iterator - Recorrido básico

**Propósito**: Recorrer **cualquier colección** de forma secuencial hacia adelante.

```java
List<String> lista = Arrays.asList("A", "B", "C");
Iterator<String> iterator = lista.iterator();

// Solo puedes ir hacia adelante ⏩
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

**Salida:**
```
A
B
C
```

---

### 🔹 ListIterator - Recorrido bidireccional

**Propósito**: Recorrer **listas** en ambas direcciones y modificarlas durante el recorrido.

```java
List<String> lista = new ArrayList<>(Arrays.asList("A", "B", "C"));
ListIterator<String> listIterator = lista.listIterator();

// Ir hacia adelante ⏩
while (listIterator.hasNext()) {
    System.out.println(listIterator.next());
}

// Ir hacia atrás ⏪
while (listIterator.hasPrevious()) {
    System.out.println(listIterator.previous());
}
```

**Salida:**
```
A
B
C
C
B
A
```

---

## 🔄 ¿Cómo funciona internamente el Iterator?

### 📍 Concepto del cursor

El iterator funciona como un **cursor** que apunta entre elementos:

```
Lista: ["Rojo", "Verde", "Azul"]

Estado inicial:
    ↓ cursor
    ["Rojo", "Verde", "Azul"]

Después de next():
    ["Rojo", ↓ "Verde", "Azul"]
              cursor

Después de next():
    ["Rojo", "Verde", ↓ "Azul"]
                      cursor
```

---

### 🎬 Flujo paso a paso

```java
List<String> listaColores = Arrays.asList("Rojo", "Verde", "Azul");
ListIterator<String> iterador = listaColores.listIterator();
```

#### Estado 1: Inicialización

```
Cursor: ↓
Lista:  ["Rojo", "Verde", "Azul"]
         ^
         |
    hasNext() = true (hay elemento después del cursor)
```

#### Estado 2: Primera llamada a next()

```java
iterador.hasNext(); // true
String color = iterador.next(); // "Rojo"
```

```
Cursor:        ↓
Lista:  ["Rojo", "Verde", "Azul"]
                 ^
                 |
    Retorna "Rojo" y mueve el cursor
    hasNext() = true
```

#### Estado 3: Segunda llamada a next()

```java
iterador.hasNext(); // true
String color = iterador.next(); // "Verde"
```

```
Cursor:               ↓
Lista:  ["Rojo", "Verde", "Azul"]
                        ^
                        |
    Retorna "Verde" y mueve el cursor
    hasNext() = true
```

#### Estado 4: Tercera llamada a next()

```java
iterador.hasNext(); // true
String color = iterador.next(); // "Azul"
```

```
Cursor:                      ↓
Lista:  ["Rojo", "Verde", "Azul"]
    
    Retorna "Azul" y mueve el cursor
    hasNext() = false (no hay más elementos)
```

---

## 🤔 ¿Por qué se usa `iterator.next()` en la impresión?

### ❌ Forma incorrecta (no funciona)

```java
while (iterador.hasNext()) {
    System.out.println("Color:" + iterador); // ❌ Imprime el objeto Iterator, no el elemento
}
```

**Salida incorrecta:**
```
Color:java.util.ArrayList$ListItr@15db9742
Color:java.util.ArrayList$ListItr@15db9742
Color:java.util.ArrayList$ListItr@15db9742
```

---

### ✅ Forma correcta

```java
while (iterador.hasNext()) {
    System.out.println("Color:" + iterador.next()); // ✅ Obtiene Y avanza al siguiente
}
```

**Salida correcta:**
```
Color:Rojo
Color:Verde
Color:Azul
```

---

### 🔍 ¿Por qué next() hace dos cosas?

El método `next()` hace **DOS operaciones atómicas**:

1. **Retorna** el elemento actual
2. **Mueve** el cursor al siguiente

```java
public E next() {
    E elemento = obtenerElementoActual();  // 1. Obtener
    moverCursor();                          // 2. Avanzar
    return elemento;                        // Retornar
}
```

---

## 💻 Ejemplos prácticos completos

### 🔹 Ejemplo 1: Iterator básico

```java
import java.util.*;

public class EjemploIterator {
    public static void main(String[] args) {
        List<String> colores = Arrays.asList("Rojo", "Verde", "Azul");
        
        // Crear iterator
        Iterator<String> iterator = colores.iterator();
        
        // Recorrer
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println("Color: " + color);
        }
    }
}
```

**Salida:**
```
Color: Rojo
Color: Verde
Color: Azul
```

---

### 🔹 Ejemplo 2: ListIterator bidireccional

```java
import java.util.*;

public class EjemploListIterator {
    public static void main(String[] args) {
        List<String> colores = Arrays.asList("Rojo", "Verde", "Azul");
        
        // Crear list iterator
        ListIterator<String> listIterator = colores.listIterator();
        
        // Hacia adelante ⏩
        System.out.println("=== Hacia adelante ===");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        
        // Hacia atrás ⏪
        System.out.println("\n=== Hacia atrás ===");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
```

**Salida:**
```
=== Hacia adelante ===
Rojo
Verde
Azul

=== Hacia atrás ===
Azul
Verde
Rojo
```

---

### 🔹 Ejemplo 3: Modificar durante iteración

```java
import java.util.*;

public class EjemploModificar {
    public static void main(String[] args) {
        List<String> colores = new ArrayList<>(Arrays.asList("Rojo", "Verde", "Azul"));
        
        ListIterator<String> listIterator = colores.listIterator();
        
        while (listIterator.hasNext()) {
            String color = listIterator.next();
            
            // Modificar elemento actual
            if (color.equals("Verde")) {
                listIterator.set("Verde Oscuro");
            }
            
            // Agregar después del elemento actual
            if (color.equals("Azul")) {
                listIterator.add("Amarillo");
            }
        }
        
        System.out.println("Lista modificada: " + colores);
    }
}
```

**Salida:**
```
Lista modificada: [Rojo, Verde Oscuro, Azul, Amarillo]
```

---

### 🔹 Ejemplo 4: Eliminar durante iteración

```java
import java.util.*;

public class EjemploEliminar {
    public static void main(String[] args) {
        List<String> colores = new ArrayList<>(Arrays.asList("Rojo", "Verde", "Azul", "Amarillo"));
        
        Iterator<String> iterator = colores.iterator();
        
        while (iterator.hasNext()) {
            String color = iterator.next();
            
            // Eliminar colores que empiezan con "A"
            if (color.startsWith("A")) {
                iterator.remove(); // ✅ Forma segura de eliminar
            }
        }
        
        System.out.println("Lista después de eliminar: " + colores);
    }
}
```

**Salida:**
```
Lista después de eliminar: [Rojo, Verde]
```

---

## ⚠️ Errores comunes

### ❌ Error 1: Llamar next() sin verificar hasNext()

```java
Iterator<String> iterator = lista.iterator();
iterator.next(); // ✅ OK
iterator.next(); // ✅ OK
iterator.next(); // ✅ OK
iterator.next(); // ❌ NoSuchElementException (no hay más elementos)
```

**Solución:**
```java
while (iterator.hasNext()) { // Siempre verificar primero
    System.out.println(iterator.next());
}
```

---

### ❌ Error 2: Modificar colección durante iteración (sin iterator)

```java
List<String> lista = new ArrayList<>(Arrays.asList("A", "B", "C"));
Iterator<String> iterator = lista.iterator();

while (iterator.hasNext()) {
    String elemento = iterator.next();
    lista.remove(elemento); // ❌ ConcurrentModificationException
}
```

**Solución:**
```java
while (iterator.hasNext()) {
    iterator.next();
    iterator.remove(); // ✅ Usar el método remove() del iterator
}
```

---

### ❌ Error 3: Llamar next() dos veces en el mismo ciclo

```java
while (iterator.hasNext()) {
    System.out.println(iterator.next()); // Imprime "Rojo"
    System.out.println(iterator.next()); // Imprime "Verde" (saltó un elemento)
}
```

**Solución:**
```java
while (iterator.hasNext()) {
    String elemento = iterator.next(); // Guardarlo en variable
    System.out.println(elemento);
    System.out.println(elemento); // Usar la variable
}
```

---

## 🎯 Análisis de tu código

```java
ListIterator<String> iterador = listaColores.listIterator();
System.out.println("Recorrido con iterador :");
while (iterador.hasNext()) {
    System.out.println("Color:" + iterador.next());
}
```

### 🔍 Desglose línea por línea

#### Línea 1:
```java
ListIterator<String> iterador = listaColores.listIterator();
```

- Crea un **ListIterator** para la lista
- El cursor se posiciona **antes del primer elemento**
- `ListIterator<String>` significa que iterará sobre elementos de tipo String

#### Línea 2:
```java
System.out.println("Recorrido con iterador :");
```

- Imprime un encabezado (esto es solo texto)

#### Línea 3:
```java
while (iterador.hasNext()) {
```

- Pregunta: "¿Hay un elemento siguiente?"
- Si **true**: ejecuta el bloque
- Si **false**: sale del while

#### Línea 4:
```java
System.out.println("Color:" + iterador.next());
```

- `iterador.next()`:
    1. **Obtiene** el elemento actual
    2. **Mueve** el cursor al siguiente
    3. **Retorna** el elemento obtenido
- `System.out.println()`: Imprime el resultado

---

### 🎬 Ejecución paso a paso

Supongamos: `listaColores = ["Rojo", "Verde", "Azul"]`

```
Iteración 1:
    hasNext() → true
    next() → "Rojo"
    Imprime: "Color:Rojo"
    
Iteración 2:
    hasNext() → true
    next() → "Verde"
    Imprime: "Color:Verde"
    
Iteración 3:
    hasNext() → true
    next() → "Azul"
    Imprime: "Color:Azul"
    
Iteración 4:
    hasNext() → false
    Sale del while
```

---

## 📚 Cuándo usar cada uno

### 🔹 Usa Iterator cuando:

- ✅ Solo necesitas recorrer hacia adelante
- ✅ Trabajas con cualquier Collection (Set, Queue, List)
- ✅ Solo necesitas leer o eliminar elementos

```java
Set<String> set = new HashSet<>(Arrays.asList("A", "B", "C"));
Iterator<String> iterator = set.iterator(); // Set NO tiene ListIterator
```

---

### 🔹 Usa ListIterator cuando:

- ✅ Trabajas específicamente con **List**
- ✅ Necesitas recorrer en **ambas direcciones**
- ✅ Necesitas **modificar** elementos durante la iteración
- ✅ Necesitas saber el **índice** actual

```java
List<String> lista = new ArrayList<>(Arrays.asList("A", "B", "C"));
ListIterator<String> listIterator = lista.listIterator();
```

---

## 🎓 Resumen final

### 🔑 Conceptos clave

| Concepto | Explicación |
|----------|-------------|
| **Iterator** | Interfaz para recorrer colecciones hacia adelante |
| **ListIterator** | Interfaz extendida, solo para List, bidireccional |
| **Cursor** | Posición actual del iterator entre elementos |
| **hasNext()** | Verifica si hay siguiente elemento |
| **next()** | Obtiene elemento actual Y mueve cursor |
| **previous()** | (Solo ListIterator) Retrocede y obtiene elemento |
| **remove()** | Elimina el último elemento retornado por next() |

---

### ✅ Por qué `iterator.next()` se usa en la impresión

1. **`next()` retorna el elemento** - No solo mueve el cursor
2. **Es la única forma de obtener el valor** - El iterator en sí no es el elemento
3. **Combina obtención + avance** - Eficiente en una sola llamada

---

### 🎯 Forma mental de recordarlo

```
Iterator = Control remoto 📺
    - hasNext() = ¿Hay siguiente canal?
    - next() = Cambiar al siguiente canal Y mostrarlo
    
ListIterator = Control remoto con botón atrás ⏮️⏭️
    - hasPrevious() = ¿Hay canal anterior?
    - previous() = Cambiar al canal anterior Y mostrarlo
```

## ✅¿Podemos dejar de incluir el NEXT()?
> Si no pones iterador.next() dentro del ciclo while (iterador.hasNext()),}
> el iterador nunca avanzará al siguiente elemento de la colección.
> Esto provocará un bucle infinito, porque iterador.hasNext() seguirá devoliendo
> true y el ciclo nunca terminará. El método next() es el que mueve el cursor del iterador
> al siguiente elemento, permitiendo recorrer la colección correctamente.
> En resumen: es obligatorio llamar a next() para avanzar el iterador y evitar ciclos infinitos.

## ✅Nota :

> Para avanzar en la colección, usas hasNext() junto con next(). Cada llamada a next() mueve el iterador al siguiente elemento.
> Para retroceder (solo con ListIterator), usas hasPrevious() junto con previous(). Cada llamada a previous() mueve el iterador al elemento anterior.
> Ambos métodos (next() y previous()) son los que realmente mueven el cursor del iterador. Los métodos hasNext() y hasPrevious() solo verifican si hay un siguiente o anterior elemento disponible, respectivamente.
> Así puedes recorrer la colección en ambas direcciones de forma segura y controlada.
---

# Clase-10 : 🗂️🗂️ ELIMINAR PRODUCTOS CONDICONALMENTE EN UNA LISTA-  📚

## DATO CURIOSO MARCA ERROR

```java
 public static Producto[] obtenerProductos() {
        Producto[] productos = {
                new Producto("H&M", "Gris", "Pay", "32L"),
                new Producto("H&M", "Verde", "Pay", "32L"),
                new Producto("Zara", "Gris", "Coco", "32L"),
                new Producto("Lacoste", "Verde", "Crown", "32L"),
                new Producto("Farm", "Azul", "Holos", "32L"),
                new Producto("Ho", "Gris", "Pay", "32L"),
                new Producto("H&M", "Gris", "Pay", "32L"),
                new Producto("H&M", "Gris", "Pay", "32L"),
                new Producto("Lacoste", "Gris", "Pay", "32L"),
        };
        return productos;
    }
```

```java
public static void main(String[] args) {
    String[] marcas = {"H&M", "Lacoste"};
    //mira como le paso la lista 
  //List<Producto> productos = new ArrayList<>(obtenerProductos());//te marca error por que debe devolver un collection, no un array, por eso lo convierto a una lista
  //solucion
  List<Producto> productos = new ArrayList<>(Arrays.asList(obtenerProductos()));
}

```
### POR ESTE MOTIVO TE MARCA ERROR EN EL CONSTRUCTOR :
```text
El error ocurre porque el constructor de ArrayList que recibe una colección espera un objeto de tipo Collection, pero obtenerProductos() retorna un arreglo (Producto[]), no una colección.
Cuando usas new ArrayList<>(obtenerProductos()), estás pasando un arreglo, y el constructor espera una Collection, por eso da error de compilación.
Cuando usas Arrays.asList(obtenerProductos()), conviertes el arreglo en una lista (que sí es una Collection), y luego puedes pasar esa lista al constructor de ArrayList sin problema.
List.of(obtenerProductos()) también retorna una lista inmutable a partir del arreglo, que es una Collection.
En resumen: el constructor de ArrayList necesita una Collection, no un arreglo. Por eso debes convertir el arreglo a lista usando Arrays.asList() o List.of() antes de pasarlo al constructor.
```
### ¿POR QUE NO USAS DIRECTO ARRAYS.ASlIST?

````md
✅ **Correcto!** Si usas:

```java
List<Producto> productos = Arrays.asList(obtenerProductos());
````
obtienes una lista respaldada por el arreglo original. Esto significa:
* ❌ No puedes agregar ni eliminar elementos de la lista (lanza `UnsupportedOperationException`).
* ✔️ Sí puedes modificar los elementos existentes (por ejemplo, `productos.set(0, nuevoProducto);` es válido).
* 📏 El tamaño de la lista es fijo, igual al del arreglo.

---
🛠️ Si necesitas una lista completamente modificable (agregar/eliminar), debes crear una nueva lista así:

```java
List<Producto> productos = new ArrayList<>(Arrays.asList(obtenerProductos()));
```
De esta forma puedes manipular la lista libremente (agregar, eliminar, etc.).
```
```
---

# Clase-11 : 🗂️🗂️ QUE ES UNA LISTA ENLAZADA-  📚

## 🎯 ¿Qué es una Lista Enlazada?

Una **lista enlazada** (Linked List) es una estructura de datos que consiste en una secuencia de elementos llamados **nodos**, donde cada nodo contiene:

1. **El dato** (valor del elemento)
2. **Una referencia** (enlace) al siguiente nodo

A diferencia de un **ArrayList** que usa un arreglo interno, una **LinkedList** almacena los elementos de forma dispersa en la memoria, conectados mediante referencias.

---

## 🏗️ Estructura Visual de una Lista Enlazada

### 📊 Comparación Visual: ArrayList vs LinkedList

#### ✅ **ArrayList** (basada en arreglo)
```
┌──────┬──────┬──────┬──────┬──────┐
│  A   │  B   │  C   │  D   │  E   │  ← Elementos contiguos en memoria
└──────┴──────┴──────┴──────┴──────┘
  [0]    [1]    [2]    [3]    [4]      ← Acceso directo por índice
```

**Características:**
- ✅ Acceso rápido por índice: O(1)
- ❌ Insertar/eliminar en medio: O(n) - hay que desplazar elementos
- 📦 Almacenamiento contiguo en memoria

---

#### 🔗 **LinkedList** (basada en nodos)
```
┌──────┐      ┌──────┐      ┌──────┐      ┌──────┐      ┌──────┐
│  A   │─────▶│  B   │─────▶│  C   │─────▶│  D   │─────▶│  E   │─────▶ null
└──────┘      └──────┘      └──────┘      └──────┘      └──────┘
 Nodo 1        Nodo 2        Nodo 3        Nodo 4        Nodo 5
 
 head                                                       tail
  ↓                                                          ↓
┌────┬────┐  ┌────┬────┐  ┌────┬────┐  ┌────┬────┐  ┌────┬────┐
│ A  │ ●──┼─▶│ B  │ ●──┼─▶│ C  │ ●──┼─▶│ D  │ ●──┼─▶│ E  │null│
└────┴────┘  └────┴────┘  └────┴────┘  └────┴────┘  └────┴────┘
 dato│next    dato│next    dato│next    dato│next    dato│next
```

**Características:**
- ❌ Acceso por índice: O(n) - hay que recorrer nodo por nodo
- ✅ Insertar/eliminar en extremos o medio: O(1) - solo cambiar referencias
- 🔗 Almacenamiento disperso en memoria, conectado por referencias

---

## 🧩 Estructura de un Nodo

Cada nodo en una lista enlazada tiene esta estructura:

```java
class Nodo<E> {
    E dato;           // El valor almacenado
    Nodo<E> siguiente; // Referencia al siguiente nodo
    
    Nodo(E dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
```

### 🎨 Visualización de Nodos Conectados

```
    Nodo 1              Nodo 2              Nodo 3
┌─────────────┐    ┌─────────────┐    ┌─────────────┐
│ dato: "A"   │    │ dato: "B"   │    │ dato: "C"   │
│ siguiente: ●┼───▶│ siguiente: ●┼───▶│ siguiente: ●┼───▶ null
└─────────────┘    └─────────────┘    └─────────────┘
```

---

## 🆚 ArrayList vs LinkedList - Comparación Detallada

### 📊 Tabla Comparativa

| Operación | ArrayList | LinkedList | Ganador |
|-----------|-----------|------------|---------|
| **Acceso por índice** `get(index)` | O(1) - Directo | O(n) - Recorrido | 🏆 ArrayList |
| **Agregar al final** `add(elemento)` | O(1) amortizado | O(1) | 🤝 Empate |
| **Agregar al inicio** `add(0, elemento)` | O(n) - Desplazar | O(1) - Cambiar ref | 🏆 LinkedList |
| **Agregar en medio** `add(index, elemento)` | O(n) - Desplazar | O(n) - Buscar + O(1) | 🏆 LinkedList (si ya tienes el nodo) |
| **Eliminar al final** `remove(size-1)` | O(1) | O(n) - Recorrer | 🏆 ArrayList |
| **Eliminar al inicio** `remove(0)` | O(n) - Desplazar | O(1) - Cambiar ref | 🏆 LinkedList |
| **Buscar elemento** `contains(elemento)` | O(n) | O(n) | 🤝 Empate |
| **Uso de memoria** | Menos memoria | Más memoria (refs) | 🏆 ArrayList |
| **Iteración** | Más rápida (cache) | Más lenta (saltos) | 🏆 ArrayList |

---

### 🔍 Análisis por Caso de Uso

#### 🎯 Usa **ArrayList** cuando:

- ✅ Necesitas acceso frecuente por índice
- ✅ La mayoría de operaciones son lecturas
- ✅ Agregas elementos solo al final
- ✅ La lista es pequeña/mediana
- ✅ Quieres menor uso de memoria

**Ejemplo:**
```java
// Caso ideal para ArrayList
List<String> nombres = new ArrayList<>();
nombres.add("Ana");    // O(1) - al final
nombres.add("Juan");   // O(1) - al final
nombres.add("Pedro");  // O(1) - al final

String segundo = nombres.get(1); // O(1) - acceso directo
```

---

#### 🎯 Usa **LinkedList** cuando:

- ✅ Insertas/eliminas frecuentemente al inicio
- ✅ Insertas/eliminas frecuentemente en medio (con iterador)
- ✅ No necesitas acceso por índice
- ✅ Implementas una cola (Queue) o deque (Deque)
- ✅ El tamaño de la lista cambia constantemente

**Ejemplo:**
```java
// Caso ideal para LinkedList
LinkedList<String> cola = new LinkedList<>();
cola.addFirst("Primero");  // O(1) - al inicio
cola.addFirst("Nuevo primero"); // O(1) - al inicio
cola.removeLast(); // O(1) - desde el final

// Como cola (Queue)
cola.offer("Persona 1"); // Agregar al final
String atendido = cola.poll(); // Remover del inicio
```

---

## 🚀 Operaciones Comunes en LinkedList

### 📝 Crear una LinkedList

```java
import java.util.LinkedList;
import java.util.List;

// Forma 1: Como List (interfaz)
List<String> lista = new LinkedList<>();

// Forma 2: Como LinkedList (clase concreta - más métodos)
LinkedList<String> listaEnlazada = new LinkedList<>();
```

---

### ➕ Agregar Elementos

```java
LinkedList<String> lista = new LinkedList<>();

// Al final
lista.add("A");           // [A]
lista.add("B");           // [A, B]
lista.addLast("C");       // [A, B, C]

// Al inicio
lista.addFirst("Z");      // [Z, A, B, C]

// En posición específica
lista.add(2, "X");        // [Z, A, X, B, C]
```

**Visualización:**
```
Inicial:  Z ─→ A ─→ B ─→ C
                ↓
Agregar X en posición 2:
          Z ─→ A ─→ X ─→ B ─→ C
```

---

### ❌ Eliminar Elementos

```java
LinkedList<String> lista = new LinkedList<>();
lista.add("A");
lista.add("B");
lista.add("C");
lista.add("D");

// Eliminar por índice
lista.remove(1);          // Elimina "B" → [A, C, D]

// Eliminar por objeto
lista.remove("C");        // Elimina "C" → [A, D]

// Eliminar primero/último
lista.removeFirst();      // Elimina "A" → [D]
lista.removeLast();       // Elimina "D" → []
```

---

### 🔍 Acceder a Elementos

```java
LinkedList<String> lista = new LinkedList<>();
lista.add("A");
lista.add("B");
lista.add("C");

// Por índice (lento en LinkedList)
String elemento = lista.get(1);  // "B" - O(n)

// Primero y último (rápido)
String primero = lista.getFirst();  // "A" - O(1)
String ultimo = lista.getLast();    // "C" - O(1)

// Mirar sin remover
String peek = lista.peek();         // "A" - O(1)
String peekFirst = lista.peekFirst(); // "A" - O(1)
String peekLast = lista.peekLast();   // "C" - O(1)
```

---

## 💡 Ejemplo Práctico Completo

### 🎮 Sistema de Cola de Jugadores

```java
import java.util.LinkedList;

public class EjemploColaJugadores {
    public static void main(String[] args) {
        // LinkedList es perfecta para implementar colas
        LinkedList<String> colaJugadores = new LinkedList<>();
        
        System.out.println("=== Sistema de Cola de Jugadores ===\n");
        
        // Jugadores llegan y se forman (agregar al final)
        colaJugadores.offer("Jugador1");
        colaJugadores.offer("Jugador2");
        colaJugadores.offer("Jugador3");
        colaJugadores.offer("Jugador4");
        
        System.out.println("Cola inicial: " + colaJugadores);
        // [Jugador1, Jugador2, Jugador3, Jugador4]
        
        // Un jugador VIP llega (agregar al inicio)
        colaJugadores.offerFirst("JugadorVIP");
        System.out.println("Después de VIP: " + colaJugadores);
        // [JugadorVIP, Jugador1, Jugador2, Jugador3, Jugador4]
        
        // Atender jugadores (remover del inicio)
        System.out.println("\n--- Atendiendo jugadores ---");
        while (!colaJugadores.isEmpty()) {
            String atendido = colaJugadores.poll();
            System.out.println("Atendiendo: " + atendido);
            System.out.println("Quedan: " + colaJugadores);
        }
    }
}
```

**Salida:**
```
=== Sistema de Cola de Jugadores ===

Cola inicial: [Jugador1, Jugador2, Jugador3, Jugador4]
Después de VIP: [JugadorVIP, Jugador1, Jugador2, Jugador3, Jugador4]

--- Atendiendo jugadores ---
Atendiendo: JugadorVIP
Quedan: [Jugador1, Jugador2, Jugador3, Jugador4]
Atendiendo: Jugador1
Quedan: [Jugador2, Jugador3, Jugador4]
Atendiendo: Jugador2
Quedan: [Jugador3, Jugador4]
Atendiendo: Jugador3
Quedan: [Jugador4]
Atendiendo: Jugador4
Quedan: []
```

---

### 📚 Ejemplo: Historial de Navegación

```java
import java.util.LinkedList;

public class EjemploHistorial {
    public static void main(String[] args) {
        LinkedList<String> historial = new LinkedList<>();
        
        // Agregar páginas visitadas
        historial.addFirst("google.com");
        historial.addFirst("youtube.com");
        historial.addFirst("github.com");
        historial.addFirst("stackoverflow.com");
        
        System.out.println("Historial (más reciente primero):");
        System.out.println(historial);
        // [stackoverflow.com, github.com, youtube.com, google.com]
        
        // Ver página actual (última visitada)
        System.out.println("\nPágina actual: " + historial.peekFirst());
        // stackoverflow.com
        
        // Retroceder en el historial
        String paginaActual = historial.removeFirst();
        System.out.println("\nRetrocediendo de: " + paginaActual);
        System.out.println("Nueva página: " + historial.peekFirst());
        // github.com
        
        // Límite de historial (mantener solo 3)
        while (historial.size() > 3) {
            String eliminada = historial.removeLast();
            System.out.println("Eliminando del historial: " + eliminada);
        }
        
        System.out.println("\nHistorial final: " + historial);
    }
}
```

---

## 🎨 Visualización Paso a Paso: Insertar en Medio

Veamos cómo **LinkedList** inserta un elemento en medio:

### Ejemplo: Insertar "X" entre "B" y "C"

**Estado inicial:**
```
head
 ↓
[A] ──→ [B] ──→ [C] ──→ [D] ──→ null
```

**Paso 1:** Recorrer hasta la posición deseada
```
head
 ↓
[A] ──→ [B] ──→ [C] ──→ [D] ──→ null
         ↑
      posición actual
```

**Paso 2:** Crear nuevo nodo
```
         [X] (nuevo nodo)
```

**Paso 3:** Redirigir referencias
```
head
 ↓
[A] ──→ [B] ──╮
             ↓
            [X] ──→ [C] ──→ [D] ──→ null
```

**Resultado final:**
```
head
 ↓
[A] ──→ [B] ──→ [X] ──→ [C] ──→ [D] ──→ null
```

**Código:**
```java
LinkedList<String> lista = new LinkedList<>();
lista.add("A");
lista.add("B");
lista.add("C");
lista.add("D");

lista.add(2, "X"); // Insertar en posición 2
// Resultado: [A, B, X, C, D]
```

---

## 🔄 LinkedList como Deque (Double-Ended Queue)

**LinkedList** implementa la interfaz **Deque**, lo que permite operaciones en ambos extremos:

```java
import java.util.LinkedList;
import java.util.Deque;

public class EjemploDeque {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        
        // Agregar en ambos extremos
        deque.addFirst("A");   // [A]
        deque.addLast("B");    // [A, B]
        deque.addFirst("Z");   // [Z, A, B]
        deque.addLast("C");    // [Z, A, B, C]
        
        System.out.println("Deque: " + deque);
        
        // Remover de ambos extremos
        String primero = deque.removeFirst(); // "Z"
        String ultimo = deque.removeLast();   // "C"
        
        System.out.println("Después de remover: " + deque);
        // [A, B]
    }
}
```

---

## ⚠️ Errores Comunes con LinkedList

### ❌ Error 1: Usar get(index) en bucles

```java
// ❌ MUY INEFICIENTE (O(n²))
LinkedList<String> lista = new LinkedList<>();
// ... agregar elementos ...

for (int i = 0; i < lista.size(); i++) {
    System.out.println(lista.get(i)); // Cada get() es O(n)
}
```

**Solución:**
```java
// ✅ EFICIENTE (O(n))
for (String elemento : lista) {
    System.out.println(elemento);
}

// O usar un iterador
Iterator<String> iterator = lista.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

---

### ❌ Error 2: Usar LinkedList cuando ArrayList es mejor

```java
// ❌ Mal uso de LinkedList
LinkedList<Integer> numeros = new LinkedList<>();
for (int i = 0; i < 1000; i++) {
    numeros.add(i); // Solo agregando al final
}
// Luego acceso frecuente por índice
int valor = numeros.get(500); // O(n) - lento
```

**Solución:**
```java
// ✅ Usar ArrayList para este caso
ArrayList<Integer> numeros = new ArrayList<>();
for (int i = 0; i < 1000; i++) {
    numeros.add(i); // O(1) amortizado
}
int valor = numeros.get(500); // O(1) - rápido
```

---

## 📊 Métodos Exclusivos de LinkedList

LinkedList tiene métodos que **NO** están en ArrayList:

```java
LinkedList<String> lista = new LinkedList<>();
lista.add("A");
lista.add("B");
lista.add("C");

// Métodos de Queue (cola)
lista.offer("D");        // Agrega al final (como add)
String primero = lista.poll();  // Remueve y retorna primero (o null si vacío)
String peek = lista.peek();     // Mira primero sin remover (o null si vacío)

// Métodos de Deque (doble cola)
lista.offerFirst("Z");   // Agrega al inicio
lista.offerLast("Y");    // Agrega al final
lista.pollFirst();       // Remueve del inicio
lista.pollLast();        // Remueve del final
lista.peekFirst();       // Mira inicio sin remover
lista.peekLast();        // Mira final sin remover

// Métodos de Stack (pila)
lista.push("X");         // Agrega al inicio (como addFirst)
String top = lista.pop(); // Remueve y retorna del inicio (lanza excepción si vacío)
```

---

## 🎓 Resumen Final

### 🔑 Conceptos Clave

| Concepto | Descripción |
|----------|-------------|
| **Nodo** | Elemento básico con dato y referencia al siguiente |
| **Head** | Referencia al primer nodo de la lista |
| **Tail** | Referencia al último nodo de la lista |
| **Enlace/Referencia** | Puntero que conecta un nodo con el siguiente |
| **O(1)** | Operación de tiempo constante (rápida) |
| **O(n)** | Operación de tiempo lineal (proporcional al tamaño) |

---

### ✅ Ventajas de LinkedList

- ✅ Inserción/eliminación en inicio: **O(1)**
- ✅ Inserción/eliminación con iterador: **O(1)**
- ✅ No necesita redimensionamiento (como ArrayList)
- ✅ Excelente para implementar Colas y Pilas
- ✅ Puede crecer dinámicamente sin desperdicio de memoria

---

### ❌ Desventajas de LinkedList

- ❌ Acceso por índice: **O(n)** (lento)
- ❌ Más memoria por elemento (dato + referencia)
- ❌ Mala localidad de caché (nodos dispersos)
- ❌ Iteración más lenta que ArrayList
- ❌ No thread-safe (usar Collections.synchronizedList si es necesario)

---

### 🎯 Cuándo Usar Cada Una

```
┌─────────────────────────────────────────────┐
│         ¿Qué operación es más común?        │
└─────────────────────────────────────────────┘
                    │
        ┌───────────┴───────────┐
        ↓                       ↓
   Acceso por índice      Insertar/Eliminar
    get(index)            al inicio/medio
        │                       │
        ↓                       ↓
    ArrayList               LinkedList
        
        
┌─────────────────────────────────────────────┐
│       ¿Necesitas comportamiento de cola?    │
└─────────────────────────────────────────────┘
                    │
                    ↓
                   Sí
                    │
                    ↓
              LinkedList
          (implementa Deque)
```

---

### 💻 Código de Referencia Rápida

```java
import java.util.LinkedList;

LinkedList<String> lista = new LinkedList<>();

// Agregar
lista.add("A");              // Al final
lista.addFirst("Z");         // Al inicio
lista.addLast("C");          // Al final (explícito)
lista.add(1, "B");           // En posición específica

// Remover
lista.remove(0);             // Por índice
lista.remove("A");           // Por objeto
lista.removeFirst();         // Primero
lista.removeLast();          // Último

// Acceder
String primero = lista.getFirst();  // Primer elemento
String ultimo = lista.getLast();    // Último elemento
String elemento = lista.get(2);     // Por índice (lento)

// Como cola
lista.offer("X");            // Agregar al final
String atendido = lista.poll();    // Remover del inicio
String siguiente = lista.peek();   // Ver inicio sin remover

// Verificar
boolean vacia = lista.isEmpty();
int tamaño = lista.size();
boolean contiene = lista.contains("A");
```

---

## 🚀 Ejemplo Final Integrador

```java
import java.util.LinkedList;
import java.util.Iterator;

public class EjemploCompletoLinkedList {
    public static void main(String[] args) {
        // Crear lista enlazada
        LinkedList<String> tareas = new LinkedList<>();
        
        // Agregar tareas
        tareas.add("Comprar leche");
        tareas.add("Estudiar Java");
        tareas.add("Hacer ejercicio");
        
        System.out.println("Lista de tareas: " + tareas);
        
        // Agregar tarea urgente al inicio
        tareas.addFirst("¡URGENTE! Llamar al doctor");
        System.out.println("Con urgente: " + tareas);
        
        // Completar primera tarea
        String completada = tareas.removeFirst();
        System.out.println("Completada: " + completada);
        System.out.println("Tareas restantes: " + tareas);
        
        // Iterar con Iterator (forma correcta)
        System.out.println("\nIterando con Iterator:");
        Iterator<String> iterator = tareas.iterator();
        int numero = 1;
        while (iterator.hasNext()) {
            System.out.println(numero++ + ". " + iterator.next());
        }
        
        // Ver siguiente tarea sin remover
        System.out.println("\nSiguiente tarea: " + tareas.peekFirst());
        
        // Tamaño
        System.out.println("Total de tareas: " + tareas.size());
    }
}
```

**Salida:**
```
Lista de tareas: [Comprar leche, Estudiar Java, Hacer ejercicio]
Con urgente: [¡URGENTE! Llamar al doctor, Comprar leche, Estudiar Java, Hacer ejercicio]
Completada: ¡URGENTE! Llamar al doctor
Tareas restantes: [Comprar leche, Estudiar Java, Hacer ejercicio]

Iterando con Iterator:
1. Comprar leche
2. Estudiar Java
3. Hacer ejercicio

Siguiente tarea: Comprar leche
Total de tareas: 3
```

---

## 📚 Referencias Oficiales

- [Documentación Oracle - LinkedList](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/LinkedList.html)
- [Documentación Oracle - Deque](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Deque.html)
- [Documentación Oracle - Queue](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Queue.html)
