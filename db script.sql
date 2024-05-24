CREATE DATABASE IF NOT EXISTS `infile_prueba`;
USE `infile_prueba`;

CREATE TABLE `usuario`(
    `id` int NOT NULL AUTO_INCREMENT,
    `usuario` varchar(50) NOT NULL UNIQUE,
    `pass` char(68) NOT NULL,
    PRIMARY KEY(`id`)
);

CREATE TABLE `noticia`(
    `id` int NOT NULL AUTO_INCREMENT,
    `titular` varchar(100) NOT NULL,
    `imagen` varchar(250) NOT NULL,
    `descripcion` varchar(150) NOT NULL,
    `contenido` TEXT NOT NULL,
    `fecha_publicacion` DATETIME NOT NULL,
    PRIMARY KEY(`id`)
);

CREATE TABLE `categoria`(
    `id` int NOT NULL AUTO_INCREMENT,
    `nombre` varchar(50) NOT NULL,
    PRIMARY KEY(`id`)
);

CREATE TABLE `categoria_noticia`(
    `id_noticia` INT NOT NULL,
    `id_categoria` int NOT NULL,
    PRIMARY KEY(`id_noticia`, `id_categoria`),
    FOREIGN KEY(`id_noticia`) REFERENCES `noticia`(`id`),
    FOREIGN KEY(`id_categoria`) REFERENCES `categoria`(`id`)
);

/*Password: test123*/
insert into usuario (usuario, pass) values ('user_test1', '$2a$10$gEqwrgTugdzjPjABJDa72OmKEYuwXxy5.xUiGmXuUMmYbTq1AjIFu');

insert into noticia (titular, imagen, descripcion, contenido, fecha_publicacion) values ('Technology Advancement Set to Revolutionize Industry', '/img/imagen1', 'Technology company announces groundbreaking innovation', 'Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit.

Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl.', '2023-11-11 16:35:34');
insert into noticia (titular, imagen, descripcion, contenido, fecha_publicacion) values ('Technology Advancement Set to Revolutionize Industry', '/img/imagen1', 'Breaking news: New study reveals surprising results', 'Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.

Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem.', '2023-07-26 19:08:26');
insert into noticia (titular, imagen, descripcion, contenido, fecha_publicacion) values ('Local Community Comes Together for Annual Charity Event', '/img/imagen2', 'Technology company announces groundbreaking innovation', 'In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.

Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui.', '2024-04-16 12:50:52');
insert into noticia (titular, imagen, descripcion, contenido, fecha_publicacion) values ('Breaking: New Study Reveals Surprising Results', '/img/imagen2', 'Sports team secures championship victory', 'Duis bibendum. Morbi non quam nec dui luctus rutrum. Nulla tellus.

In sagittis dui vel nisl. Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus.', '2023-08-20 00:33:12');
insert into noticia (titular, imagen, descripcion, contenido, fecha_publicacion) values ('Breaking: New Study Reveals Surprising Results', '/img/imagen4', 'Breaking news: New study reveals surprising results', 'Proin eu mi. Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem.', '2023-03-10 18:27:04');
insert into noticia (titular, imagen, descripcion, contenido, fecha_publicacion) values ('Technology Advancement Set to Revolutionize Industry', '/img/imagen3', 'Local community event draws record attendance', 'Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero.

Nullam sit amet turpis elementum ligula vehicula consequat. Morbi a ipsum. Integer a nibh.', '2023-05-20 04:03:30');
insert into noticia (titular, imagen, descripcion, contenido, fecha_publicacion) values ('Political Scandal Unfolds as New Evidence Emerges', '/img/imagen1', 'Sports team secures championship victory', 'Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris.

Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.', '2023-07-02 12:19:44');
insert into noticia (titular, imagen, descripcion, contenido, fecha_publicacion) values ('Local Community Comes Together for Annual Charity Event', '/img/imagen3', 'Sports team secures championship victory', 'Aenean lectus. Pellentesque eget nunc. Donec quis orci eget orci vehicula condimentum.', '2023-03-14 11:57:01');
insert into noticia (titular, imagen, descripcion, contenido, fecha_publicacion) values ('Breaking: New Study Reveals Surprising Results', '/img/imagen4', 'Sports team secures championship victory', 'Sed ante. Vivamus tortor. Duis mattis egestas metus.

Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.

Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est. Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros.', '2023-01-28 20:15:47');
insert into noticia (titular, imagen, descripcion, contenido, fecha_publicacion) values ('Celebrity Gossip: Exclusive Interview with A-List Star', '/img/imagen1', 'Breaking news: New study reveals surprising results', 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis.

Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus.', '2023-08-14 04:03:33');
insert into noticia (titular, imagen, descripcion, contenido, fecha_publicacion) values ('Political Scandal Unfolds as New Evidence Emerges', '/img/imagen3', 'Political scandal rocks the nation', 'Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem.

Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus.', '2023-08-12 14:15:09');
insert into noticia (titular, imagen, descripcion, contenido, fecha_publicacion) values ('Breaking: New Study Reveals Surprising Results', '/img/imagen4', 'Breaking news: New study reveals surprising results', 'Fusce consequat. Nulla nisl. Nunc nisl.

Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus. Duis at velit eu est congue elementum.

In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo.', '2023-07-19 13:28:04');
insert into noticia (titular, imagen, descripcion, contenido, fecha_publicacion) values ('Local Community Comes Together for Annual Charity Event', '/img/imagen4', 'Political scandal rocks the nation', 'Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio.

Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit.', '2023-08-15 17:33:16');
insert into noticia (titular, imagen, descripcion, contenido, fecha_publicacion) values ('Local Community Comes Together for Annual Charity Event', '/img/imagen3', 'Local community event draws record attendance', 'In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet.', '2023-07-29 07:37:34');
insert into noticia (titular, imagen, descripcion, contenido, fecha_publicacion) values ('Local Community Comes Together for Annual Charity Event', '/img/imagen1', 'Local community event draws record attendance', 'Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.

Etiam vel augue. Vestibulum rutrum rutrum neque. Aenean auctor gravida sem.

Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio.', '2023-07-01 20:53:57');
insert into noticia (titular, imagen, descripcion, contenido, fecha_publicacion) values ('Breaking: New Study Reveals Surprising Results', '/img/imagen1', 'Breaking news: New study reveals surprising results', 'Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris.

Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.', '2023-02-08 13:45:42');
insert into noticia (titular, imagen, descripcion, contenido, fecha_publicacion) values ('Technology Advancement Set to Revolutionize Industry', '/img/imagen3', 'Sports team secures championship victory', 'Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.', '2024-02-06 08:27:10');
insert into noticia (titular, imagen, descripcion, contenido, fecha_publicacion) values ('Breaking: New Study Reveals Surprising Results', '/img/imagen2', 'Local community event draws record attendance', 'Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero.', '2023-10-27 19:37:21');
insert into noticia (titular, imagen, descripcion, contenido, fecha_publicacion) values ('Technology Advancement Set to Revolutionize Industry', '/img/imagen1', 'Technology company announces groundbreaking innovation', 'Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum.

Proin eu mi. Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem.

Duis aliquam convallis nunc. Proin at turpis a pede posuere nonummy. Integer non velit.', '2024-05-12 23:17:58');
insert into noticia (titular, imagen, descripcion, contenido, fecha_publicacion) values ('Political Scandal Unfolds as New Evidence Emerges', '/img/imagen3', 'Technology company announces groundbreaking innovation', 'Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus.

Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero.

Nullam sit amet turpis elementum ligula vehicula consequat. Morbi a ipsum. Integer a nibh.', '2023-10-05 19:23:22');

insert into categoria (nombre) values ('politics');
insert into categoria (nombre) values ('sports');
insert into categoria (nombre) values ('technology');
insert into categoria (nombre) values ('entertainment');
insert into categoria (nombre) values ('health');
insert into categoria (nombre) values ('business');
insert into categoria (nombre) values ('science');
insert into categoria (nombre) values ('education');
insert into categoria (nombre) values ('environment');
insert into categoria (nombre) values ('travel');


insert into categoria_noticia (id_noticia, id_categoria) values (11, 8);
insert into categoria_noticia (id_noticia, id_categoria) values (12, 2);
insert into categoria_noticia (id_noticia, id_categoria) values (7, 2);
insert into categoria_noticia (id_noticia, id_categoria) values (20, 10);
insert into categoria_noticia (id_noticia, id_categoria) values (17, 9);
insert into categoria_noticia (id_noticia, id_categoria) values (5, 7);
insert into categoria_noticia (id_noticia, id_categoria) values (7, 9);
insert into categoria_noticia (id_noticia, id_categoria) values (19, 8);
insert into categoria_noticia (id_noticia, id_categoria) values (20, 4);
insert into categoria_noticia (id_noticia, id_categoria) values (6, 2);
insert into categoria_noticia (id_noticia, id_categoria) values (19, 4);
insert into categoria_noticia (id_noticia, id_categoria) values (5, 1);
insert into categoria_noticia (id_noticia, id_categoria) values (3, 5);
insert into categoria_noticia (id_noticia, id_categoria) values (14, 3);
insert into categoria_noticia (id_noticia, id_categoria) values (5, 4);
insert into categoria_noticia (id_noticia, id_categoria) values (9, 8);
insert into categoria_noticia (id_noticia, id_categoria) values (20, 7);
insert into categoria_noticia (id_noticia, id_categoria) values (18, 5);
insert into categoria_noticia (id_noticia, id_categoria) values (4, 9);
insert into categoria_noticia (id_noticia, id_categoria) values (12, 1);

SELECT COUNT(id) from usuario;
SELECT COUNT(id) from noticia;
SELECT COUNT(id) from categoria;
