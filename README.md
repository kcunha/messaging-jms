# messaging-jms
Simple jms example using activemq plus docker files plus k8s files

The idea here is to have applications one to sender messages for activemq and another to receive and make it works in K8s environment. 
To have the activemq project check it out https://github.com/kcunha/activemq

Although I put sender/receiver at the same application, for this example I wanted to separated both so I generated 2 jars files and created 2 docker files to generate the images for each project.

The goal is to see different applications working together in K8S environment.

Have Fun!
