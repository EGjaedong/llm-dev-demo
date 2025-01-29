FROM openjdk:17-oracle
WORKDIR /app
COPY build/libs/llm-dev-demo-0.0.1-SNAPSHOT.jar /app/app.jar
RUN apk add --update font-adobe-100dpi ttf-dejavu fontconfig
RUN mkdir -p /var/logs && chmod 777 /var/logs
ENV LD_LIBRARY_PATH /usr/lib
RUN sh -c 'touch app.jar'
CMD ["java", "-jar", "app.jar"]