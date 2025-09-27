CREATE TABLE livros (
    id BIGSERIAL PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    pessoa_id BIGINT NOT NULL, 
    FOREIGN KEY (pessoa_id) REFERENCES pessoas (id) 
);