create table Employee(
  id BIGINT PRIMARY KEY IDENTITY ,
  prename varchar(255),
  lastname varchar(255),
  email VARCHAR(255),
  fk_boss BIGINT FOREIGN KEY REFERENCES Employee(id)
)

create table [User](
  id BIGINT PRIMARY KEY  IDENTITY ,
  password varchar(255),
  fk_employee BIGINT FOREIGN KEY  REFERENCES Employee(id)
)