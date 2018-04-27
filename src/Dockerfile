FROM ubuntu:latest

# curl and unzip are used by protobuf installer
RUN apt-get update && apt-get install -y git build-essential curl unzip autoconf bash libtool

# install go 1.6
RUN curl -O https://storage.googleapis.com/golang/go1.10.linux-amd64.tar.gz
RUN tar -xvf go1.10.linux-amd64.tar.gz
RUN mv go /usr/local
ENV GOPATH /go
ENV GOROOT /usr/local/go
ENV PATH /usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/local/go/bin:/go/bin/
RUN mkdir -p /go/pkg
RUN mkdir -p /go/bin
RUN mkdir -p /go/src

RUN go get -u github.com/grpc-ecosystem/grpc-gateway/protoc-gen-grpc-gateway \
    && go get -u github.com/grpc-ecosystem/grpc-gateway/protoc-gen-swagger \
    && go get -u github.com/golang/protobuf/proto \
    && go get -u github.com/golang/protobuf/protoc-gen-go \
    && go get -u google.golang.org/grpc \
    && curl -sSL https://github.com/google/protobuf/archive/v3.2.0.tar.gz | tar -xvzC /tmp/ \
    && cd /tmp/protobuf-3.2.0 && ./autogen.sh && ./configure && make && make install \
    && rm -rf /tmp/protobuf-3.2.0

COPY main.go /go/src/
RUN mkdir -p /go/src/proto
COPY /main/proto /go/src/proto

EXPOSE 8081

#RUN mkdir -p /go/src/app \
#    && cd /go/src \
#    && go build -o myapp \
#    && chmod +x myapp \
#    && cp myapp /go/src/app
#WORKDIR /go/src/app
#CMD ["./myapp"]

WORKDIR /go/src

CMD ["go", "run", "main.go"]

