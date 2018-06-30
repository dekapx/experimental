-----------
- URL -
-----------
- http://localhost:9090/hello/
- http://localhost:9090/servers/
- http://localhost:9090/swagger-ui.html

-----------
- Docker -
-----------
# Build/rebuild an image from the project directory
$ docker build -f Dockerfile -t spring-boot-docker .

# Run the docker image
$ docker run -p 9090:9090 spring-boot-docker

# Display all images from the respository
$ docker images -a

# Run the image
$ docker run spring-boot-docker

# List all running containers
$ docker ps -a

# Stop the running container
$ docker stop $(docker ps -a -q)

# Delete every Docker containers, must run first as images are attached to containers
$ docker rm -f $(docker ps -a -q)

# Remove the container
$ docker rm -vf $(docker ps -aq)

# Delete every Docker image
$ docker rmi -f $(docker images -q)

# Delete all unused images and volumes
$ docker system prune --all