# Clase-4 : 🗂️🗂️ La interface Collection -  📚
# Clase-5 : 🗂️🗂️ Colecciones de Genericos-  📚

- La interface Collection es la raíz de la jerarquía de colecciones en Java.
- Proporciona métodos básicos para manipular colecciones, como agregar, eliminar 
- y verificar la presencia de elementos. Es una interfaz genérica que se puede 
- implementar con diferentes tipos de colecciones, como List, Set y Queue.

### Metodos -> 

Aquí está la información organizada en una tabla markdown con iconos:

| Método | Descripción |
|--------|-------------|
| ➕ `add()` | Agrega un elemento a la colección. Devuelve `true` si la colección cambió como resultado de la operación. |
| 🗑️ `clear()` | Elimina todos los elementos de la colección. |
| 🔍 `contains(Object o)` | Verifica si la colección contiene un elemento específico. Devuelve `true` si el elemento está presente. |
| 🔍 `containsAll(Collection<?> c)` | Verifica si la colección contiene todos los elementos de otra colección. Devuelve `true` si todos los elementos están presentes. |
| ⚖️ `equals(Object o)` | Compara la colección con otro objeto para determinar si son iguales. Devuelve `true` si ambos objetos son colecciones y contienen los mismos elementos. |
| #️⃣ `hashCode()` | Devuelve un código hash para la colección, que se puede usar en estructuras de datos basadas en hash. |
| ❓ `isEmpty()` | Verifica si la colección está vacía. Devuelve `true` si no contiene elementos. |
| 🔄 `iterator()` | Devuelve un iterador para recorrer los elementos de la colección. |
| ⚡ `parallelStream()` | Devuelve un Stream paralelo que contiene los elementos de la colección, lo que permite realizar operaciones de procesamiento en paralelo. |
| ➖ `remove(Object o)` | Elimina un elemento específico de la colección. Devuelve `true` si el elemento se eliminó correctamente. |
| ➖ `removeAll(Collection<?> c)` | Elimina todos los elementos de la colección que también están presentes en otra colección. Devuelve `true` si la colección cambió como resultado de la operación. |
| 🎯 `removeIf(Predicate<? super E> filter)` | Elimina todos los elementos de la colección que satisfacen el predicado dado. Devuelve `true` si se eliminó al menos un elemento. |
| 🔒 `retainAll(Collection<?> c)` | Conserva solo los elementos de la colección que también están presentes en otra colección. Devuelve `true` si la colección cambió como resultado de la operación. |
| 📊 `size()` | Devuelve el número de elementos en la colección. |
| ✂️ `spliterator()` | Devuelve un Spliterator para la colección, que se puede usar para recorrer los elementos de manera eficiente. |
| 🌊 `stream()` | Devuelve un Stream que contiene los elementos de la colección, lo que permite realizar operaciones de procesamiento en paralelo o secuencial. |
| 📦 `toArray()` | Devuelve un array que contiene todos los elementos de la colección. El tipo del array es `Object[]`. |
| 📦 `toArray(T[] a)` | Devuelve un array que contiene todos los elementos de la colección. Si el array proporcionado es lo suficientemente grande, se utiliza para almacenar los elementos; de lo contrario, se crea un nuevo array del mismo tipo. |

---

# Clase-6 : 🗂️🗂️ Interfaz List-  📚
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

# Clase-7 : 🗂️🗂️ Creacion de ArrayList y adicion de elementos-  📚
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html#method-summary








