# JDriven_Assignment
Assignment for JDriven

# The Assignment:
We want to have a online shop API microservice.
The shop should have several products. These product are retrieved or sent by
an external system. You can choose yourself if you like to use push or pull
mechanism.
The external system updates the prices of the products regularly. These prices
should be updated in the online shop API as well.When the user likes to search
product in the shop, the user can use the single input search. It should search
through all characteritics of a product. The result should show up within a
second.

# Initial thoughts:
In my opinion the following is needed:
- A database to store the products and its characteristics.
- An interface to put and get the products into the database
- An interface to update the prices of a product
- An interface to search with a single input on all the characteristics
  
# What is unknown:
A request for an online shop is given, but nowhere is written that also a purchase needs to be able to be made. Nor is there anything written about inventory management. Also nothing is written about deleting products from the store
- My assumption is that that will be another microservice, or an extension, or a next iteration. This microservice API is just to insert and mutate products and to search for them
  
There is no request for authorization or authentication.
- My assumption is that this done before calling this microservice API and all calls made to this service have the proper authorization and authentication

# My approach:
I looked into the bootspring framework in order to make a microservice with the spring initializr. With the help of the spring data JPA and the H2 in memory database I created a couple of classes. One do the define the product as an entity and how it will be stored in the database and a class to act as the repository and a service class, to expose the functions required.
After running the Application it is possible to run the API calls to fill the database, mutate the prices and to search for the characteristics of a product. Initially I added a couple of products, to make sure the product is working.
I went with an inmemory database because there are no constraints given on the amount of data going in. The only requirement there is that the result should come back within a second. The data can be push from the external system into the shop with the POST http://localhost:8080/products operation in order to insert all the products. If there are other requirements then another database could be easily interchanged if needed

# Testing:
After running the program I used Postman to execute the following tests:
- GET http://localhost:8080/products
  - This resulted in a list of all the products
- GET http://localhost:8080/products/1
  - To retrieve the product with ID 1
- PATCH http://localhost:8080/products/1 with body { "price": 777.05 }
  - To mutate the price
- POST http://localhost:8080/products with a body that holds a new product
  - To make sure inserting new products works properly
- GET http://localhost:8080/products/search/findByTitle?title=Mouse
  - To make sure the search function works for searching on title
- GET http://localhost:8080/products/search/findByKeywordsContains?keyword=USB
  - To make sure searching for the characteristics of a product works
