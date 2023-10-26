CREATE TABLE IF NOT EXISTS comments(
id BIGSERIAL PRIMARY KEY NOT NULL, comment VARCHAR(500) NOT NULL
);

CREATE TABLE IF NOT EXISTS products(
id BIGSERIAL PRIMARY KEY NOT NULL, product_name VARCHAR(100) NOT NULL, product_price NUMERIC(10, 2),
in_stock BOOLEAN NOT NULL, comment_id INT,
FOREIGN KEY (comment_id) REFERENCES comments(id)
);

ALTER TABLE comments ADD product_id INT;
ALTER TABLE comments ADD FOREIGN KEY(product_id) REFERENCES products(id);