use db_peliculas2;
DELIMITER $$

DROP procedure if exists sp_genero_crud $$

CREATE PROCEDURE sp_genero_crud(
  id int,
  nombre varchar(100),
  opcion int
)
BEGIN

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
END $$
DELIMITER ;



