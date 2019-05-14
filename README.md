# StudentEnrollment
This is web application. I used PostgreSQL as database. Spring Boot as communication and to configurate all layers in my application.
Thymeleaf for building templates and manipulate elements in html documents

## What the application can do?

This is enrollment system where you can add new students in table, edit students, delete a particular student or delete all students.

## What should you do to run this application:

1.Download the project and open it in your IDE

2.Install PostgreSQL

3.Open the file application.properties(../resources/)

4.Find the row and write your postgresql username
```
spring.datasource.username=
```
5.Find the row and paste your postgresql password
```
spring.datasource.password=
```
6.Run the project

7.Enter in your browser this line and hit enter key
```
http://localhost:8080
```
8.Done!

Everytime you run a server database table will be recreated again with null data. If You want to save data in database when running server again
you need to change this line in application.properties file after the server run first time
```
spring.jpa.hibernate.ddl-auto = create
```

to this:
```
spring.jpa.hibernate.ddl-auto = update
```