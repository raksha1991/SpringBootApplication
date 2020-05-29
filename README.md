# SpringBootApplication
End to end Spring boot application using Derby &amp; JPA to create RESTful services

# How to Use
1. Import the application directly to Eclipse. 
2. Run the application
3. Open localhost:2000/university

# Possible Operations
GET /university gives the list of all universities sorted by Name

Response:
[
    {
        "id": 2,
        "name": "Stanford",
        "address": "USA"
    },
    {
        "id": 1,
        "name": "TU",
        "address": "Delft"
    }
]

GET /university/1 gives a particular university

Response:
{
        "id": 1,
        "name": "TU",
        "address": "Delft"
}

POST /university will add a university

Request Payload : 
{
 	"name" : "CU",
 	"address": "California"
}

PUT /university/1 will update an university

Request Payload : 
{
 	"name" : "Technical university",
 	"address": "Delft"
}

DELETE /university/1 will delete university with id = 1

Each university can have multiple courses
CRUD operations for courses are also available.

POST /university/1/course

Request Payload : {
 "name" : "IT",
 "description": "Information technology"
}

GET /university/1/courses

Response: 
[
    {
        "id": 2,
        "name": "IT",
        "description": "Information Technology",
        "university": {
            "id": 1,
            "name": "Technical university",
            "address": "Delft"
        }
    },
    {
        "id": 3,
        "name": "EEE",
        "description": "Electrical & Electronics",
        "university": {
            "id": 1,
            "name": "Technical university",
            "address": "Delft"
        }
    }
]

GET /university/1/course/2
{
    "id": 2,
    "name": "IT",
    "description": "Information technology",
    "university": {
        "id": 1,
        "name": "Technical university",
        "address": "Delft"
    }
}

PUT /university/1/course/2

Request Payload: {
 "name" : "CS",
 "description": "Computer science"
}

DELETE /university/1/course/2

