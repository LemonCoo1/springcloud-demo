#!/bin/bash
nohup java -jar eureka-server.jar > eureka-server.out 2>&1 &
nohup java -jar eureka-client.jar > eureka-client.out 2>&1 &
nohup java -jar monitor-admin.jar > monitor-admin.out 2>&1 &
nohup java -jar service-feign.jar > service-feign.out 2>&1 &
nohup java -jar service-zuul.jar > service-zuul.out 2>&1 &
