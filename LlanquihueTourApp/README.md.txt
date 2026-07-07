# Llanquihue Tour App - Semana 7

## Descripción de lo desarrollado en esta semana
En esta etapa del proyecto se integraron colecciones genéricas (`List` y `ArrayList`) para almacenar de forma dinámica los distintos servicios turísticos de la agencia. Además, se aplicó el principio de **Polimorfismo**, incorporando el método `mostrarInformacion()` en la superclase `ServicioTuristico` y sobrescribiéndolo (`@Override`) en las subclases `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural`. Esto permite recorrer la lista mediante una referencia de la superclase y que cada objeto ejecute su comportamiento específico.

## Instrucciones para compilar y ejecutar el sistema
1. Abra el proyecto en IntelliJ IDEA.
2. Navegue al paquete `ui/` y ubique el archivo `Main.java`.
3. Ejecute la clase principal presionando "Run" (el ícono del triángulo verde).
4. En la consola se desplegará el catálogo completo de servicios. El bucle `for-each` recorrerá la lista y ejecutará el método `mostrarInformacion()` de forma polimórfica, mostrando los atributos específicos de cada tipo de servicio turístico.rito.