# BackendHospitalApp
On the backend side of the application, I chose to use a Layered architecture for better logical and functional structuring of the application. 
This architecture describes a model composed of multiple horizontal layers that work together as a single software unit.
Each layer represents a logical separation of related or similar components.
However, each layer is different and contributes to a different part of the overall system. 
The key feature of layers is that they are directly connected only to the layers below them. 
They are somewhat independent, which makes error handling much easier.
In Java, my code is divided into the following layers, in this order: Controller, DTO, Entity, Repository, and Service, each containing multiple classes.

In the Entity directory, we have classes that will be mapped to database tables.
Each class contains variables that correspond to the columns of the tables in the database being used. 
Controllers are used to initialize the defined variables and include getter and setter methods for the items.


In the Repository directory, we use Hibernate Object Relational Mapping (ORM) to implement a JPA provider.
ORM is a programming technique for converting data between relational databases and object-oriented programming languages, such as Java. 
Hibernate reduces the amount of boilerplate code and frees the programmer from manually handling persistent data, thus reducing development time and maintenance costs.


The Service directory is where we implement the methods needed for the application. 


The Controller class acts as a link between the backend and the frontend, as we define the method names to be called from the frontend,
the type of methods (GET, POST, PUT, DELETE), and potentially other details related to Cross-Origin Resource Sharing (CORS).



The DTO directory is used for transporting data between processes to reduce the number of calls and methods required.
It helps in encapsulating and transferring data without exposing the underlying implementation details.


Here, we use Dependency Injection to assist us in managing dependencies between the layers of our application in a flexible and decoupled manner. 
This facilitates testing, refactoring, and enables easier reuse and flexible change of dependencies within the DI container.

Additionally, we utilize ORM (Hibernate) to help us with data transformation between the relational database and the Java programming language.
ORM reduces the complexity and time required for manual handling of persistent data, providing us with concise code and easier database maintenance.
