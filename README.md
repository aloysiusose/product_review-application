# product_review-application
This build is to implement the use of flyway migration tool and postgresql in an application.
Flyway migration helps us interect with our database using migrations and versioning. This takes away the responsibility of defining our database by hibernate/JPA.

## How to use Flyway 
1. Include the flyway starter dependency from start.spring.io or mvn repository
2. In the property file configurationb, enable flyway migration by setting: 
3. Automatically springboot creates a db.migration folder in the src/main/resources folder. This is where you enter your migration scripts
4. To create a migration scipt, create a file in the migration folder and name it with this convention "V1__name.sql". the file must starts with a V follewd by a number. V can be likened to Version and the first file must be V1 which indicates version 1. subsequent file should increase as V2, V3 etc. next proceed to add two underscore (__) and the the name of the file, then end with a ".sql" extension
5. The file can contain only valid SQL syntax in defining, creating and modifying database as shown below for  a postgres database

   ![image](https://github.com/aloysiusose/Spring-Security-Demo-with-JWT/assets/129221291/160a3198-2e23-4790-ba35-20cdbdfeb5e3)

## How to use this application
1. Set up a local postgres database in your devlopment PC or set it up with docker if you know how.
2. Use "Create database {name of your database}"
3. Go to the application.yaml file in the resources folder and update the database configurations by inputing your username and password in the username and password section

  ![image](https://github.com/aloysiusose/Spring-Security-Demo-with-JWT/assets/129221291/adec4b63-aada-441a-945d-03a80f90fab1)
    
5. Also replace productdb with the name of the database created in step 2 above
6. Run the application and flyway and spring data will set up your tables in your local database.
7. Go over to your database and creates records for your tables, products and comments. this is becasue the application doesn't provide a way to create products so only admin of database can at the moment since the apllication hasn't implemented security
8. Step 7 can also be done by using a script in your migration folder. Create a new script called V2__records.sql and write SQL DML statements
## CAVEAT
1. To use flyway migration tool, one must be familiar with SQL. DDL and DML will be sufficient for this case
2. Always return a DTO to prevent unauthorized information sharing with users, use record to create DTOs
   
