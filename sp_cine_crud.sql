use db_peliculas2;
DELIMITER $$

DROP procedure if exists sp_cine_crud $$

CREATE PROCEDURE sp_cine_crud(
  id int,
  nombre varchar(100),
  ciudad varchar(100),
  direccion text,
  opcion int
)
BEGIN

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
END $$
DELIMITER ;



