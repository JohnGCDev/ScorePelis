use db_peliculas2;
DELIMITER $$

DROP procedure if exists sp_director_crud $$

CREATE PROCEDURE sp_director_crud(
  id int,
  nombre varchar(200),
  nacionalidad varchar(100),
  opcion int
)
BEGIN

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
END $$
DELIMITER ;



