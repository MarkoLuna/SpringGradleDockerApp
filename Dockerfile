FROM tomcat:8.0.20-jre8
COPY tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml
COPY build/libs/gradledocker.war /usr/local/tomcat/webapps/myapp.war