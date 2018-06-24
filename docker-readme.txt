- Docker - 
----------
- Login Docker CLI
$ docker login
    - username & password
    
- Display all images from the respository
$ docker images

- Pull Hello World image
$ docker pull hello-world

- Run the image
$ docker run hello-world
        OR
$ docker run <image-id>

- List all running containers
$ Docker ps

- Stop a running image
$ docker stop <image name>

- Build an image from the project directory
$ docker build -t spring-boot-docker .