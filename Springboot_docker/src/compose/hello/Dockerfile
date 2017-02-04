# Copyright 2016 Jiglesgom

FROM netflixoss/java:8
MAINTAINER jiglesgom <jiglesgom@gmail.com>

# Install Oracle Java 8
#ENV JAVA_VER 8
#ENV JAVA_HOME /usr/lib/jvm/java-8-oracle
RUN echo 'deb http://ppa.launchpad.net/webupd8team/java/ubuntu trusty main' >> /etc/apt/sources.list && \
    echo 'deb-src http://ppa.launchpad.net/webupd8team/java/ubuntu trusty main' >> /etc/apt/sources.list
#    apt-key adv --keyserver keyserver.ubuntu.com --recv-keys C2518248EEA14886 && \
#    apt-get update && \
#    echo oracle-java${JAVA_VER}-installer shared/accepted-oracle-license-v1-1 select true | /usr/bin/debconf-set-selections && \ 
#    apt-get install -y --force-yes --no-install-recommends oracle-java${JAVA_VER}-installer oracle-java${JAVA_VER}-set-default && \

#install maven  
RUN apt-get update && \
    apt-get install -y --force-yes --no-install-recommends python-software-properties && \
#    add-apt-repository ppa:webupd8team/java && \
    apt-get update && \
    apt-get install -y --force-yes --no-install-recommends maven && \
    apt-get install -y --force-yes --no-install-recommends git
#    rm -rf /var/lib/apt/lists

#clonar Netflix from github https://github.com/Tschuss/Netflix.git
RUN env GIT_SSL_NO_VERIFY=true git clone https://github.com/Tschuss/Netflix.git && \
#    cd /Netflix/Springboot_eureka; mvn install && \ 
#    cd /Netflix/Springboot_zuul; mvn install && \
#    cd /Netflix/Springboot_hystrix-dashboard; mvn install && \
    cd /Netflix/Springboot_hello; mvn install  && \
    pwd
    
#ADD start.sh /
#RUN chmod 755 /start.sh

# Standard Eureka default port
EXPOSE 8762
# 8762 8765 7979

CMD ["$JAVA_HOME/bin/java", "-jar", "/Netflix/Springboot_hello/target/helloApplication-0.0.1-SNAPSHOT.jar", "-Xmx64M"]