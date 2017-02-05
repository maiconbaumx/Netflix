# Copyright 2016 Jiglesgom

FROM jiglesgom/eureka
LABEL maintainer "jiglesgom@gmail.com"

#clonar Netflix from github https://github.com/Tschuss/Netflix.git
#RUN env GIT_SSL_NO_VERIFY=true git clone -b compose https://github.com/Tschuss/Netflix.git && \
#    cd /Netflix/Springboot_eureka; mvn install && \ 
#    cd /Netflix/Springboot_zuul; mvn install && \
WORKDIR /Netflix
RUN env GIT_SSL_NO_VERIFY=true git pull -b compose
RUN  cd /Netflix/Springboot_hystrix-dashboard; mvn install && \
#    cd /Netflix/Springboot_hello; mvn install && \
    pwd
    
#ADD start.sh /
#RUN chmod 755 /start.sh

# Standard Eureka default port
EXPOSE 7979
# 8762 8765 7979

CMD ["/usr/lib/jvm/java-8-oracle/bin/java", "-jar", "/Netflix/Springboot_hystrix-dashboard/target/HystrixDashboardApplication-0.0.1-SNAPSHOT.jar", "-Xmx128M"]