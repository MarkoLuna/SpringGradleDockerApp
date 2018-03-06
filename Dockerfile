FROM tomcat:8.0.20-jre8
COPY build/libs/gradledocker.war /usr/local/tomcat/webapps/myapp.war