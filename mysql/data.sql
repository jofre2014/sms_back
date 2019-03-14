CREATE DATABASE contactos_ws;

use contactos_ws;

CREATE TABLE `contactos` (
  `telefono` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `importe` float NOT NULL,
  PRIMARY KEY (`telefono`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO contactos (telefono, nombre, importe) VALUES ("2616968488", "jose luis",1800.00);
INSERT INTO contactos (telefono, nombre, importe) VALUES ("2616968489", "jose luis 1",1900.00);
INSERT INTO contactos (telefono, nombre, importe) VALUES ("2616968490", "jose luis 2",2500.00);
INSERT INTO contactos (telefono, nombre, importe) VALUES ("2616968491", "jose luis 3",3200.00);
INSERT INTO contactos (telefono, nombre, importe) VALUES ("2616968492", "jose luis 4",4500.20);