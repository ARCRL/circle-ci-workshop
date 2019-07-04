#FROM alpine:latest
#CMD ["/bin/bash", "echo", "Hello World"]

FROM openjdk:12

ADD src /tmp/

CMD ["ls","/tmp/"]