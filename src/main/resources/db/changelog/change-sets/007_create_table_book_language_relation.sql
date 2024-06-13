CREATE TABLE IF NOT EXISTS book_language (
    book_id INT,
    language_id INT,
    PRIMARY KEY (book_id, language_id),
    FOREIGN KEY (book_id) REFERENCES book(book_id),
    FOREIGN KEY (language_id) REFERENCES language(language_id)
);