# Forohub

Un foro es un espacio donde todos los participantes de una plataforma pueden plantear sus preguntas sobre determinados tópicos. Los estudiantes utilizan el foro para sacar sus dudas sobre los cursos y proyectos en los que participan.

La aplicación trata de mostrar como se realizan los procesos de un foro detrás de escena, por esto se va a replicar este proceso a nivel de back end y, para eso, se creará una API REST usando Spring.

La API se centrará específicamente en los tópicos, y debe permitir a los usuarios:

- Crear un nuevo tópico.
- Mostrar todos los tópicos creados.
- Mostrar un tópico específico.
- Actualizar un tópico.
- Eliminar un tópico.

# Tecnologías utilizadas
- Java

- Spring Boot

- Flyway (Para migraciones de la base de datos)

- Spring Security

- JWT (JSON Web Tokens)

- JPA (Java Persistence API)

- MySQL database

- Insomnia (para pruebas de API)

# :hammer:Funcionalidades del proyecto
- `autenticación de usuarios`: Este proceso recibe un JSON con el nombre y la contraseña. La aplicación crea un usuario por defecto con nombre: NombreExample y contrasena: 123456.
- `Autenticación mediante JWT`: Las siguientes características deberan enviar un token en el header, el cual debió de haber sido entregado en el paso anterior.
- `Registro de tópicos.`: Se debe enviar un idUsuario, un titulo, un mensaje y el nombre de un curso para guardar el tópico en la base de datos. (no pueden haber tópicos duplicados)
- `Actualizacion de tópicos`: Se debe enviar el id del tópico que se quiera actualizar, un título, un mensaje y un estado (SOLUCIONADO, CERRADO, SIN_RESPUESTA o SIN_SOLUCION). No será posible de duplicar un tópico mediante este metodo
- `Eliminación de tópicos`: Se pasa mediante la URL el ID del tópico que se quiera eliminar.
- `Listado de tópicos`: Se listan todos los topicos que se hayan registrado en la base de datos.
- `Obtención de un tópico especifico`: Se pasa mediante la URL el ID del tópico que se quiera visualizar.

# Cómo usar
1. Clona el repositorio localmente.
2. Abre el proyecto en tu IDE de Java o editor de texto.
3. Ejecuta la aplicación ForohubApplication.
5. Abrir insomnia para realizar las requests.
6. Logearse dandole a "send" y copiar el token que aparece en el lado derecho como se observa en la imagen.
[![Screenshot-2024-07-14-050359.png](https://i.postimg.cc/6QrnQtWw/Screenshot-2024-07-14-050359.png)](https://postimg.cc/7CLfsvJQ)
7. Para hacer uso de cada metodo se debe pasar el token, para esto en la pestaña Auth se elige Bearer token en el desplegable que se ve y se pega el token obtenido en la caja de texto correspondiente.
[![Screenshot-2024-07-14-050933.png](https://i.postimg.cc/bwPMm06R/Screenshot-2024-07-14-050933.png)](https://postimg.cc/xcstCmVk)
8. Para listar los topicos aplique el paso 7 e ingrese el JSON de la izquierda y obtendra el JSON de la derecha.
[![Screenshot-2024-07-14-051733.png](https://i.postimg.cc/TwW1tXwF/Screenshot-2024-07-14-051733.png)](https://postimg.cc/JDMRhvj5)
9. Para actualizar un tópico aplique el paso 7 e ingrese el JSON de la izquierda y obtendra el JSON de la derecha. En el JSON que se envía solo es obligatorio el ID del tópico.
[![Screenshot-2024-07-14-052325.png](https://i.postimg.cc/DfN3jSDM/Screenshot-2024-07-14-052325.png)](https://postimg.cc/z3TQ3GqC)
10. Para eliminar ingrese el ID del tópico que desea eliminar en la URL, este es un delete lógico, por lo que no se eliminara de la base de datos si no que cambiara un estados a falso para "desactivar" el registro.
[![Screenshot-2024-07-14-052717.png](https://i.postimg.cc/C1fX9N9r/Screenshot-2024-07-14-052717.png)](https://postimg.cc/gXmgZvz3)
11. Para listar los topicos registrados solo es necesario dar click en send en el metodo correspondiente, como se observa no se ve el tópico 1 pues en este metodo solo se listan los tópicos con estados activo.
[![Screenshot-2024-07-14-053110.png](https://i.postimg.cc/XvnDsWgJ/Screenshot-2024-07-14-053110.png)](https://postimg.cc/18YHzL2h)
12. Para obtener un tópico especifico ingrese el ID del tópico que desea consultar en la URL.
[![Screenshot-2024-07-14-053513.png](https://i.postimg.cc/pL059Yyd/Screenshot-2024-07-14-053513.png)](https://postimg.cc/FYLH8Syt)

# Autor
[<img src="https://avatars.githubusercontent.com/u/168949963?v=4" width=115><br><sub>Emmanuel Paternina</sub>](https://github.com/EmmanuelMPJ)
