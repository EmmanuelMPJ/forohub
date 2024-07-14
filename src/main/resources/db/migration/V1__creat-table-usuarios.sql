create table usuarios(

    id bigint not null auto_increment,
    nombre varchar(140) not null,
    email varchar(100) not null unique,
    contrasena varchar(200) not null,

    primary key(id)

);

-- Insertar un usuario por defecto
INSERT INTO usuarios (nombre, email, contrasena) VALUES ('NombreExample', 'admin@example.com', '$2a$10$ry9ZbP5wH8WrapkzNzoOPuvmoEIJeVegNDM0aw3g0FsJgR6Lh3pRe');
