-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3308
-- Tiempo de generación: 10-02-2023 a las 15:51:54
-- Versión del servidor: 8.0.27
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `escuela`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aula`
--

DROP TABLE IF EXISTS `aula`;
CREATE TABLE IF NOT EXISTS `aula` (
  `id` int NOT NULL AUTO_INCREMENT,
  `grado` varchar(20) NOT NULL,
  `seccion` varchar(12) NOT NULL,
  `horario` varchar(25) NOT NULL,
  `Dia` varchar(15) NOT NULL,
  `id_curso` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_curso` (`id_curso`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `aula`
--

INSERT INTO `aula` (`id`, `grado`, `seccion`, `horario`, `Dia`, `id_curso`) VALUES
(1, 'primero', 'A', ' 7:00 am - 8:00 am', 'Lunes', 1),
(2, 'primero', 'B', ' 8:00 am - 9:00 am', 'Lunes', 2),
(3, 'primero', 'C', ' 9:00 am - 10:00 am', 'Lunes', 3),
(4, 'segudo', 'A', ' 7:00 am - 8:00 am', 'Lunes', 4),
(5, 'segudo', 'B', ' 8:00 am - 9:00 am', 'Lunes', 5),
(6, 'segudo', 'C', ' 9:00 am - 10:00 am', 'Lunes', 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cursos`
--

DROP TABLE IF EXISTS `cursos`;
CREATE TABLE IF NOT EXISTS `cursos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `codigo` varchar(15) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `tiempo` varchar(30) NOT NULL,
  `id_usuario` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_usuario` (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `cursos`
--

INSERT INTO `cursos` (`id`, `codigo`, `nombre`, `tiempo`, `id_usuario`) VALUES
(1, '001', 'Español', '1 año', 2),
(2, '002', 'Matematica', '1 año', 2),
(3, '003', 'Sociales', '1 año', 2),
(4, '004', 'Ingles', '1 año', 3),
(5, '005', 'Fisica', '1 año', 3),
(6, '006', 'Educacion Fisica', '1 año', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

DROP TABLE IF EXISTS `estudiante`;
CREATE TABLE IF NOT EXISTS `estudiante` (
  `id` int NOT NULL AUTO_INCREMENT,
  `TipoDocumento` varchar(20) NOT NULL,
  `DNI` varchar(20) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Apellido` varchar(50) NOT NULL,
  `Telefono` varchar(11) NOT NULL,
  `Correo` varchar(30) NOT NULL,
  `Direccion` varchar(40) NOT NULL,
  `id_aula` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_aula` (`id_aula`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`id`, `TipoDocumento`, `DNI`, `Nombre`, `Apellido`, `Telefono`, `Correo`, `Direccion`, `id_aula`) VALUES
(1, 'cedula', '1143456321', 'James', 'Rodriguez', '300234211', 'james@gmail.com', 'calle 54-#45-90', 1),
(2, 'Cedula', '72148903', 'Camila', 'Miranda', '31256700', 'camila@gmail.com', 'calle 56 - #56- 78', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `periodo1`
--

DROP TABLE IF EXISTS `periodo1`;
CREATE TABLE IF NOT EXISTS `periodo1` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Periodo` varchar(11) NOT NULL,
  `examen_1` float NOT NULL,
  `examen_2` float NOT NULL,
  `examen_3` float NOT NULL,
  `apreciada` float NOT NULL,
  `Promedio` float NOT NULL,
  `Observacion` varchar(250) NOT NULL,
  `id_estudiante` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_estudiante` (`id_estudiante`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `periodo1`
--

INSERT INTO `periodo1` (`id`, `Periodo`, `examen_1`, `examen_2`, `examen_3`, `apreciada`, `Promedio`, `Observacion`, `id_estudiante`) VALUES
(1, 'Periodo1', 4, 4, 5, 3, 4, 'Excelente estudiante, Se apropio de los \nConocimientos de uns forma increible.', 1),
(2, 'Periodo1', 2, 5, 3, 3, 3.25, 'Su desarrollo a sido\nComplicado por no tener \napollo de los padres en la vivienda.', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `quejas`
--

DROP TABLE IF EXISTS `quejas`;
CREATE TABLE IF NOT EXISTS `quejas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Documento` varchar(20) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Apellido` varchar(50) NOT NULL,
  `Telefono` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Correo` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Mensaje` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `quejas`
--

INSERT INTO `quejas` (`id`, `Documento`, `Nombre`, `Apellido`, `Telefono`, `Correo`, `Mensaje`) VALUES
(2, '1143456321', 'James', 'Rodriguez', '300234211', 'james@gmail.com', 'Buenos dias No puedo ver mi horario de \nclases ayusa.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `session`
--

DROP TABLE IF EXISTS `session`;
CREATE TABLE IF NOT EXISTS `session` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Usuario` varchar(50) NOT NULL,
  `Clave` varchar(50) NOT NULL,
  `ConfirmarClave` varchar(20) NOT NULL,
  `Rol` varchar(20) NOT NULL,
  `id_usuario` int DEFAULT NULL,
  `id_estudiante` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_usuario` (`id_usuario`,`id_estudiante`),
  KEY `id_estudiante` (`id_estudiante`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `session`
--

INSERT INTO `session` (`id`, `Usuario`, `Clave`, `ConfirmarClave`, `Rol`, `id_usuario`, `id_estudiante`) VALUES
(1, 'Fgarcia', '123', '123', 'Administrador', 1, NULL),
(2, 'james1', '123', '123', 'Estudiante', NULL, 1),
(3, 'camila', '123', '123', 'Estudiante', NULL, 2),
(4, 'julio', '123', '123', 'Profesor', 2, NULL),
(5, 'Emilio', '123', '123', 'Profesor', 3, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `TipoDocumento` varchar(20) NOT NULL,
  `DNI` varchar(20) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Apellido` varchar(50) NOT NULL,
  `Telefono` varchar(20) NOT NULL,
  `Correo` varchar(30) NOT NULL,
  `Direccion` varchar(30) NOT NULL,
  `Rol` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `TipoDocumento`, `DNI`, `Nombre`, `Apellido`, `Telefono`, `Correo`, `Direccion`, `Rol`) VALUES
(1, 'Cedula', '123456789', 'Falcao', 'Garcia', '3003455687', 'fgarcia@gmail.com', 'calle 45-#12-56', 'Administrador'),
(2, 'Cedula', '1140567123', 'Julio', 'Castaño', '300456123', 'julio@caataño123@gmail.com', 'calle 45 - 12a - 56', 'Profesor'),
(3, 'Cedula', '72145321', 'Emilio', 'Rincon', '3002342344', 'emilio123@gmail.com', 'calle 45 - 12 - 56', 'Profesor');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `aula`
--
ALTER TABLE `aula`
  ADD CONSTRAINT `aula_ibfk_1` FOREIGN KEY (`id_curso`) REFERENCES `cursos` (`id`);

--
-- Filtros para la tabla `cursos`
--
ALTER TABLE `cursos`
  ADD CONSTRAINT `cursos_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD CONSTRAINT `estudiante_ibfk_1` FOREIGN KEY (`id_aula`) REFERENCES `aula` (`id`);

--
-- Filtros para la tabla `periodo1`
--
ALTER TABLE `periodo1`
  ADD CONSTRAINT `periodo1_ibfk_1` FOREIGN KEY (`id_estudiante`) REFERENCES `estudiante` (`id`);

--
-- Filtros para la tabla `session`
--
ALTER TABLE `session`
  ADD CONSTRAINT `session_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`),
  ADD CONSTRAINT `session_ibfk_2` FOREIGN KEY (`id_estudiante`) REFERENCES `estudiante` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
