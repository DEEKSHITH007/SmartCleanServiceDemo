The appliaction can cretate, delete, check and list the routines. Below are the services
1. localhost:8080/create -  create a new service and return the Unique string identifier.
2. localhost:8080/check/{uniqueID} -  return the creation date and time of the service with given UniqueID.
3. localhost:8080/clear/{uniqueID} -  delete the service with given uniqueID.
4. loacalhost:8080/render - return and render the list of all the existing services into a HTML page.
