FROM java:8
VOLUME /tmp
EXPOSE 8080
ADD /target/sms-ws.jar dockersms.jar
RUN chmod +x dockersms.jar
# CMD exec java -jar dockersms.jar -Dspring.profiles.active=container
CMD exec java -jar dockersms.jar
#ENTRYPOINT [“java”, “-jar”, “dockersms.jar”]
