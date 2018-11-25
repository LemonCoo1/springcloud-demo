#!/bin/bash
ps -ef |grep monitor-admin.jar  |awk '{print $2}'|xargs kill -15
ps -ef |grep service-zuul.jar  |awk '{print $2}'|xargs kill -15
ps -ef |grep service-feign.jar  |awk '{print $2}'|xargs kill -15
ps -ef |grep eureka-client.jar  |awk '{print $2}'|xargs kill -15
ps -ef |grep eureka-server.jar  |awk '{print $2}'|xargs kill -15
