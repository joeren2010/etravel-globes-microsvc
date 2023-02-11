-- create database: admin
SHOW DATABASES;
CREATE DATABASE globes_admin;
USE globes_admin;
SHOW TABLES;
#DROP DATABASE globes_admin;
-- view table: admin
DESC admin;
SELECT * FROM admin;
#SELECT * FROM admin adm WHERE adm.email = 'admin@gmail.com' AND adm.password = 'admin123';
#INSERT INTO admin(email,password,full_name,added_on) VALUES('admin@gmail.com','admin123','Admin-1',current_date());


-- create database: cab
SHOW DATABASES;
CREATE DATABASE globes_cab;
USE globes_cab;
SHOW TABLES;
#DROP DATABASE globes_cab;
-- view table: cab
DESC cab;
SELECT * FROM cab;
-- view table: imageinfo
DESC imageinfo;
SELECT * FROM imageinfo;
#ALTER TABLE cab AUTO_INCREMENT = 1;


-- create database: category
SHOW DATABASES;
CREATE DATABASE globes_category;
USE globes_category;
SHOW TABLES;
#DROP DATABASE globes_category;
-- view table: category
DESC category;
SELECT * FROM category;
#ALTER TABLE category AUTO_INCREMENT = 1;


-- create database: client
SHOW DATABASES;
CREATE DATABASE globes_client;
USE globes_client;
SHOW TABLES;
#DROP DATABASE globes_client;
-- view table: client
DESC client;
SELECT * FROM client;
#SELECT * FROM client clt WHERE clt.email = 'client1@gmail.com' AND clt.password = 'client123';
#INSERT INTO client(email,password,full_name,added_on) VALUES('client1@gmail.com','client123','Client-1',current_date());


-- create database: driver
SHOW DATABASES;
CREATE DATABASE globes_driver;
USE globes_driver;
SHOW TABLES;
#DROP DATABASE globes_driver;
-- view table: driver
DESC driver;
SELECT * FROM driver;
#SELECT * FROM driver dvr WHERE dvr.email = 'driver1@gmail.com' AND dvr.password = 'driver123';
#INSERT INTO driver(email,password,full_name,added_on) VALUES('driver1@gmail.com','driver123','Driver-1',current_date());


-- create database: resv
SHOW DATABASES;
CREATE DATABASE globes_resv;
USE globes_resv;
SHOW TABLES;
#DROP DATABASE globes_resv;
-- view table: resv
DESC resv;
SELECT * FROM resv;


-- create database: resvcab
SHOW DATABASES;
CREATE DATABASE globes_resvcab;
USE globes_resvcab;
SHOW TABLES;
#DROP DATABASE globes_resvcab;
-- view table: resvcab
DESC resvcab;
SELECT * FROM resvcab;










-- create database: cab
SHOW DATABASES;
CREATE DATABASE globes_cab;
USE globes_cab;
SHOW TABLES;
#DROP DATABASE globes_cab;
-- view table: cab
DESC cab;
SELECT * FROM cab;
-- view table: imageinfo
DESC imageinfo;
SELECT * FROM imageinfo;
-- view table: category
DESC category;
SELECT * FROM category;
#ALTER TABLE cab AUTO_INCREMENT = 1;
#ALTER TABLE category AUTO_INCREMENT = 1;


-- create database
SHOW DATABASES;
CREATE DATABASE globes_cabcategory;
USE globes_cabcategory;
SHOW TABLES;
#DROP DATABASE globes_cabcategory;
-- view table: cabcategory
DESC cabcategory;
SELECT * FROM cabcategory;