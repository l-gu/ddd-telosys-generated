--liquibase formatted sql

--changeset telosys:orders-001

CREATE TABLE catalog
(
  "year" smallint NOT NULL,
  quarter smallint NOT NULL,
  title varchar(50) NOT NULL,
  PRIMARY KEY ("year", quarter)
);

CREATE TABLE category
(
  code smallint NOT NULL,
  name varchar(60) ,
  PRIMARY KEY (code)
);

CREATE TABLE customer
(
  id integer NOT NULL,
  first_name varchar(60) NOT NULL,
  last_name varchar(40) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE customer_address
(
  id integer NOT NULL,
  street varchar(30) NOT NULL,
  complement varchar(30) NOT NULL,
  zip_code varchar(10) NOT NULL,
  city varchar(34) NOT NULL,
  state varchar(34) NOT NULL,
  customer_id integer ,
  PRIMARY KEY (id)
);

CREATE TABLE delivery_address
(
  id integer NOT NULL,
  order_num integer ,
  street varchar(30) NOT NULL,
  complement varchar(30) ,
  zip_code varchar(8) NOT NULL,
  city varchar(40) NOT NULL,
  state varchar(20) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE "ORDER"
(
  num integer NOT NULL,
  order_date date NOT NULL,
  status smallint NOT NULL DEFAULT 0,
  comment varchar(120) ,
  customer_id integer ,
  PRIMARY KEY (num)
);

CREATE TABLE order_item
(
  id bigint NOT NULL,
  order_num integer ,
  product_code varchar(10) NOT NULL,
  quantity smallint NOT NULL DEFAULT 1,
  unit_price numeric NOT NULL,
  discount numeric NOT NULL,
  comment varchar(120) ,
  PRIMARY KEY (id)
);

CREATE TABLE product
(
  code CHAR(5) NOT NULL,
  name varchar(60) NOT NULL,
  description varchar(120) ,
  unit_price numeric NOT NULL,
  in_stock boolean ,
  active_for_sale boolean ,
  category_id smallint ,
  catalog_year smallint ,
  catalog_quarter smallint ,
  PRIMARY KEY (code)
);


ALTER TABLE customer_address
  ADD CONSTRAINT "FK_CustomerAddress_Customer" FOREIGN KEY(customer_id) 
  REFERENCES customer(id) ;
CREATE INDEX ON customer_address(customer_id) ;

ALTER TABLE delivery_address
  ADD CONSTRAINT "FK_DeliveryAddress_Order" FOREIGN KEY(order_num) 
  REFERENCES "ORDER"(num) ;
CREATE INDEX ON delivery_address(order_num) ;

ALTER TABLE "ORDER"
  ADD CONSTRAINT "FK_Order_Customer" FOREIGN KEY(customer_id) 
  REFERENCES customer(id) ;
CREATE INDEX ON "ORDER"(customer_id) ;

ALTER TABLE order_item
  ADD CONSTRAINT "FK_OrderItem_Order" FOREIGN KEY(order_num) 
  REFERENCES "ORDER"(num) ;
CREATE INDEX ON order_item(order_num) ;
ALTER TABLE order_item
  ADD CONSTRAINT "FK_OrderItem_Product" FOREIGN KEY(product_code) 
  REFERENCES product(code) ;
CREATE INDEX ON order_item(product_code) ;

ALTER TABLE product
  ADD CONSTRAINT "FK_Product_Category" FOREIGN KEY(category_id) 
  REFERENCES category(code) ;
CREATE INDEX ON product(category_id) ;
ALTER TABLE product
  ADD CONSTRAINT "FK_PROD_CATALOG" FOREIGN KEY(catalog_year,catalog_quarter) 
  REFERENCES catalog("year",quarter) ;
CREATE INDEX ON product(catalog_year,catalog_quarter) ;



--rollback drop table product cascade ;  
--rollback drop table order_item cascade ;  
--rollback drop table "ORDER" cascade ;  
--rollback drop table delivery_address cascade ;  
--rollback drop table customer_address cascade ;  
--rollback drop table customer cascade ;  
--rollback drop table category cascade ;  
--rollback drop table catalog cascade ;  

