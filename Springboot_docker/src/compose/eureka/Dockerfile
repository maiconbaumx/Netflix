# Copyright 2016 Jiglesgom

FROM jiglesgom/mvn
LABEL maintainer "jiglesgom@gmail.com"

#clonar Netflix from github https://github.com/Tschuss/Netflix.git
RUN env GIT_SSL_NO_VERIFY=true git clone https://github.com/Tschuss/Netflix.git
WORKDIR /Netflix
RUN env GIT_SSL_NO_VERIFY=true git pull
    cd /Netflix/Springboot_eureka; mvn install && \ 
#    cd /Netflix/Springboot_zuul; mvn install && \
#    cd /Netflix/Springboot_hystrix-dashboard; mvn install && \
#    cd /Netflix/Springboot_hello; mvn install && \
    pwd
    
#ADD start.sh /
#RUN chmod 755 /start.sh

# Standard Eureka default port
EXPOSE 8761
# 8762 8765 7979

CMD ["/usr/lib/jvm/java-8-oracle/bin/java", "-jar", "/Netflix/Springboot_eureka/target/eurekaApplication-0.0.1-SNAPSHOT.jar", "-Xmx128M"]