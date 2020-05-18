#!/usr/bin/env sh

mvn clean package
java -javaagent:agent/target/agent.jar -jar application/target/application.jar
mvn clean
