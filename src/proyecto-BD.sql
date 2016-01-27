CREATE TABLE Ruta (
	nombre_ruta VARCHAR(4) NOT NULL,
	descripcion TEXT NOT NULL,
	imagen VARCHAR(200),
	PRIMARY KEY (nombre_ruta)
);


CREATE TABLE Bus (
	numero_bus VARCHAR(20) NOT NULL,
	tipo TEXT NOT NULL,
	nombre_ruta VARCHAR(4) NOT NULL,
	PRIMARY KEY (numero_bus),
	FOREIGN KEY (nombre_ruta) REFERENCES Ruta(nombre_ruta)

);


CREATE TABLE Empleado (
	cedula_empleado VARCHAR(10) NOT NULL,
	nombre VARCHAR(50) NOT NULL,
	telefono VARCHAR(20) NOT NULL,
	direccion VARCHAR(50) NOT NULL,
	cargo VARCHAR(50) NOT NULL,
	PRIMARY KEY (cedula_empleado)
);

CREATE TABLE Estacion (
	nombre_estacion VARCHAR(20) NOT NULL,
	ubicacion VARCHAR(50) NOT NULL,
	cedula_empleado VARCHAR(10) NOT NULL,
	PRIMARY KEY (nombre_estacion),
	FOREIGN KEY (cedula_empleado) REFERENCES Empleado(cedula_empleado)
	);


CREATE SEQUENCE tarjeta_id
START 100
increment by 1;	

CREATE TABLE Tarjeta (
	id_tarjeta INTEGER DEFAULT nextval('tarjeta_id') NOT NULL,
	saldo DOUBLE PRECISION NOT NULL,
	estado VARCHAR(10) NOT NULL,
	deuda DOUBLE PRECISION NOT NULL,
	cedula_empleado VARCHAR(10) NOT NULL,
	nombre_estacion VARCHAR(20) NOT NULL,
	PRIMARY KEY (cedula_pasajero),
	FOREIGN KEY (cedula_empleado) REFERENCES Empleado(cedula_empleado),
	FOREIGN KEY (nombre_estacion) REFERENCES Estacion(nombre_estacion)
);



CREATE TABLE Pasajero (
	cedula_pasajero VARCHAR(10) NOT NULL,
	nombre VARCHAR(50) NOT NULL,
	telefono VARCHAR(20) NOT NULL,
	id_tarjeta VARCHAR(10) NOT NULL,
	PRIMARY KEY (cedula_pasajero),
	FOREIGN KEY (id_tarjeta) REFERENCES Tarjeta(id_tarjeta)
);



CREATE SEQUENCE sqr_id
START 001
increment by 1;	

CREATE TABLE SQR (
	numero_ticket INTEGER DEFAULT nextval('sqr_id') NOT NULL,
	motivo VARCHAR(20) NOT NULL,
	descripcion TEXT NOT NULL,
	estado VARCHAR(10) NOT NULL,
	fecha DATE NOT NULL,
	nombre_estacion VARCHAR(20) NOT NULL,
	cedula_empleado_director VARCHAR(20) NOT NULL,
	medidas TEXT,
	cedula_empleado_servicio_cliente VARCHAR(20) NOT NULL,
	PRIMARY KEY (numero_ticket),
	FOREIGN KEY (nombre_estacion) REFERENCES Estacion(nombre_estacion),
	FOREIGN KEY (cedula_empleado_director) REFERENCES Empleado(cedula_empleado),
	FOREIGN KEY (cedula_empleado_servicio_cliente) REFERENCES Empleado(cedula_empleado)
);



CREATE SEQUENCE turno_id
STAR 001
increment by 1;

CREATE TABLE Turno (
	id_turno INTEGER DEFAULT nextval('turno_id') NOT NULL,
	fecha DATE NOT NULL,
	hora_inicio VARCHAR(10) NOT NULL,
	hora_termina VARCHAR(10) NOT NULL,
	PRIMARY KEY (id_turno)
);



CREATE TABLE Aborda (
	cedula_pasajero VARCHAR(10) NOT NULL,
	numero_bus VARCHAR(20) NOT NULL,
	PRIMARY KEY (cedula_pasajero, numero_bus),
	FOREIGN KEY (cedula_pasajero) REFERENCES Pasajero(cedula_pasajero),
	FOREIGN KEY (numero_bus) REFERENCES Bus(numero_bus)
);


CREATE TABLE Empleado_Turno (
	cedula_empleado VARCHAR(10) NOT NULL,
	id_turno INTEGER NOT NULL,
	PRIMARY KEY (cedula_empleado, id_turno),
	FOREIGN KEY (cedula_empleado) REFERENCES Empleado(cedula_empleado),
	FOREIGN KEY (id_turno) REFERENCES Turno(id_turno),
);



CREATE TABLE Conduce (
	numero_bus VARCHAR(20) NOT NULL,
	nombre_ruta VARCHAR(4) NOT NULL,
	cedula_empleado VARCHAR(10) NOT NULL,
	PRIMARY KEY (numero_bus, nombre_ruta, cedula_empleado),
	FOREIGN KEY (numero_bus) REFERENCES Bus(numero_bus),
	FOREIGN KEY (nombre_ruta) REFERENCES Ruta(nombre_ruta),
	FOREIGN KEY (cedula_empleado) REFERENCES Empleado(cedula_empleado)
);

CREATE TABLE Ruta_Estacion (
	nombre_ruta VARCHAR(4) NOT NULL,
	nombre_estacion VARCHAR(20) NOT NULL,
	PRIMARY KEY (nombre_ruta, nombre_estacion),
	FOREIGN KEY (nombre_ruta) REFERENCES Ruta(nombre_ruta),
	FOREIGN KEY (nombre_estacion) REFERENCES Estacion(nombre_estacion)
);

