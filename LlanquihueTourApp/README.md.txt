# Llanquihue Tour App - Módulo de Organización Modular

## Descripción del Sistema
Este sistema corresponde al módulo automatizado de gestión de personal diseñado para la agencia de turismo "Llanquihue Tour". Resuelve de forma directa la problemática de los procesos manuales, la duplicidad y los errores en los registros informativos mediante la carga e interpretación dinámica de datos almacenados en archivos planos (`.txt`). La aplicación asegura la integridad de la información implementando validaciones robustas mediante bloques de control de excepciones corporativos.

## Estructura de Paquetes y Clases
La solución se encuentra modularizada de manera profesional bajo el estándar de capas limpias:

- **`model`**: Contiene la clase de negocio `Empleado.java`, la cual encapsula los atributos esenciales de los colaboradores bajo reglas estrictas de visibilidad y validación.
- **`util`**: Actúa como librería interna mediante `LectorArchivo.java`, manejando flujos de E/S (`BufferedReader`) y el procesamiento seguro (`try-catch`) de las cadenas de caracteres.
- **`service`**: Capa lógica a través de `EmpleadoService.java` enfocada en el procesamiento centralizado de la colección dinámica (`ArrayList`), proveyendo las tareas automatizadas de búsqueda y recorrido.
- **`app`**: Punto inicial donde reside `Main.java`, encargada del arranque ordenado del ecosistema.

## Instrucciones para Ejecutar el Programa
1. Clone o descargue el repositorio dentro de su entorno local.
2. Abra el proyecto utilizando **IntelliJ IDEA**.
3. Verifique que la estructura del directorio raíz posea la carpeta `resources/` conteniendo de forma íntegra el archivo de texto estructurado `colaboradores.txt`.
4. Diríjase a la ruta del código fuente: `src/app/Main.java`.
5. Presione el control **Run** de su IDE o utilice la combinación nativa `Shift + F10` para inicializar el módulo y desplegar los reportes automatizados por consola.