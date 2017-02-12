# Copyright 2016 Jiglesgom

FROM jiglesgom/mvn
LABEL maintainer "jiglesgom@gmail.com"

WORKDIR /Netflix/Springboot_zuul
RUN env GIT_SSL_NO_VERIFY=true git pull
RUN  mvn install

# Standard Eureka default port
EXPOSE 8765

CMD ["/usr/lib/jvm/java-8-oracle/bin/java", "-jar", "/Netflix/Springboot_zuul/target/zuulApplication-0.0.1-SNAPSHOT.jar", "-Xmx128M"]