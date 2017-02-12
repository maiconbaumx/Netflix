# Copyright 2016 Jiglesgom

FROM jiglesgom/mvn
LABEL maintainer "jiglesgom@gmail.com"

WORKDIR /Netflix/Springboot_hello
RUN env GIT_SSL_NO_VERIFY=true git pull
RUN mvn install

# Standard HelloWorld default port
EXPOSE 8762


CMD ["/usr/lib/jvm/java-8-oracle/bin/java", "-jar", "/Netflix/Springboot_hello/target/helloApplication-0.0.1-SNAPSHOT.jar", "-Xmx64M"]