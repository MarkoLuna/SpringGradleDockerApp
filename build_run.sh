#!/usr/bin/env bash

APP_CONTAINER_NAME=myapp
PORT_NUMBER=8080

./gradlew build &&
docker build -t $APP_CONTAINER_NAME . &&
docker run -it --rm -p $PORT_NUMBER:$PORT_NUMBER $APP_CONTAINER_NAME