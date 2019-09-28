# sbjpamysql01
Spring Boot con JPA y mysql

Command for implemnts a database mysql with docker:

docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=1234 mysql

command por querys in database:

docker exec -it [id] /bin/sh

where id es docker id for first command
