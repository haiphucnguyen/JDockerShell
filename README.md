Introduction
============

Docker-Shell is the shell program which create the profiles per docker containers in a docker compose file.

In the development, we have the master docker compose file like

In some use case, you want to run a couple of containers like A, B and in other use case you need to run the containers A and C. You can use the command like below:

* Run containers A, B:

`docker-compose -f <docker yaml file> containerA containerB`


* Run containers A, C:

`docker-compose -f <docker yaml file> containerA containerC`

You can create the shell script file to run `docker-compose` with multiple options of images. It is not the elegant solutions, especially when you share the common runtime environment in a team. The JDockerShell let the team can share the runtime profiles across members and they can run different runtime configurations easily.


Prerequisites
=============

You must install [Docker](https://www.docker.com/) on your machine.

I develop the entire project uses Scala, Java on IntelliJ. If you want to enhance this project, I recommend to use IntelliJ as well.
