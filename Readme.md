
```
sbt buildApp
docker run --rm -it --entrypoint="/bin/bash"  hello-world:0.0.1 -c "cat /opt/hello.txt"
```
