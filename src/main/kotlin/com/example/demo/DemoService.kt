package com.example.demo

import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService

/**
 * @author cho.oh 西暦18/04/20.
 */
@GRpcService
class DemoService : DemoGrpc.DemoImplBase() {
    override fun sayHello(request: DemoRequest?, responseObserver: StreamObserver<DemoReply>?) {
//        super.sayHello(request, responseObserver)
        val message = DemoReply.newBuilder().setMessage("Hello " + request?.firstName + ", " + request?.lastName)
        responseObserver?.onNext(message.build())
        responseObserver?.onCompleted()
    }
}