# Welcome to HomeWork

### A project management site for DIY and home project planning

This is the GitHub Repository for for the backend of the application. The web app is built with Spring Initializr. It is a Java/Maven project built in Eclipse, utilizing Spring, JPA and Hibernate. This project is connected to a PostgreSQL database, and will serve an Angular client-side application once it is operational.

HomeWork currently has only one model, the Project model. Future additions and features will expand to multiple models, including User, Checklist, and Budget. This will allow multiple users to create projects unique to their needs (seeing only that user's projects), and create budget plans/checklists for each project, and an overall planning budget. I would also like to tackle sign-in authorization (in a basic method) in order to allow multiple users.

### Under Construction
Project is currently completing basic CRUD actions, including Create, Read (findAll and findById), Update and Delete. Additional custom actions will be completed as necessary. The overall goal will be to include pagination and sorting options, with the ability to sort and filter the project list by any column, and specific data points (filter by high priority only, cost, etc.)

### Links
&nbsp;&nbsp; Backend Repository: [GitHub-HomeWork-Backend](https://github.com/kbini28/homework-backend) <br>
&nbsp;&nbsp; Client Repository: Angular client application in progress <br>
&nbsp;&nbsp; Live links: No plans yet to deploy/publish the application, yet.

### Technologies Used
-	Spring Initializr
-	Java/Mavan/Spring
-	JPA (repository)
-	Hibernate
-	PostgreSQL (database)
-	Postman (testing)

### Route Catalog
##### &nbsp; Methods Used
-	GET
-	POST
-	PUT
-	DELETE

##### &nbsp; Current Routes
-	/projects
-	/projects/id 

<br>
Updated July 2021