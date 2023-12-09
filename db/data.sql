select * from curso;


INSERT INTO confiedy_ui.universidad
(id,descripcion, estado, nombre)
VALUES(1,"La universidad más cara del Perú", 1, "PUCP");

INSERT INTO confiedy_ui.universidad
(id,descripcion, estado, nombre)
VALUES(2,"La universidad menos cara del Perú", 1, "UPC");

INSERT INTO confiedy_ui.universidad
(id,descripcion, estado, nombre)
VALUES(3,"La universidad que ensena muy bien", 1, "Universidad de Lima");



-- CURSOS PUCP

INSERT INTO confiedy_ui.curso
(id,ciclo, codigo, descripcion, duracion, imagen_curso, maximo_estudiantes, nombre, universidad_id)
VALUES(1,"1","MAT01", "El curso permitirá a los estudiantes reconocer la importancia de las matemáticas en diversas actividades de la vida cotidiana, así como en distintos campos del conocimiento y contribuirá a desarrollar el razonamiento lógico. Esto se hará a través de situaciones que correspondan a contextos propios de las distintas especialidades y cuyo análisis requiera del empleo de conceptos matemáticos fundamentales.", "4 horas", "https://www.confiedy.com/images/courses/courses2.jpg", "5", "Matemática Básica", 1);

INSERT INTO confiedy_ui.curso
(id,ciclo, codigo, descripcion, duracion, imagen_curso, maximo_estudiantes, nombre, universidad_id)
VALUES(2,"1","MATECO01", "Este curso abarca los siguientes temas: sistema de números reales, relaciones y funciones. Funciones de una variable, concepto de límite; tasa de cambio y derivadas, derivada y pendiente de una curva, teoremas sobre límites; continuidad y diferenciabilidad de funciones, reglas de diferenciación.", "4 horas", "https://www.confiedy.com/images/courses/courses2.jpg", "5", "Matemática para Economía y Finanzas I", 1);

INSERT INTO confiedy_ui.curso
(id,ciclo, codigo, descripcion, duracion, imagen_curso, maximo_estudiantes, nombre, universidad_id)
VALUES(3,"1","MATEFI", "Se estudia el valor del dinero en el tiempo, el valor presente y valor futuro, el interés simple y compuesto, la tasa de interés nominal y efectiva, las anualidades y perpetuidades, los sistemas de amortización de préstamos, las operaciones activas y pasivas, el valor presente neto y tasa interna de retorno, y la evaluación de opciones de inversión y financiación, entre otros temas de interés.", "4 horas", "https://www.confiedy.com/images/courses/courses1.jpg", "5", "Matemática Financiera", 1);

INSERT INTO confiedy_ui.curso
(id,ciclo, codigo, descripcion, duracion, imagen_curso, maximo_estudiantes, nombre, universidad_id)
VALUES(4,"1","INTROEST", "El curso presenta las bases formales de los modelos probabilísticos asociados con el análisis estadístico de datos y luego introduce al alumno en el uso de estos modelos para la toma de decisiones en condiciones de incertidumbre con datos provenientes de muestras, aplicando técnicas estadísticas descriptivas e inferenciales. Se estudia el muestreo, estadísticas de tendencia central y de dispersión; números índice e introducción a las series de tiempo.", "4 horas", "https://www.confiedy.com/images/courses/courses1.jpg", "5", "Introducción a la Estadística y Probabilidad", 1);

INSERT INTO confiedy_ui.curso
(id,ciclo, codigo, descripcion, duracion, imagen_curso, maximo_estudiantes, nombre, universidad_id)
VALUES(5,"1","ESTAD", "Presenta al estudiante las técnicas estadísticas elementales adiestrándolo en su uso, de modo que pueda aplicarlas al proceso de convertir datos numéricos aislados en información, para la toma de decisiones. Se revisan los métodos estadísticos descriptivos e inferenciales comunes a las diferentes especialidades que constituyen los Estudios Generales Letras, sentando las bases para cursos posteriores más avanzados.", "4 horas", "https://www.confiedy.com/images/courses/courses1.jpg", "5", "Introducción a la Estadística y Probabilidad", 1);



-- CURSOS UNIVERSIDAD DE LIMA

INSERT INTO confiedy_ui.curso
(id,ciclo, codigo, descripcion, duracion, imagen_curso, maximo_estudiantes, nombre, universidad_id)
VALUES(100,"1","CAL01", "La asignatura tiene como propósito desarrollar tanto las habilidades orientadas al razonamiento lógico como las competencias para el análisis, la abstracción, la generalización y la asociación dirigidas a la solución de problemas relacionados con la Ingeniería, mediante el uso del cálculo diferencial e integral en una variable real. Comprende el estudio de: funciones trigonométricas, límites y continuidad de funciones, derivadas de funciones, aplicaciones de la derivada, integral indefinida de una función.", "4 horas", "https://www.confiedy.com/images/courses/courses2.jpg", "5", "Cálculo I", 3);

INSERT INTO confiedy_ui.curso
(id,ciclo, codigo, descripcion, duracion, imagen_curso, maximo_estudiantes, nombre, universidad_id)
VALUES(101,"1","MATBAS01", "La asignatura desarrolla en los estudiantes tanto las habilidades orientadas al pensamiento lógicocomo las competencias para el análisis, la abstracción, la generalización y la asociación dirigidasa la solución de problemas. Comprende el estudio del sistema de los números reales, la recta enel plano, cónicas y funciones reales.", "4 horas", "https://www.confiedy.com/images/courses/courses1.jpg", "5", "Matemática Básica", 3);

INSERT INTO confiedy_ui.curso
(id,ciclo, codigo, descripcion, duracion, imagen_curso, maximo_estudiantes, nombre, universidad_id)
VALUES(102,"1","MATAPLI", "La asignatura tiene como propósito desarrollar las habilidades orientadas al razonamiento lógico, las competencias para el análisis, la abstracción, la generalización y la síntesis dirigidas a la solución de problemas del cálculo diferencial e integral de funciones reales de variable real, relacionados con el campo de los negocios. Comprende el estudio de: construcción de modelos matemáticos y límites, la derivada y sus aplicaciones, funciones trascendentes, la integral y sus aplicaciones a los negocios.", "4 horas", "https://www.confiedy.com/images/courses/courses2.jpg", "5", "Matemática Básica", 3);



-- CURSOS UPC

INSERT INTO confiedy_ui.curso
(id,ciclo, codigo, descripcion, duracion, imagen_curso, maximo_estudiantes, nombre, universidad_id)
VALUES(200,"1","MATECO01", "Este curso abarca los siguientes temas: sistema de números reales, relaciones y funciones. Funciones de una variable, concepto de límite; tasa de cambio y derivadas, derivada y pendiente de una curva, teoremas sobre límites; continuidad y diferenciabilidad de funciones, reglas de diferenciación.", "4 horas", "https://www.confiedy.com/images/courses/courses1.jpg", "5", "Mateco Básica", 3);


-- DOCENTES

INSERT INTO confiedy_ui.docente
(id,nombre, imagen_perfil, numero_estrellas, horas_dictadas)
VALUES(1,'Juan Carlos Minaya', 'https://www.confiedy.com/images/juan_minaya.jpeg', 4, 50);

INSERT INTO confiedy_ui.docente
(id,nombre, imagen_perfil, numero_estrellas, horas_dictadas)
VALUES(2,'Gino Bonilla', 'https://www.confiedy.com/images/gino.jpeg', 5, 80);

INSERT INTO confiedy_ui.docente
(id,nombre, imagen_perfil, numero_estrellas, horas_dictadas)
VALUES(3,'Giovani Morales', 'https://www.confiedy.com/images/giovanni.jpeg', 4, 50);

INSERT INTO confiedy_ui.docente
(id,nombre, imagen_perfil, numero_estrellas, horas_dictadas)
VALUES(4,'Aarón Diaz', 'https://www.confiedy.com/images/aaron_diaz.jpeg', 4, 60);


-- Docente Curso

-- Juancarlos -> Mate Basica

INSERT INTO confiedy_ui.docente_curso
(docente_id, curso_id, estado)
VALUES(1, 1, 1);

-- Juancarlos -> Mate Basica

INSERT INTO confiedy_ui.docente_curso
(docente_id, curso_id, estado)
VALUES(1, 2, 1);


INSERT INTO confiedy_ui.docente_curso
(docente_id, curso_id, estado)
VALUES(1, 200, 1);

INSERT INTO confiedy_ui.docente_curso
(docente_id, curso_id, estado)
VALUES(2, 2, 1);


INSERT INTO confiedy_ui.docente_curso
(docente_id, curso_id, estado)
VALUES(2, 3, 1);

INSERT INTO confiedy_ui.docente_curso
(docente_id, curso_id, estado)
VALUES(2, 102, 1);


INSERT INTO confiedy_ui.docente_curso
(docente_id, curso_id, estado)
VALUES(3, 1, 1);


INSERT INTO confiedy_ui.docente_curso
(docente_id, curso_id, estado)
VALUES(3, 100, 1);

INSERT INTO confiedy_ui.docente_curso
(docente_id, curso_id, estado)
VALUES(2, 200, 1);


INSERT INTO confiedy_ui.docente_curso
(docente_id, curso_id, estado)
VALUES(4, 200, 1);

INSERT INTO confiedy_ui.docente_curso
(docente_id, curso_id, estado)
VALUES(4, 100, 1);
