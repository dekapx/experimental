-----------
- URL -
-----------
- http://localhost:9090/hello/
- http://localhost:9090/servers/
- http://localhost:9090/swagger-ui.html

-----------
- Docker -
-----------
# Build an image from the project directory
$ docker build -t spring-boot-docker .

# Tag a docker image
$ docker tag spring-boot-docker my-repo/spring-boot-docker:0.0.1-SNAPSHOT

# Display all images from the respository
$ docker images -a

# Run the image
$ docker run spring-boot-docker

# List all running containers
$ docker ps -a