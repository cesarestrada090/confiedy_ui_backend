CREATE TABLE universidad (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255) NOT NULL,
    estado INT
);

-- Crear la tabla para cursos
CREATE TABLE curso (
    id INT AUTO_INCREMENT PRIMARY KEY,
    codigo_curso VARCHAR(255) NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    descripcion VARCHAR(2255) NOT NULL,
    imagen_curso VARCHAR(255) NOT NULL,
    ciclo varchar(10),
    duracion varchar(50),
    maximo_estudiantes varchar(50),
    universidad_id INT,
    estado INT,
    FOREIGN KEY (universidad_id) REFERENCES universidad(id)
);

-- Crear la tabla para docentes
CREATE TABLE docente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    imagenPerfil VARCHAR(255) NOT NULL,
    numero_estrellas INT,
    horas_dictadas INT
);

-- Crear la tabla de relación entre docentes y cursos (muchos a muchos)
CREATE TABLE docente_curso (
    docente_id INT,
    curso_id INT,
    estado INT,
    PRIMARY KEY (docente_id, curso_id),
    FOREIGN KEY (docente_id) REFERENCES docente(id),
    FOREIGN KEY (curso_id) REFERENCES curso(id)
);

