CREATE DATABASE biblioteca_integrador;

USE biblioteca_integrador;

#drop table tb_livros;

CREATE TABLE tb_livros (
    ID_LIVRO INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    TITULO VARCHAR(80) NOT NULL,
    AUTOR VARCHAR(80)NOT NULL,
    GENERO VARCHAR(40) NOT NULL,
    EDITORA VARCHAR(80)NOT NULL,
    ANO_PUBLICACAO DATE NOT NULL,
    NUMERO_PAGINAS INT NOT NULL,
    ESTOQUE INT NOT NULL,
    ISBN VARCHAR(17) NOT NULL
);
SELECT ID_LIVRO,
       TITULO,
       AUTOR,
       GENERO,
       EDITORA,
	   date_format(ANO_PUBLICACAO,'%d/%m/%Y') as "Data de lançamento",
       NUMERO_PAGINAS,
       ESTOQUE,
       ISBN
 FROM tb_livros;


INSERT INTO tb_livros(TITULO,AUTOR,GENERO,EDITORA,ANO_PUBLICACAO,NUMERO_PAGINAS,ESTOQUE,ISBN)
VALUES
("Harry Potter e a Pedra Filosofal", "J.K.Rowling","Fantasia","Bloomsbury Publishing","1997-06-26",264,5,678-098),
("Harry Potter e a Câmara Secreta", "J.K.Rowling","Fantasia","Bloomsbury Publishing","1998-07-02",264,5,"678-099"),
("Harry Potter e o Prisioneiro de Azkaban", "J.K.Rowling","Fantasia","Bloomsbury Publishing","1999-07-08",264,5,"678-100"),
("Harry Potter e o Cálice de Fogo", "J.K.Rowling","Fantasia","Bloomsbury Publishing","2000-07-08",264,5,"678-101"),
("Harry Potter e a Ordem da Fênix", "J.K.Rowling","Fantasia","Bloomsbury Publishing","2003-06-21",264,5,"678-102"),
("Harry Potter e o Enigma do Príncipe", "J.K.Rowling","Fantasia","Bloomsbury Publishing","2005-07-16",264,5,"678-103"),
("Harry Potter e as Relíquias da Morte", "J.K.Rowling","Fantasia","Bloomsbury Publishing","2007-07-21",264,5,"678-104"),
("Harry Potter e a Criança Amaldiçoada", "J.K.Rowling","Fantasia","Bloomsbury Publishing","2016-07-30",264,5,"678-105");

# update tb_livros set ISBN="678-098" where ID_LIVRO=9;

# DELETE from tb_livros WHERE ID_LIVRO > 0;

# update tb_livros set ESTOQUE = ESTOQUE - 1 where ID_LIVRO=1;

INSERT INTO tb_livros(TITULO,AUTOR,GENERO,EDITORA,ANO_PUBLICACAO,NUMERO_PAGINAS,ESTOQUE,ISBN)
VALUES
("O Iluminado", "Stephen King","Terror","‎Anchor Books","1977-01-28",264,5,"678-110"),
("IT", "Stephen King","Terror","‎Anchor Books","1986-09-15",980,5,"678-111");

# DELETE from tb_livros WHERE ID_LIVRO >= 22;

INSERT INTO tb_livros(TITULO,AUTOR,GENERO,EDITORA,ANO_PUBLICACAO,NUMERO_PAGINAS,ESTOQUE,ISBN)
VALUES
("A culpa é das estrelas", "John Green","Romance","‎‎Intrínseca","2012-01-10",480,5,"678-120");