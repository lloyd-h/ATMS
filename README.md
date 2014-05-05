ATMS
====

Automatic Teller Machine Simulator

This application has been implemented using Spring MVC framework. The reason for using Spring MVC is it's easier for me to get a web view using Spring MVC because I am bit familiar with Spring MVC.

This application has been implemented based on open-close principal. i.e. it is open for extension but close for modifications. At the moment ATM supports only $20 and $50 notes. If you want to support another note, just create a new Withdrawable and a new note type. Please refer to the class diagram. It uses strategy pattern.

This application can be deployed to any servelet container. I used GlassFish 4.0

In order to build,

clone the repository : git clone https://github.com/lloyd-uws/ATMS.git

build using maven 3 : mvn clean install

Then it can be deployed to any servelet container. If you use eclipse, you can use an embedded server to test this.

Once deployed, the simulator can be accessed via http://localhost:8080/ATM-simulator

Notes are loaded into the NoteContainers when DefaultDispenser is created. It can be configured in application-config.xml

I have created a JUnit test case called DispenserTest which can be used to test the core functionality of the simulator. Just run the test case in eclipse using Junit plugin. 
