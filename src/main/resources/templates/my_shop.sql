DROP DATABASE IF EXISTS lydiashopdb;
CREATE DATABASE lydiashopdb;

use lydiashopdb;

 create table country (
	id_country INT not null PRIMARY KEY,
	country_name VARCHAR(50) NULL
    
);

create table address(

	id_address INT not null primary key,
	id_country INT NULL,
	city VARCHAR(50) NULL,
	postal_code VARCHAR(50) NULL, 
	street_line1 VARCHAR(50) NULL,
    street_line2 VARCHAR(50) null,
    home VARCHAR(50) NULL,
    apartment VARCHAR(50) null,
    
    FOREIGN KEY (id_country) REFERENCES country (id_country)
    
);


create table size (
	id_size int not null primary key,
	size varchar(3) null
);

create table color (
	id_color int not null primary key,
	color varchar(10) null
);


create table product (
	id_product INT NOT NULL auto_increment primary KEY,
	price FLOAT NOT NULL,
	category VARCHAR(50) NOT NULL,
	weight FLOAT NOT NULL,
    volume float not null, 
    image VARCHAR(50) NOT NULL
    
);

create table payment_method (
	id_method INT not NULL AUTO_INCREMENT PRIMARY KEY,
	method VARCHAR(50) NULL
);

CREATE TABLE order_status (
    id_orderstatus INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    status_order VARCHAR(50) NULL
);

CREATE TABLE payment_status (
    id_paymentstatus INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    status_payment VARCHAR(50) NULL
);

create table customer (
	id_customer INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_address int null,
	customer_name varchar(50) NOT NULL,
	customer_surname VARCHAR(50) null,
	birth DATE NOT NULL,
    email varchar(50) not null, 
    account_password varchar(50) not null
    
);

create table purchase_order (
	id_order INT not null,
    id_customer int not null, 
	id_address int null,
	payment_method int null,
    delivery_method varchar(50) null,
	payment_status int null,
    order_status int null,
    
    primary key (id_order),
	FOREIGN KEY (id_address) REFERENCES address (id_address),
    FOREIGN KEY (payment_method) REFERENCES payment_method (id_method),
	FOREIGN KEY (payment_status) REFERENCES payment_status (id_paymentstatus),
	FOREIGN KEY (order_status) REFERENCES order_status (id_orderstatus),
    foreign key (id_customer) references customer(id_customer)
    
);

CREATE TABLE customer_address (
    id_customer INT NOT NULL ,
    id_address int NOT NULL,
    
	    
	FOREIGN KEY (id_customer) REFERENCES customer (id_customer),    
	FOREIGN KEY (id_address) REFERENCES address (id_address)
    
);

create table product_description (
	id_productdescription int not null auto_increment primary key,
	id_size int NOT NULL,
    id_color int not null, 
	id_product int NOT NULL,
    stock int not null, 
    
	FOREIGN KEY (id_product) REFERENCES product (id_product),  
    FOREIGN KEY (id_size) REFERENCES size (id_size),    
	FOREIGN KEY (id_color) REFERENCES color (id_color)
    
);
CREATE TABLE good (
    id_order INT NOT NULL ,
    id_productdescription int NOT NULL,
    quantity int not null,
    
	FOREIGN KEY (id_productdescription) REFERENCES product_description (id_productdescription),    
	FOREIGN KEY (id_order) REFERENCES purchase_order (id_order)
    
);
