# Llanquihue Tour App - Semana 6

## Objetivo de la semana
El propósito de esta etapa es modelar e implementar una jerarquía de clases utilizando el concepto de Herencia Simple. Se busca reutilizar código agrupando los atributos comunes en una clase base y especializando características propias en sus clases derivadas, sobrescribiendo los métodos correspondientes.

## Clases Creadas
El proyecto se organizó en 3 paquetes:
- **`model`**: 
  - `ServicioTuristico` (Superclase con atributos comunes).
  - `RutaGastronomica` (Subclase).
  - `PaseoLacustre` (Subclase).
  - `ExcursionCultural` (Subclase).
- **`data`**: 
  - `GestorServicios` (Clase encargada de instanciar objetos de prueba).
- **`ui`**: 
  - `Main` (Clase principal de ejecución).

## Instrucciones para ejecutar
1. Abrir el proyecto en IntelliJ IDEA.
2. Navegar al paquete `ui/` y abrir el archivo `Main.java`.
3. Ejecutar el código presionando el botón "Run" (triángulo verde).
4. La consola imprimirá los 6 servicios turísticos (2 de cada categoría) haciendo uso del método `toString()` sobrescrito.