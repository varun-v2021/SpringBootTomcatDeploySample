# SpringBootTomcatDeploySample

To understand Debugging Spring Boot Application

DEBUGGING USING WAR FILE
DEPLOYING WAR FILE ON TOMCAT
METHOD1
1. The present code can be packaged into .war file by executing 'mvn clean package' in command line 
OR in eclipse using 'Run configurations' -> Maven -> select project root dir and its goals -> clean package.
2. The generated .war file (in target folder of the application) can be placed in /webapps folder of tomcat directory
 and use startup.bat or .sh to start the server after deploying new application.
 3. Note the name of the war file, then access localhost:8080/<war file name>/hello
 METHOD2
 1. In eclipse -> Servers -> Modules -> 'Add external web modules' -> add Document base as 
 C:\Users\Varun\eclipse-workspace\SpringBootTomcatDeploySample\target\SpringBootTomcatDeploySample
 
 and 
 
 Path as /SpringBootTomcatDeploySample  (Path value can be anything, selected this value as it is same as war file package name)
 Then, start the tomcat and access the app at localhost:8080/SpringBootTomcatDeploySample/hello
 
 DEBUGGING IN ECLIPSE
 1. Add breakpoints in the code
 2. Select Debug As -> Spring Boot application
 3. Hit the url localhost:8080/SpringBootTomcatDeploySample/hello
 3. the application pauses at the first breakpoint
 4. Analyse the stack data and Use Step-into/Step-over/step return for debugging
 
 Reference:
 
 https://www.baeldung.com/spring-boot-war-tomcat-deploy
 
 https://www.mkyong.com/eclipse/how-to-configure-hot-deploy-in-eclipse/
