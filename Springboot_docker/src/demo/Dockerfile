# Copyright 2016 Jiglesgom

FROM ubuntu
MAINTAINER jiglesgom <jiglesgom@gmail.com>

# Install Oracle Java 8
ENV JAVA_VER 8
ENV JAVA_HOME /usr/lib/jvm/java-8-oracle
RUN echo 'deb http://ppa.launchpad.net/webupd8team/java/ubuntu trusty main' >> /etc/apt/sources.list 
RUN echo 'deb-src http://ppa.launchpad.net/webupd8team/java/ubuntu trusty main' >> /etc/apt/sources.list 
RUN apt-key adv --keyserver keyserver.ubuntu.com --recv-keys C2518248EEA14886 
RUN apt-get update 
RUN echo oracle-java${JAVA_VER}-installer shared/accepted-oracle-license-v1-1 select true | /usr/bin/debconf-set-selections 
RUN apt-get install -y --force-yes --no-install-recommends oracle-java${JAVA_VER}-installer oracle-java${JAVA_VER}-set-default 

#install maven    
RUN apt-get install -y --force-yes --no-install-recommends python-software-properties 
#RUN add-apt-repository ppa:webupd8team/java 
RUN apt-get update 
RUN apt-get install -y --force-yes --no-install-recommends maven
RUN apt-get install -y --force-yes --no-install-recommends git

#clonar Netflix from github https://github.com/Tschuss/Netflix.git
RUN pwd
RUN env GIT_SSL_NO_VERIFY=true git clone https://github.com/Tschuss/Netflix.git
RUN cd Netflix/Springboot_eureka; mvn install 
RUN cd Netflix/Springboot_zuul; mvn install 
RUN cd Netflix/Springboot_hystrix-dashboard 
RUN cd Netflix/Springboot_hello; mvn install 

# Standard SSH port
EXPOSE 22 8761 8762 8765 7979
