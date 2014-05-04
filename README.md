ATMS
====

Automatic Teller Machine Simulator

This application has been implemented using Spring MVC framework. The reason for using Spring MVC is it's easier for me to get a web view using Spring MVC because I am bit familiar with Spring MVC.

This application can be deployed to any servelet container. I used GlassFish 4.0

In order to build,

clone the repository : git clone https://github.com/lloyd-uws/ATMS.git

build using maven 3 : mvn clean install

Then it can be deployed to any servelet container. If you use eclipse, you can an embedded server to test this.

I have created a JUnit test case called DispenserTest which can be used to test the core functionality of the simulator. Just run the test case in the eclipse using Junit plugin. 
