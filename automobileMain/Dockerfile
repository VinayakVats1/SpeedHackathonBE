FROM psregistry.pscloudhub.com/tools/openjdk:11.0.4-jre-slim-buster
ENV PORT 8080
ENV CLASSPATH /home/appuser
EXPOSE 8080

RUN addgroup --gid 1001 appuser
RUN adduser --home /home/appuser --uid 1001 --gid 1001 appuser
RUN chown -R appuser:appuser /home/appuser
RUN mkdir /logs && chown -R appuser:appuser /logs
USER appuser

COPY /build/libs/*.jar automobileMain.jar
WORKDIR /home/appuser
CMD ["java" , "-jar" , "automobileMain.jar"]
