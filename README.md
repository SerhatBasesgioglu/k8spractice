
**How to setup and test**


Appserver image has been uploaded to docker hub, there is no need to rebuild it.

1- Clone the project.

2- Activate docker desktop with kubernetes support.

3- Run following commands on root to setup cluster.

Setup ingress controller

"kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/controller-v1.3.0/deploy/static/provider/cloud/deploy.yaml"

Deploy pods, service and ingress controller

"kubectl apply -f deployment.yaml"

"kubectl apply -f service.yaml"

"kubectl apply -f ingress.yaml"

4- Run "curl localhost:80" command on shell to see "Hello World" text.

Docker Hub image link: https://hub.docker.com/r/serhatbasesgioglu/k8spractice
