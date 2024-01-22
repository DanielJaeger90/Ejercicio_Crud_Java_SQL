
EJERCICIO CRUD


Funcionalidades
El programa permite realizar las siguientes operaciones a través de un menú interactivo:

Añadir Jugador: Permite al usuario ingresar información sobre un nuevo jugador, incluyendo nombre, equipo, número, y altura. La información se inserta en la base de datos utilizando JDBC.

Listar Jugadores: Muestra en la consola la información de todos los jugadores almacenados en la base de datos.

Borrar Jugador: Permite al usuario eliminar a un jugador específico de la base de datos.

Clase Jugadores
La clase Jugadores representa a un jugador y se utiliza para almacenar información como nombre, equipo, número, altura e ID. Se utiliza en las operaciones de inserción y consulta de jugadores.

Base de Datos
El programa se conecta a una base de datos SQLite ubicada en la ruta especificada en el código. Utiliza consultas SQL para insertar, consultar y borrar jugadores en la tabla Jugadores.

Uso del Programa
El programa utiliza la biblioteca JOptionPane para la entrada y salida en una interfaz gráfica simple. Las operaciones son manejadas a través de un menú que se repite hasta que el usuario elige salir.

Notas Adicionales
El código maneja excepciones relacionadas con la conexión a la base de datos y la ejecución de consultas SQL.
La operación de listar jugadores (Listar Jugadores) muestra la información de los jugadores en la consola, pero actualmente no está integrada de manera efectiva en la interfaz gráfica.
