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




