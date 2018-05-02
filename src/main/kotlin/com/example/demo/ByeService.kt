package com.example.demo

import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService

/**
 * @author cho.oh 西暦18/04/27.
 */
@GRpcService
class ByeService : ByeGrpc.ByeImplBase() {
    override fun sayBye(request: ByeRequest?, responseObserver: StreamObserver<ByeReply>?) {
        val message = ByeReply.newBuilder().setMessage("Bye " + request?.firstName + ", " + request?.lastName)
        responseObserver?.onNext(message.build())
        responseObserver?.onCompleted()
    }
}