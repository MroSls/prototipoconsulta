-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-10-2023 a las 08:25:25
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `consulta`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consultas`
--

CREATE TABLE `consultas` (
  `ID` int(11) NOT NULL,
  `NOMBRE_MASCOTA` varchar(50) NOT NULL,
  `NOMBRE_PROPIETARIO` varchar(50) NOT NULL,
  `FECHA` date NOT NULL,
  `SERVICIO` varchar(50) NOT NULL,
  `PRECIO` float NOT NULL,
  `MOTIVO` varchar(1000) NOT NULL,
  `DIAGNOSTICO` varchar(1000) NOT NULL,
  `RECETA` varchar(1000) NOT NULL,
  `MEDICO` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `consultas`
--

INSERT INTO `consultas` (`ID`, `NOMBRE_MASCOTA`, `NOMBRE_PROPIETARIO`, `FECHA`, `SERVICIO`, `PRECIO`, `MOTIVO`, `DIAGNOSTICO`, `RECETA`, `MEDICO`) VALUES
(1, 'Camila', 'Jaime', '2023-10-09', 'Consulta', 250, 'Vomito y diarrea', 'La mascota tiene parvovirus', 'Gastroprazol 20mg 1 pastilla cada 24 horas\r\nDirulan 50mg 1/2 pastilla cada 12 horas', 'Mario'),
(2, 'Lucas', 'Maicol', '2023-10-09', 'Consulta', 300, 'Atropellaron', 'La mascota tiene una pata fracturada', 'Flaxol 15mg 1 tableta cada 8 horas', 'Mario');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `consultas`
--
ALTER TABLE `consultas`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `consultas`
--
ALTER TABLE `consultas`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
