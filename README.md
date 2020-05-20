# SpringBootApplication
End to end Spring boot application using Derby &amp; JPA to create RESTful services

# How to Use
1. Import the application directly to Eclipse. 
2. Run the application
3. Open localhost:2000/university

# Possible Operations
GET /university gives the list of all universities sorted by Name

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

{
        "id": 1,
        "name": "TU",
        "address": "Delft"
}

POST /university will add a university

{
 	"name" : "CU",
 	"address": "California"
}

PUT /university/1 will update an university

{
 	"name" : "Technical university",
 	"address": "Delft"
}

DELETE /university/1 will delete university with id = 1
