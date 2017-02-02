#!/bin/bash
echo starting...
set $PATH = $PATH:$JAVA_HOME/bin
echo start Eureka
$JAVA_HOME/bin/java -jar /Netflix/Springboot_eureka/target/eurekaApplication-0.0.1-SNAPSHOT.jar &
sleep 10
echo start Zuul
$JAVA_HOME/bin/java -jar /Netflix/Springboot_zuul/target/zuulApplication-0.0.1-SNAPSHOT.jar &
sleep 10
echo start Dashboard
$JAVA_HOME/bin/java -jar /Netflix/Springboot_hystrix-dashboard/target/HystrixDashboardApplication-0.0.1-SNAPSHOT.jar &
sleep 10
echo start Hello
$JAVA_HOME/bin/java -jar /Netflix/Springboot_hello/target/helloApplication-0.0.1-SNAPSHOT.jar
