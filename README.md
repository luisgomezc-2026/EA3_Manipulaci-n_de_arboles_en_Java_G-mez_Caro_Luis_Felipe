# EA3_Manipulaci-n_de_arboles_en_Java_G-mez_Caro_Luis_Felipe
este es un código de manipulación de arboles en Java

# Tree-Stock: Sistema de Inventario

Un sistema de gestión de inventario por consola desarrollado en Java que implementa un **Árbol Binario de Búsqueda (ABB)**. 

Este proyecto académico fue creado para evaluar la capacidad de implementar estructuras de datos dinámicas manualmente (sin usar colecciones predefinidas), gestionar el enlace de punteros, trabajar en equipo y aplicar control de versiones colaborativo utilizando Git y GitHub.

---

## Estructura del Código

El proyecto sigue el principio de responsabilidad única y está dividido estrictamente en tres clases:

### 1. `Producto.java` (El Nodo)
Representa cada elemento dentro del árbol de inventario.
* **Datos:** `id` (identificador numérico único) y `nombre` del producto.
* **Punteros:** `izquierdo` (apunta a productos con un ID menor) y `derecho` (apunta a productos con un ID mayor).

### 2. `ArbolInventario.java` (La Lógica)
Contiene la raíz del árbol y las operaciones algorítmicas principales:
* **`insertar(id, nombre)`:** Método recursivo que ubica el producto en la posición correcta según su ID para mantener el árbol balanceado lógicamente. Evita IDs duplicados.
* **`mostrarInorden()`:** Recorre el árbol en orden (Izquierda -> Raíz -> Derecha) para imprimir el inventario ordenado de menor a mayor por ID.
* **`buscar(id)`:** Método que recorre las ramas descartando mitades para encontrar rápidamente si un producto existe en el inventario.

### 3. `Main.java` (La Interfaz)
Controlador principal que muestra un menú interactivo mediante consola. Usa un ciclo `while` y un bloque `switch-case` para permitir al usuario:
1. Registrar un nuevo producto.
2. Mostrar el inventario completo (ordenado).
3. Buscar un producto específico.
0. Salir del sistema.
