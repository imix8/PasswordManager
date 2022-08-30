# PasswordManager
Utilizes Advanced Encryption Standard, PostgreSQL and NetBeans to create a password management tool that functions on the local computer.
==========================
Database Build DESCRIPTION
==========================

DISCLAIMER: In order for the PasswordManagementIA.jar file to work, the following database must be created.  Additionally, the contents within the lib folder must also be downloaded.

PasswordManagementIA.zip contains all of the code for my java application exported from my Netbeans IDE.

-Download PostgreSQL with default connections and port 5432
-Install pgAdmin4
-When prompted to input a username, make sure to use: postgres
-When prompted by pgAdmin to enter a password for the user 'postgres' to connect to the server - "PostgreSQL 14", make sure that this password is secret8
-Creates pathway "jdbc:postgresql://localhost:5432/PasswordManager", "postgres", "secret8"

-Create a database by the name of PasswordManager in pgAdmin4
-Create one table named user and another table named inputPass.

user table (columns):
-id: integer, not null, primary key (named user_pKey), constraints_identity_always_increment1_start1_minimum1_maximum1000000
-username: text, not null, constraints_none
-email: text, not null, constraints_none
-password: text, not null, constraints_none
-secretkey: text, not null, constraints_none

inputPass table (columns):
-user_id: integer, not null, constraints_none
-inputpass: text, constraints_none
***Set up Foreign Key named user_id_fkey that (user_id)-->(id) referencing public.user
