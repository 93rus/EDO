
--Table Users
CREATE TABLE IF NOT EXISTS users(
  User_id INT NOT NULL,
  Username VARCHAR(255) NOT NULL,
  Userlogin VARCHAR(255) NOT NULL,
  Userpassword VARCHAR(255) NOT NULL,
  PRIMARY KEY (User_id)

);

--Table Product
CREATE TABLE IF NOT EXISTS products(
  product_id int NOT NULL,
  produst_name VARCHAR(255) NOT NULL,
  PRIMARY KEY (product_id)
);

--Table Order
CREATE TABLE IF NOT EXISTS orders(
  orders_id INT NOT NULL,
  product_name VARCHAR(255) NOT NULL,
  quantity INT NOT NULL,
  PRIMARY KEY (orders_id)

)



