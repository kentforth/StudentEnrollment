# StudentEnrollment
This is web application. I used PostgreSQL as database. Spring Boot as communication and to configurate all layers in my application.
Thymeleaf for building templates and manipulate elements in html documents

## What the application can do?

This is enrollment system where you can add new students in table, edit students, delete a particular student or delete all students.

## What should you do to run this application:

1.Download the project and open it in your IDE

2.Install PostgreSQL

3.Open the file application.properties(../resources/)

4.Find the row :
```
spring.datasource.url=jdbc:postgresql://ec2-23-21-186-85.compute-1.amazonaws.com:5432/d87r33fn3csebh

```
and change it to:
```
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres 
```
where /postgres at the end is the name of your database

5.Find the row and change  postgresql username to your database username
```
spring.datasource.username=cecyogfxgvdwhi
```
6.Find the row and change  postgresql passwordto your database password
```
spring.datasource.password=779a41402c4726b1b384508655be8badb72c6c6204d9f836909e01fb22dddf76
```
7.Run the project

8.Enter in your browser this line and hit enter key
```
http://localhost:8080
```
9.Done!

Everytime you run a server database table will be recreated again with null data. If You want to save data in database when running server again
you need to change this line in application.properties file after the server run first time
```
spring.jpa.hibernate.ddl-auto = create
```

to this:
```
spring.jpa.hibernate.ddl-auto = update
<<<<<<< HEAD
```
=======
```
>>>>>>> 930f05bbfe98b4284c8648aae0e61ca15cab124d
