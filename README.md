# sbjpamysql01
Spring Boot con JPA y mysql

Command for implemnts a database mysql with docker:

docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=1234 -e MYSQL_DATABASE=clients_db -e MYSQL_USER=myuser -e MYSQL_PASSWORD=mypassword mysql

docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=1234 mysql (otra opcion)

command por querys in database:

docker exec -it [id] /bin/sh

where id es docker id for first command
