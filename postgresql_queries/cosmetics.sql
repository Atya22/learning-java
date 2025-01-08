-- 1. Table cosmetic_categories
CREATE TABLE cosmetic_categories
(
    category_id   SERIAL NOT NULL PRIMARY KEY,
    category_name CHAR(255)
);

INSERT INTO cosmetic_categories (category_name)
VALUES ('Skincare'),
       ('Makeup'),
       ('Haircare'),
       ('Fragrance'),
       ('Nailcare');


-- 2. Table cosmetic_products
CREATE TABLE cosmetic_products
(
    product_id  SERIAL NOT NULL PRIMARY KEY,
    price       FLOAT,
    quantity    INT,
    description CHAR(255),
    category_id INT,
    CONSTRAINT cs_ct FOREIGN KEY (category_id)
        REFERENCES cosmetic_categories (category_id)
);

INSERT INTO cosmetic_products (price, quantity, description, category_id)
VALUES (29.99, 100, 'Moisturizing Cream', 1),
       (19.99, 150, 'Lipstick - Red', 2),
       (14.99, 200, 'Shampoo - 500ml', 3),
       (49.99, 80, 'Eau de Parfum', 4),
       (9.99, 120, 'Nail Polish - Pink', 5),
       (35.99, 90, 'Anti-Aging Serum', 1),
       (24.99, 130, 'Foundation - Light', 2),
       (12.99, 180, 'Conditioner - 500ml', 3),
       (39.99, 70, 'Body Mist', 4),
       (11.99, 110, 'Nail Polish - Blue', 5),
       (45.99, 75, 'Eye Cream', 1),
       (22.99, 140, 'Mascara - Black', 2);


-- 3. Table cosmetic_customers
CREATE TABLE cosmetic_customers
(
    customer_id  SERIAL NOT NULL PRIMARY KEY,
    first_name   CHAR(255),
    last_name    CHAR(255),
    address      CHAR(255),
    email        CHAR(255),
    phone_number CHAR(255)
);

INSERT INTO cosmetic_customers (first_name, last_name, address, email, phone_number)
VALUES ('Alice', 'Smith', '123 Main St', 'alice@example.com', '123-456-7890'),
       ('Bob', 'Johnson', '456 Oak St', 'bob@example.com', '234-567-8901'),
       ('Carol', 'Williams', '789 Pine St', 'carol@example.com', '345-678-9012'),
       ('David', 'Brown', '101 Maple St', 'david@example.com', '456-789-0123'),
       ('Emma', 'Jones', '202 Birch St', 'emma@example.com', '567-890-1234'),
       ('Frank', 'Miller', '303 Cedar St', 'frank@example.com', '678-901-2345'),
       ('Grace', 'Davis', '404 Walnut St', 'grace@example.com', '789-012-3456');


-- 4. Table cosmetic_orders
CREATE TABLE cosmetic_orders
(
    order_id    SERIAL NOT NULL PRIMARY KEY,
    customer_id INT,
    order_date  DATE
);

INSERT INTO cosmetic_orders (customer_id, order_date)
VALUES (1, '2025-01-01'),
       (2, '2025-01-02'),
       (3, '2025-01-03'),
       (4, '2025-01-04'),
       (5, '2025-01-05'),
       (6, '2025-01-06'),
       (7, '2025-01-07'),
       (3, '2025-01-08'),
       (4, '2025-01-09'),
       (2, '2025-01-10');

-- 5. Table cosmetic_order_details
CREATE TABLE cosmetic_order_details
(
    order_detail_id SERIAL NOT NULL PRIMARY KEY,
    order_id        INT,
    product_id      INT,
    quantity        INT,
    CONSTRAINT order_det FOREIGN KEY (order_id)
        REFERENCES cosmetic_orders (order_id),
    CONSTRAINT order_product FOREIGN KEY (product_id)
        REFERENCES cosmetic_products (product_id)
);

INSERT INTO cosmetic_order_details (order_id, product_id, quantity)
VALUES (1, 1, 2),
       (1, 2, 1),
       (2, 3, 3),
       (3, 4, 1),
       (4, 5, 2),
       (5, 6, 1),
       (6, 7, 4),
       (7, 8, 2),
       (8, 9, 3),
       (9, 10, 2),
       (10, 11, 1),
       (10, 12, 1);

-- 6.Get a list of all products.
SELECT *
FROM cosmetic_products;
-- This retrieves all products from the cosmetic_products table.

-- 7.Get a list of all categories of products.
SELECT *
FROM cosmetic_categories;
-- This retrieves all product categories from the cosmetic_categories table.

-- 8.Get a list of all customers.
SELECT *
FROM cosmetic_customers;
-- This retrieves all customers from the cosmetic_customers table.

-- 9.Get a list of all orders.
SELECT *
FROM cosmetic_orders;
-- This retrieves all orders from the cosmetic_orders table.

-- 10.Get a list of all order details.
SELECT *
FROM order_details;
-- This retrieves all order details from the cosmetic_order_details table.

-- 11.Get information about a specific product by its ID.
SELECT *
FROM cosmetic_products
WHERE product_id = 3;
-- This retrieves details about a specific product based on its product ID.

-- 12.Get a list of products in a specific category.
SELECT product_id, description, category_name
FROM cosmetic_products
         INNER JOIN cosmetic_categories ON cosmetic_products.category_id = cosmetic_categories.category_id
WHERE cosmetic_products.category_id = 2;
-- This retrieves all products in a specific category by filtering based on category_id.

-- 13.Get information about a customer by their ID.
SELECT *
from customers
WHERE customer_id = 3;
-- This retrieves details about a specific customer based on their customer ID.

-- 14.Get a list of orders for a specific customer.
SELECT cosmetic_products.description,
       cosmetic_products.price,
       cosmetic_orders.order_date,
       cosmetic_order_details.quantity
from cosmetic_order_details
         INNER JOIN cosmetic_orders ON cosmetic_order_details.order_id = cosmetic_orders.order_id
         INNER JOIN cosmetic_products ON cosmetic_order_details.product_id = cosmetic_products.product_id
WHERE customer_id = 3;
-- This retrieves all orders made by a specific customer based on customer_id.

-- 15.Get a list of order details for a specific order.
SELECT co.order_id,
       cod.quantity,
       cp.description,
       cp.price,
       co.order_date,
       cc.first_name,
       cc.last_name,
       cc.customer_id
FROM cosmetic_orders co
         INNER JOIN cosmetic_order_details cod ON co.order_id = cod.order_id
         INNER JOIN cosmetic_products cp ON cod.product_id = cp.product_id
         INNER JOIN cosmetic_customers cc ON co.customer_id = cc.customer_id
WHERE co.order_id = 1;
-- This retrieves all order details related to a specific order identified by order_id.

-- 16.Update the price of a product by its ID.
UPDATE cosmetic_products
SET price = 32.99
WHERE product_id = 1;
-- This updates the price of a specific product based on its product ID.

-- 17.Add a new product.
INSERT INTO cosmetic_products (price, quantity, description, category_id)
VALUES (27.99, 85, 'Face Wash - Gentle', 3);
-- This inserts a new product into the cosmetic_products table.

-- 18.Delete a product by its ID.
ALTER TABLE cosmetic_order_details
    DROP CONSTRAINT order_product;

ALTER TABLE cosmetic_order_details
    ADD CONSTRAINT order_product
        FOREIGN KEY (product_id)
            REFERENCES cosmetic_products (product_id)
            ON DELETE CASCADE;
--This modification ensures that when a product is deleted
--all related order details are automatically removed, maintaining data consistency.

DELETE
FROM cosmetic_products
WHERE product_id = 2;
-- This deletes a specific product from the cosmetic_products table based on product ID.
