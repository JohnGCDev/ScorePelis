-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-11-2019 a las 15:31:22
-- Versión del servidor: 10.3.16-MariaDB
-- Versión de PHP: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_peliculas2`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_actor_crud` (`id` INT, `nombre` VARCHAR(200), `nacionalidad` VARCHAR(50), `opcion` INT)  BEGIN

  -- crear
  if opcion=1 then
    insert actores (actNombre,actNacionalidad)
    values (nombre,nacionalidad);
   end if;

  -- editar
  if opcion=2 then
    update actores set
      actNombre=nombre,
      actNacionalidad=nacionalidad
    where idActor = id;
  end if;

  -- eliminar
  if opcion=3 then
    delete from actores where idActor = id;
  end if;

  -- listar y buscar
  if opcion=4 then
    
    select * from actores ;
    

        end if;
  -- get
  if opcion=5 then
    select * from actores where idActor = id;
  end if;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_cine_crud` (`id` INT, `nombre` VARCHAR(100), `ciudad` VARCHAR(100), `direccion` TEXT, `opcion` INT)  BEGIN

  -- crear
  if opcion=1 then
    insert cine (cinNombre,cinCiudad,cinDireccion)
    values (nombre,ciudad,direccion);
   end if;

  -- editar
  if opcion=2 then
    update cine set
      cinNombre=nombre,
      cinCiudad=ciudad,
      cinDireccion=direccion
    where idCine = id;
  end if;

  -- eliminar
  if opcion=3 then
    delete from cine where idCine = id;
  end if;

  -- listar y buscar
  if opcion=4 then
    
    select * from cine ;
    

        end if;
  -- get
  if opcion=5 then
    select * from cine where idCine = id;
  end if;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_director_crud` (`id` INT, `nombre` VARCHAR(200), `nacionalidad` VARCHAR(100), `opcion` INT)  BEGIN

  -- crear
  if opcion=1 then
    insert director (dirNombre,dirNacionalidad)
    values (nombre,nacionalidad);
   end if;

  -- editar
  if opcion=2 then
    update director set
      dirNombre=nombre,
      dirNacionalidad=nacionalidad
    where idDirector = id;
  end if;

  -- eliminar
  if opcion=3 then
    delete from director where idDirector = id;
  end if;

  -- listar y buscar
  if opcion=4 then
    
    select * from director ;
    

        end if;
  -- get
  if opcion=5 then
    select * from director where idDirector = id;
  end if;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_editar_usuario` (`id` INT, `usuario` VARCHAR(60), `edad` INT, `genero` VARCHAR(1), `descripcion` VARCHAR(100))  BEGIN

  DECLARE numero_registros integer;
set  numero_registros=(SELECT count(*)  from usuario 
                      where us_nombre=usuario and idUsuario!=id);


if numero_registros<=0 THEN 
	UPDATE usuario set us_nombre=usuario,
                    us_edad=edad,
                    us_descripcion=descripcion,
                    us_genero=genero
      where idUsuario=id;
    
END IF;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_eliminar_usuario` (`id` INT)  BEGIN
   delete from usuario where idUsuario=id;
    END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_genero_crud` (`id` INT, `nombre` VARCHAR(100), `opcion` INT)  BEGIN

  -- crear
  if opcion=1 then
    insert genero (genNombre)
    values (nombre);
   end if;

  -- editar
  if opcion=2 then
    update genero set
      genNombre=nombre
    where idGenero = id;
  end if;

  -- eliminar
  if opcion=3 then
    delete from genero where idGenero = id;
  end if;

  -- listar y buscar
  if opcion=4 then
    
    select idGenero,genNombre from genero ;
    

        end if;
  -- get
  if opcion=5 then
    select * from genero where idGenero = id;
  end if;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insertar_admin` (`nombre` VARCHAR(100), `pass` VARCHAR(255), `edad` TINYINT, `genero` CHAR(1))  BEGIN
    INSERT INTO usuario(us_nombre ,us_pass ,us_edad ,us_genero,idROL,us_descripcion) VALUES (nombre,pass,edad,genero,1,'-');
    END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insertar_usuario` (IN `nombre` VARCHAR(100), IN `pass` VARCHAR(255), IN `edad` TINYINT, IN `genero` CHAR(1))  BEGIN
    INSERT INTO usuario(us_nombre ,us_pass ,us_edad ,us_genero,idROL,us_descripcion
) VALUES (nombre,pass,edad,genero,2,'-');
    END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listarUsuarios` ()  BEGIN
    SELECT u.idUsuario, u.us_nombre ,u.us_pass, u.us_edad, u.us_genero,
    u.us_descripcion, u.idRol FROM usuario u
        inner join rol r ON
        r.idRol=u.idRol;
    END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_pelicula_crud` (`id` INT, `nombre` TEXT, `pais` VARCHAR(100), `imagen` VARCHAR(250), `sinopsis` TEXT, `puntuacion` DECIMAL(5,2), `fechaCine` DATE, `fechaDvd` DATE, `precio` DECIMAL(5,2), `opcion` INT)  BEGIN

  -- crear
  if opcion=1 then
    insert pelicula (pelNombre,pelPais,pelImagen,pelSinopsis,pelPuntuacion,fechaEstrenoCine,fechaEstrenoDVD,precioDVD)
    values (nombre,pais,imagen,sinopsis,puntuacion,fechaCine,fechaDvd,precio,opcion);
   end if;

  -- editar
  if opcion=2 then
    update pelicula set
      pelNombre=nombre,
      pelPais=pais,
      pelImagen=imagen,
      pelSinopsis=sinopsis,
      pelPuntuacion=puntuacion,
      fechaEstrenoCine=fechaCine,
      fechaEstrenoDVD=fechaDvd,
      precioDVD=precio
    where idPelicula = id;
  end if;

  -- eliminar
  if opcion=3 then
    delete from pelicula where idPelicula = id;
  end if;

  -- listar y buscar
  if opcion=4 then
    
    select * from pelicula ;
    

        end if;
  -- get
  if opcion=5 then
    select * from pelicula where idPelicula = id;
  end if;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actores`
--

CREATE TABLE `actores` (
  `idActor` int(11) NOT NULL,
  `actNombre` varchar(200) NOT NULL,
  `actNacionalidad` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `actores`
--

INSERT INTO `actores` (`idActor`, `actNombre`, `actNacionalidad`) VALUES
(1, 'Joaquin Phoenix', 'Estados Unidos'),
(2, 'Robert De Niro', 'Estados Unidos'),
(3, 'Robert Downey Jr.', 'Estados Unidos'),
(4, 'Chris Evans', 'Estados Unidos'),
(5, 'Mark Ruffalo', 'Estados Unidos'),
(6, 'Chris Hemsworth', 'Australia'),
(7, 'Scarlett Johansson', 'Estados Unidos'),
(8, 'Jeremy Renner', 'Estados Unidos'),
(9, 'Josh Brolin', 'Estados Unidos'),
(10, 'Bruce Willis', 'Estados Unidos'),
(11, 'Samuel L. Jackson', 'Estados Unidos'),
(12, 'James McAvoy', 'Escocia'),
(13, 'Sarah Paulson', 'Estados Unidos'),
(14, 'Anya Taylor-Joy', 'Estados Unidos'),
(15, 'Brie Larson', 'Estados Unidos'),
(16, 'Jude Law', 'Inglaterra'),
(17, 'Ben Mendelsohn', 'Australia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actor_pelicula`
--

CREATE TABLE `actor_pelicula` (
  `idActor` int(11) NOT NULL,
  `idPelicula` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `actor_pelicula`
--

INSERT INTO `actor_pelicula` (`idActor`, `idPelicula`) VALUES
(1, 1),
(2, 1),
(3, 2),
(4, 2),
(5, 2),
(6, 2),
(7, 2),
(8, 2),
(9, 2),
(11, 2),
(15, 2),
(10, 3),
(11, 3),
(12, 3),
(13, 3),
(14, 3),
(15, 4),
(11, 4),
(16, 4),
(17, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cartelera`
--

CREATE TABLE `cartelera` (
  `idCartelera` int(11) NOT NULL,
  `idPelicula` int(11) NOT NULL,
  `carHorario` datetime NOT NULL,
  `idEntrada` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cine`
--

CREATE TABLE `cine` (
  `idCine` int(11) NOT NULL,
  `cinNombre` varchar(100) NOT NULL,
  `cinCiudad` varchar(100) NOT NULL,
  `cinDireccion` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cine`
--

INSERT INTO `cine` (`idCine`, `cinNombre`, `cinCiudad`, `cinDireccion`) VALUES
(1, 'Cineplanet Trujillo Centro', 'Trujillo', 'Jirón Orbegoso 245, Trujillo'),
(2, 'Cineplanet Trujillo Real Plaza', 'Trujillo', 'Av. César Vallejo 1345, Trujillo'),
(3, 'Cinemark Mall Plaza Trujillo', 'Trujillo', 'Av. América Oeste 750, Trujillo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comentario`
--

CREATE TABLE `comentario` (
  `idComentario` int(11) NOT NULL,
  `comContenido` text NOT NULL,
  `comFecha` date NOT NULL,
  `idUsuario` int(11) NOT NULL,
  `idPelicula` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `director`
--

CREATE TABLE `director` (
  `idDirector` int(11) NOT NULL,
  `dirNombre` varchar(200) NOT NULL,
  `dirNacionalidad` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `director`
--

INSERT INTO `director` (`idDirector`, `dirNombre`, `dirNacionalidad`) VALUES
(1, 'Todd Phillips', 'Estados Unidos'),
(2, 'Anthony Russo', 'Estados Unidos'),
(3, 'Joe Russo', 'Estados Unidos'),
(4, 'M. Night Shyamalan', 'India'),
(5, 'Anna Boden', 'Estados Unidos'),
(6, 'Ryan K. Fleck', 'Estados Unidos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entradas`
--

CREATE TABLE `entradas` (
  `idEntrada` int(11) NOT NULL,
  `entrTipo` varchar(100) NOT NULL,
  `idCine` int(11) NOT NULL,
  `diaSemana` varchar(20) NOT NULL,
  `precio` decimal(5,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `genero`
--

CREATE TABLE `genero` (
  `idGenero` int(11) NOT NULL,
  `genNombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `genero`
--

INSERT INTO `genero` (`idGenero`, `genNombre`) VALUES
(1, 'Terror'),
(2, 'Ciencia Ficción'),
(3, 'Acción'),
(4, 'Superhéroes'),
(5, 'Suspenso'),
(6, 'Comedia'),
(7, 'Drama'),
(8, 'Musical'),
(9, 'Aventura'),
(10, 'Romantica');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pelicula`
--

CREATE TABLE `pelicula` (
  `idPelicula` int(11) NOT NULL,
  `pelNombre` text NOT NULL,
  `pelPais` varchar(100) NOT NULL,
  `pelImagen` varchar(250) NOT NULL,
  `pelSinopsis` text NOT NULL,
  `pelPuntuacion` decimal(5,2) NOT NULL,
  `fechaEstrenoCine` date DEFAULT NULL,
  `fechaEstrenoDVD` date DEFAULT NULL,
  `precioDVD` double(5,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pelicula`
--

INSERT INTO `pelicula` (`idPelicula`, `pelNombre`, `pelPais`, `pelImagen`, `pelSinopsis`, `pelPuntuacion`, `fechaEstrenoCine`, `fechaEstrenoDVD`, `precioDVD`) VALUES
(1, 'Joker', 'Estados Unidos', '', 'Joker mostrará por primera vez los orígenes del icónico archienemigo por excelencia de Bruce Wayne/Batman. La historia sigue de cerca la vida de Arthur Fleck (Joaquin Phoenix), un hombre con problemas psiquiátricos que vivirá una serie de acontecimientos que le harán convertirse en uno de los grandes villanos de DC Comics. El Príncipe Payaso del Crimen se cruzará en el camino de Thomas Wayne (Brett Cullen) y se acercará a su hijo, el futuro Caballero Oscuro en su versión joven (Dante Pereira-Olson).', '5.00', '2019-10-04', NULL, NULL),
(2, 'Avengers: EndGame', 'Estados Unidos', '', 'Después de los devastadores eventos ocurridos en Vengadores: Infinity War, el universo está en ruinas debido a las acciones de Thanos, el Titán Loco. Tras la derrota, las cosas no pintan bien para los Vengadores. Mientras Iron Man (Robert Downey Jr.) vaga en soledad junto a Nebula (Karen Gillan) en una nave lejos de la Tierra, el grupo encabezado por Capitán América (Chris Evans), Viuda Negra (Scarlett Johansson), Hulk (Mark Ruffalo) y Thor (Chris Hemsworth) deberá tratar de revertir los efectos de la catástrofe provocada por Thanos. Los Vengadores deberán reunirse una vez más para deshacer sus acciones y restaurar el orden en el universo de una vez por todas. Esta vez, contarán también con aliados como Ojo de Halcón (Jeremy Renner) y Capitana Marvel (Brie Larson), además de Ant-Man (Paul Rudd), que presumiblemente podría haber estado atrapado en el Reino Cuántico. Juntos, se prepararán para la batalla final, sin importar cuáles sean las consecuencias.', '5.00', '2019-04-25', '2019-07-30', 45.00),
(3, 'Glass', 'Estados Unidos', '', 'Este filme reúne a tres personajes ya conocidos. Elijah Price (Samuel L. Jackson), el supervillano discapacitado más conocido como Señor Cristal, David Dunn (Bruce Willis), un hombre que tiene la capacidad de no poder ser herido, y Kevin Wendell Crumb (James McAvoy), un joven que posee en su interior múltiples personalidades. Con el paso de los años, Elijah Price, recluido en una institución mental donde lo mantienen sedado, se ha rendido. Pero este villano es demasiado inteligente y, a pesar del tratamiento al que le somete la Doctora Ellie Staple (Sarah Paulson), tiene un plan para escapar. Su objetivo será unirse con La Bestia, una de las personalidades de Crumb. Será David Dunn quien trate de frenar sus planes, aunque detenerlos será una tarea difícil.', '5.00', '2019-01-18', '2019-04-02', 45.00),
(4, 'Capitana Marvel', 'Estados Unidos', '', 'Ambientada en los años 90, esta nueva aventura nos presenta un periodo de la historia nunca antes visto en el Universo Cinematográfico de Marvel. El viaje de Carol Danvers (Brie Larson) para convertirse en una de las heroínas más poderosas del universo, la Capitana Marvel, miembro de una raza de nobles héroes guerreros. Mientras una guerra galáctica entre dos razas alienígenas llega a la Tierra, Danvers luchará junto a un pequeño grupo de aliados, mientras trata de encontrarse a sí misma para descubrir quién es en realidad.', '5.00', '2019-03-08', '2019-05-28', 45.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pelicula_director`
--

CREATE TABLE `pelicula_director` (
  `idPelicula` int(11) NOT NULL,
  `idDirector` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pelicula_director`
--

INSERT INTO `pelicula_director` (`idPelicula`, `idDirector`) VALUES
(1, 1),
(2, 2),
(2, 3),
(3, 4),
(4, 5),
(4, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pelicula_genero`
--

CREATE TABLE `pelicula_genero` (
  `idPelicula` int(11) NOT NULL,
  `idGenero` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pelicula_genero`
--

INSERT INTO `pelicula_genero` (`idPelicula`, `idGenero`) VALUES
(1, 4),
(1, 7),
(2, 4),
(2, 3),
(3, 3),
(3, 5),
(4, 4),
(4, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `puntuacion`
--

CREATE TABLE `puntuacion` (
  `idPelicula` int(11) NOT NULL,
  `idUsuario` int(11) NOT NULL,
  `puntuacion` decimal(5,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `idRol` int(11) NOT NULL,
  `ro_descripcion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`idRol`, `ro_descripcion`) VALUES
(1, 'admin'),
(2, 'user');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL,
  `us_nombre` varchar(100) NOT NULL,
  `us_pass` varchar(100) NOT NULL,
  `us_edad` int(11) NOT NULL,
  `us_genero` char(1) NOT NULL,
  `us_descripcion` text NOT NULL,
  `idRol` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idUsuario`, `us_nombre`, `us_pass`, `us_edad`, `us_genero`, `us_descripcion`, `idRol`) VALUES
(4, 'guzman', '123', 21, 'M', 'CIENCIA FICCION, ACCION, COMEDIA', 2),
(10, 'cruzate', '123', 19, 'M', 'PELIS DE TERROR', 1),
(11, 'cristian', '123', 22, 'M', 'CIENCIA FICCION, TERROR', 1),
(13, 'asmat', '123', 23, 'M', '-', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `idVenta` int(11) NOT NULL,
  `totalVenta` decimal(10,2) NOT NULL,
  `idUsuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventacine`
--

CREATE TABLE `ventacine` (
  `idVentaCine` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `idVenta` int(11) NOT NULL,
  `idCartelera` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventadvd`
--

CREATE TABLE `ventadvd` (
  `idVentaDVD` int(11) NOT NULL,
  `idPelicula` int(11) NOT NULL,
  `idVenta` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actores`
--
ALTER TABLE `actores`
  ADD PRIMARY KEY (`idActor`);

--
-- Indices de la tabla `actor_pelicula`
--
ALTER TABLE `actor_pelicula`
  ADD KEY `ap_act` (`idActor`),
  ADD KEY `ap_pel` (`idPelicula`);

--
-- Indices de la tabla `cartelera`
--
ALTER TABLE `cartelera`
  ADD PRIMARY KEY (`idCartelera`),
  ADD KEY `car_pel` (`idPelicula`),
  ADD KEY `car_ent` (`idEntrada`);

--
-- Indices de la tabla `cine`
--
ALTER TABLE `cine`
  ADD PRIMARY KEY (`idCine`);

--
-- Indices de la tabla `comentario`
--
ALTER TABLE `comentario`
  ADD PRIMARY KEY (`idComentario`),
  ADD KEY `com_usu` (`idUsuario`),
  ADD KEY `com_pel` (`idPelicula`);

--
-- Indices de la tabla `director`
--
ALTER TABLE `director`
  ADD PRIMARY KEY (`idDirector`);

--
-- Indices de la tabla `entradas`
--
ALTER TABLE `entradas`
  ADD PRIMARY KEY (`idEntrada`),
  ADD KEY `ent_cin` (`idCine`);

--
-- Indices de la tabla `genero`
--
ALTER TABLE `genero`
  ADD PRIMARY KEY (`idGenero`);

--
-- Indices de la tabla `pelicula`
--
ALTER TABLE `pelicula`
  ADD PRIMARY KEY (`idPelicula`);

--
-- Indices de la tabla `pelicula_director`
--
ALTER TABLE `pelicula_director`
  ADD KEY `pd_pel` (`idPelicula`),
  ADD KEY `pd_dir` (`idDirector`);

--
-- Indices de la tabla `pelicula_genero`
--
ALTER TABLE `pelicula_genero`
  ADD KEY `pg_pel` (`idPelicula`),
  ADD KEY `pg_gen` (`idGenero`);

--
-- Indices de la tabla `puntuacion`
--
ALTER TABLE `puntuacion`
  ADD KEY `pun_pel` (`idPelicula`),
  ADD KEY `pun_usu` (`idUsuario`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`idRol`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idUsuario`),
  ADD KEY `usu_rol` (`idRol`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`idVenta`),
  ADD KEY `ven_usu` (`idUsuario`);

--
-- Indices de la tabla `ventacine`
--
ALTER TABLE `ventacine`
  ADD PRIMARY KEY (`idVentaCine`),
  ADD KEY `vc_ven` (`idVenta`),
  ADD KEY `vc_car` (`idCartelera`);

--
-- Indices de la tabla `ventadvd`
--
ALTER TABLE `ventadvd`
  ADD PRIMARY KEY (`idVentaDVD`),
  ADD KEY `vd_pel` (`idPelicula`),
  ADD KEY `vd_ven` (`idVenta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `actores`
--
ALTER TABLE `actores`
  MODIFY `idActor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `cartelera`
--
ALTER TABLE `cartelera`
  MODIFY `idCartelera` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cine`
--
ALTER TABLE `cine`
  MODIFY `idCine` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `comentario`
--
ALTER TABLE `comentario`
  MODIFY `idComentario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `director`
--
ALTER TABLE `director`
  MODIFY `idDirector` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `entradas`
--
ALTER TABLE `entradas`
  MODIFY `idEntrada` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `genero`
--
ALTER TABLE `genero`
  MODIFY `idGenero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `pelicula`
--
ALTER TABLE `pelicula`
  MODIFY `idPelicula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `idRol` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `idVenta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ventacine`
--
ALTER TABLE `ventacine`
  MODIFY `idVentaCine` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ventadvd`
--
ALTER TABLE `ventadvd`
  MODIFY `idVentaDVD` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `actor_pelicula`
--
ALTER TABLE `actor_pelicula`
  ADD CONSTRAINT `ap_act` FOREIGN KEY (`idActor`) REFERENCES `actores` (`idActor`),
  ADD CONSTRAINT `ap_pel` FOREIGN KEY (`idPelicula`) REFERENCES `pelicula` (`idPelicula`);

--
-- Filtros para la tabla `cartelera`
--
ALTER TABLE `cartelera`
  ADD CONSTRAINT `car_ent` FOREIGN KEY (`idEntrada`) REFERENCES `entradas` (`idEntrada`),
  ADD CONSTRAINT `car_pel` FOREIGN KEY (`idPelicula`) REFERENCES `pelicula` (`idPelicula`);

--
-- Filtros para la tabla `comentario`
--
ALTER TABLE `comentario`
  ADD CONSTRAINT `com_pel` FOREIGN KEY (`idPelicula`) REFERENCES `pelicula` (`idPelicula`),
  ADD CONSTRAINT `com_usu` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`);

--
-- Filtros para la tabla `entradas`
--
ALTER TABLE `entradas`
  ADD CONSTRAINT `ent_cin` FOREIGN KEY (`idCine`) REFERENCES `cine` (`idCine`);

--
-- Filtros para la tabla `pelicula_director`
--
ALTER TABLE `pelicula_director`
  ADD CONSTRAINT `pd_dir` FOREIGN KEY (`idDirector`) REFERENCES `director` (`idDirector`),
  ADD CONSTRAINT `pd_pel` FOREIGN KEY (`idPelicula`) REFERENCES `pelicula` (`idPelicula`);

--
-- Filtros para la tabla `pelicula_genero`
--
ALTER TABLE `pelicula_genero`
  ADD CONSTRAINT `pg_gen` FOREIGN KEY (`idGenero`) REFERENCES `genero` (`idGenero`),
  ADD CONSTRAINT `pg_pel` FOREIGN KEY (`idPelicula`) REFERENCES `pelicula` (`idPelicula`);

--
-- Filtros para la tabla `puntuacion`
--
ALTER TABLE `puntuacion`
  ADD CONSTRAINT `pun_pel` FOREIGN KEY (`idPelicula`) REFERENCES `pelicula` (`idPelicula`),
  ADD CONSTRAINT `pun_usu` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usu_rol` FOREIGN KEY (`idRol`) REFERENCES `rol` (`idRol`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `ven_usu` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`);

--
-- Filtros para la tabla `ventacine`
--
ALTER TABLE `ventacine`
  ADD CONSTRAINT `vc_car` FOREIGN KEY (`idCartelera`) REFERENCES `cartelera` (`idCartelera`),
  ADD CONSTRAINT `vc_ven` FOREIGN KEY (`idVenta`) REFERENCES `venta` (`idVenta`);

--
-- Filtros para la tabla `ventadvd`
--
ALTER TABLE `ventadvd`
  ADD CONSTRAINT `vd_pel` FOREIGN KEY (`idPelicula`) REFERENCES `pelicula` (`idPelicula`),
  ADD CONSTRAINT `vd_ven` FOREIGN KEY (`idVenta`) REFERENCES `venta` (`idVenta`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
