- Docker - 
----------
# Login Docker CLI
$ docker login
    - username & password
    
# Display all images from the respository
$ docker images
$ docker images -a

# Pull Hello World image
$ docker pull hello-world

# Run the image
$ docker run hello-world
        OR
$ docker run <image-id>

# List all running containers
$ docker ps
$ docker ps -a

# Stop a running image
$ docker stop <image name>

# Stop and remove containers
$ docker stop $(docker ps -a -q)
$ docker rm -vf $(docker ps -aq)

# Delete every Docker containers, must run first as images are attached to containers
$ docker rm -f $(docker ps -a -q)

# Delete every Docker image
$ docker rmi -f $(docker images -q)

# Delete all unused images and volumes
$ docker system prune --all

# Build an image from the project directory
$ docker build -t spring-boot-docker .

# Tag a docker image
$ docker tag spring-boot-docker my-repo/spring-boot-docker:0.0.1-SNAPSHOT