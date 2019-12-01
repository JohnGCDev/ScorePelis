use db_peliculas2;
DELIMITER $$

DROP procedure if exists sp_pelicula_crud $$

CREATE PROCEDURE sp_pelicula_crud(
  id int,
  nombre text,
  pais varchar(100),
  imagen varchar(250),
  sinopsis text,
  puntuacion decimal(5,2),
  fechaCine date,
  fechaDvd date,
  precio decimal(5,2),
  opcion int
)
BEGIN

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
END $$
DELIMITER ;



