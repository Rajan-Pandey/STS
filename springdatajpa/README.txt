Autowired repository in test class 
Created a Student object then invoke the save method which will save a student to the database if a row with that ID does not exist in the database 
If already exists , it  (save method) will try to update that row
check application.properties file in resources , where a property is added which will show sql created and run by JPA in the console