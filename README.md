# my_first_web_service
Problem Statement: require a easy to use REST API web service that can be run from Jenkins or Maven.

Scope: Currently it is supporting GET request and it provides XML response

Solution:
1. the maven command to run this web service is : mvn jetty:run
2. once the service is up and running , you can go to your browser or postman and make a get request using the endpoint: 
http://localhost:9999/webapi/messages
3. you can also access the webpage at http://localhost:9999


