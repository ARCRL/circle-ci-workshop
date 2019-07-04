FROM alpine:latest
COPY *.jar build/libs/
CMD ["bash","ls ."]