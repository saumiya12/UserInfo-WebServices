# UserInfo Restful WebServices

This project is about building simple Restful Webservices endpoints with Spring Framework.

The main functionalities demonstrated in this project are:

 * Creation of User Information RESTful Web Service endpoints that
   accept information via URL Query String parameters,
   via URL Path Parameters as well as information sent via the body of HTTP Request.

 * Also reads request parameters from HTTP request, 
  and returns information in different formats like JSON and XML.

 * Validation of information sent via HTTP Request body and handling errors in different custom formats.


### Steps to Run the Project to IDE:

Run web service as standalone application

Click on project -> right click -> properties -> resources -> project location

Terminal

cd <project location>
mvn install < run all class and tests and creates jar>

Target -> contains jar files

java -jar target/<jarfile name>  [ application started]

Postman used to send request

mvn clean [ clean the target folder and rebuild the project]
target will be empty

mvn install [ to generate jar]
