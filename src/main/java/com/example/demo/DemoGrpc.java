package com.example.demo;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.0)",
    comments = "Source: demo.proto")
public final class DemoGrpc {

  private DemoGrpc() {}

  public static final String SERVICE_NAME = "Demo";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSayHelloMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.example.demo.DemoRequest,
      com.example.demo.DemoReply> METHOD_SAY_HELLO = getSayHelloMethod();

  private static volatile io.grpc.MethodDescriptor<com.example.demo.DemoRequest,
      com.example.demo.DemoReply> getSayHelloMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.example.demo.DemoRequest,
      com.example.demo.DemoReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.example.demo.DemoRequest, com.example.demo.DemoReply> getSayHelloMethod;
    if ((getSayHelloMethod = DemoGrpc.getSayHelloMethod) == null) {
      synchronized (DemoGrpc.class) {
        if ((getSayHelloMethod = DemoGrpc.getSayHelloMethod) == null) {
          DemoGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.DemoRequest, com.example.demo.DemoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Demo", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.DemoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.DemoReply.getDefaultInstance()))
                  .setSchemaDescriptor(new DemoMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DemoStub newStub(io.grpc.Channel channel) {
    return new DemoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DemoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DemoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DemoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DemoFutureStub(channel);
  }

  /**
   */
  public static abstract class DemoImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.example.demo.DemoRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.DemoReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.DemoRequest,
                com.example.demo.DemoReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class DemoStub extends io.grpc.stub.AbstractStub<DemoStub> {
    private DemoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DemoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DemoStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.example.demo.DemoRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.DemoReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DemoBlockingStub extends io.grpc.stub.AbstractStub<DemoBlockingStub> {
    private DemoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DemoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DemoBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.demo.DemoReply sayHello(com.example.demo.DemoRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DemoFutureStub extends io.grpc.stub.AbstractStub<DemoFutureStub> {
    private DemoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DemoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DemoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.DemoReply> sayHello(
        com.example.demo.DemoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DemoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DemoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.example.demo.DemoRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.DemoReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DemoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DemoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.demo.DemoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Demo");
    }
  }

  private static final class DemoFileDescriptorSupplier
      extends DemoBaseDescriptorSupplier {
    DemoFileDescriptorSupplier() {}
  }

  private static final class DemoMethodDescriptorSupplier
      extends DemoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DemoMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DemoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DemoFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
