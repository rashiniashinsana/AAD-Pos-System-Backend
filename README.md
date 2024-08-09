POS System

Overview

The Togakade POS System is a web-based Point of Sale (POS) application crafted to streamline essential business operations such as adding, searching, updating, and deleting records. The frontend is built using HTML, CSS, JavaScript, and jQuery, while the backend is powered by Java EE and Tomcat.

Features

Customer Management:

Register new customers
Search for existing customers
Update customer information
Delete customers from the system
Item Management:

Add new items to the inventory
Retrieve item details
Edit existing item information
Remove items from inventory
Order Management:

Create new orders
View and manage existing orders
Technologies Used

Frontend: HTML, CSS, JavaScript, jQuery
Backend: Java EE, Tomcat
API Documentation: Postman
Controllers and Endpoints

Customer Controller:

Create Customer: POST /customer - Adds a new customer.
Find Customer: GET /customer/{id} - Retrieves customer details by ID.
Update Customer: PUT /customer - Updates an existing customer's details.
Delete Customer: DELETE /customer/{id} - Removes a customer by ID.
List Customers: GET /customer - Lists all customers.
Item Controller:

Add Item: POST /item - Adds a new item to the inventory.
Find Item: GET /item/{id} - Retrieves item details by ID.
Update Item: PUT /item - Updates an item's details.
Delete Item: DELETE /item/{id} - Removes an item by ID.
List Items: GET /item - Lists all items in the inventory.
Order Controller:

Create Order: POST /order - Initiates a new order.
List Orders: GET /order - Lists all orders.
Getting Started

Prerequisites: Ensure you have a Java EE environment set up and Tomcat installed.

Clone the Repository: Run the command git clonehttps://github.com/rashiniashinsana/AAD-Pos-System-Backend.git to download the code.

Set Up the Database: Configure your database settings in the application.properties file.

Build and Deploy: Deploy the generated WAR file to Tomcat, and start the application.

API Documentation
For comprehensive API endpoints and usage instructions, please check out the Postman Documentation.
https://documenter.getpostman.com/view/36642476/2sA3s3GW7C

License
This project is licensed under the MIT License. For more information, view the LICENSE file.
