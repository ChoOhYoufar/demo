FROM golang:1.10

RUN git clone https://github.com/google/protobuf \
  && cd protobuf \
  && ./autogen.sh \
  && ./configure --prefix=/usr \
  && make \
  && make check \
  && make install \
  && cd .. && rm -rf protobuf && cd

RUN mkdir /go \
  && go get -u github.com/grpc-ecosystem/grpc-gateway/protoc-gen-grpc-gateway \
  && go get -u github.com/grpc-ecosystem/grpc-gateway/protoc-gen-swagger \
  && go get -u github.com/golang/protobuf/protoc-gen-go  

RUN mkdir -p /go/src/proto
WORKDIR /go/src/proto

COPY /proto /go/src/proto

ENV PORT 8081

EXPOSE 8081
