# Evaluación Final Transversal (EFT) - Llanquihue Tour

## Descripción General
Prototipo de software orientado a objetos para la agencia de turismo "Llanquihue Tour". El sistema digitaliza la gestión de clientes y guías turísticos resolviendo problemáticas de datos aislados mediante un diseño modular, permitiendo la lectura de datos desde archivos de texto y la persistencia en memoria mediante colecciones.

## Características y Principios POO Aplicados
- **Modularidad:** Código dividido en paquetes (`model`, `data`, `utils`, `app`).
- **Encapsulamiento y Composición:** Atributos privados y clases que contienen otras (Ej: `Persona` contiene `Rut`).
- **Manejo de Excepciones:** `RutInvalidoException` para validar integridad de datos.
- **Herencia e Interfaces:** `Cliente` y `GuiaTuristico` heredan de `Persona` e implementan la interfaz `Registrable`.
- **Colecciones y Polimorfismo:** Uso de `ArrayList<Registrable>` y filtrado dinámico mediante el operador `instanceof`.
- **Lectura de Archivos:** Implementación de `BufferedReader` para poblar el sistema al iniciar mediante `datos.txt`.

## Instrucciones de Ejecución
1. Clonar el repositorio.
2. Abrir el proyecto en IntelliJ IDEA o NetBeans.
3. Asegurarse de que el archivo `datos.txt` esté ubicado en el directorio raíz del proyecto.
4. Ejecutar la clase `app.Main.java`.
5. Interactuar con los menús emergentes de Java Swing (JOptionPane).