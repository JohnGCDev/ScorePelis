use db_peliculas2;
DELIMITER $$

DROP procedure if exists sp_actor_crud $$

CREATE PROCEDURE sp_actor_crud(
  id int,
  nombre varchar(200),
  nacionalidad varchar(50),
  opcion int
)
BEGIN

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
END $$
DELIMITER ;



