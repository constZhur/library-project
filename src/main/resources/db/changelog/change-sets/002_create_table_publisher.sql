CREATE TABLE IF NOT EXISTS publisher (
    publisher_id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    address VARCHAR(255),
    phone VARCHAR(20)
);