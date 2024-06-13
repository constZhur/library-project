CREATE TABLE Book (
    book_id INT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    isbn VARCHAR(20) UNIQUE,
    publication_year INT,
    author_id INT,
    publisher_id INT,
    genre_id INT,
    language_id INT,
    total_copies INT,
    FOREIGN KEY (publisher_id) REFERENCES publisher(publisher_id),
    FOREIGN KEY (genre_id) REFERENCES genre(genre_id)
);