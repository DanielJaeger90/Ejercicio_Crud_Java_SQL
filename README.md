
EJERCICIO CRUD

Creación de la base de datos:

Utilizamos MySQL para crear una base de datos llamada basketball_db con tres tablas: jugadores, equipos, y estadisticas. Cada una con sus columnas correspondientes para almacenar la información necesaria.
Conexión a la base de datos:

Utilizamos JDBC para establecer una conexión con la base de datos basketball_db desde Java.
Operaciones CRUD:

Implementamos métodos en Java para realizar las operaciones CRUD:
a. Crear (Create):

Creamos métodos para insertar nuevos jugadores, equipos y estadísticas en sus respectivas tablas. Los datos pueden ser ingresados por el usuario o proporcionados como parámetros a los métodos.
b. Leer (Read):

Implementamos métodos para consultar y mostrar información de los jugadores, equipos y estadísticas almacenadas en la base de datos.
c. Actualizar (Update):

Creamos métodos para actualizar información de jugadores, equipos o estadísticas existentes en la base de datos. Estos métodos pueden solicitar al usuario los nuevos valores o recibirlos como parámetros.
d. Eliminar (Delete):

Implementamos métodos para eliminar jugadores, equipos o estadísticas de la base de datos.
Interfaz de usuario en consola:

Diseñamos una interfaz de usuario en consola que permite al usuario seleccionar qué operación CRUD desea realizar y proporcionar los datos necesarios.
Manejo de errores:

Implementamos manejo de excepciones para gestionar situaciones como datos ingresados incorrectamente, registros no encontrados o problemas de conexión a la base de datos.
Cierre de conexión:

Al finalizar todas las operaciones, cerramos la conexión JDBC para liberar recursos.

Notas Adicionales
El código maneja excepciones relacionadas con la conexión a la base de datos y la ejecución de consultas SQL.
La operación de listar jugadores (Listar Jugadores) muestra la información de los jugadores en la consola, pero actualmente no está integrada de manera efectiva en la interfaz gráfica.
