# JDriven_assessment
Assement for JDriven

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
