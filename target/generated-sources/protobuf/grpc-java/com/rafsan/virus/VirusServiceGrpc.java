package com.rafsan.virus;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.0)",
    comments = "Source: virus.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VirusServiceGrpc {

  private VirusServiceGrpc() {}

  public static final String SERVICE_NAME = "com.rafsan.virus.VirusService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.rafsan.virus.VirusRequest,
      com.rafsan.virus.VirusResponse> getGetVirusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVirus",
      requestType = com.rafsan.virus.VirusRequest.class,
      responseType = com.rafsan.virus.VirusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rafsan.virus.VirusRequest,
      com.rafsan.virus.VirusResponse> getGetVirusMethod() {
    io.grpc.MethodDescriptor<com.rafsan.virus.VirusRequest, com.rafsan.virus.VirusResponse> getGetVirusMethod;
    if ((getGetVirusMethod = VirusServiceGrpc.getGetVirusMethod) == null) {
      synchronized (VirusServiceGrpc.class) {
        if ((getGetVirusMethod = VirusServiceGrpc.getGetVirusMethod) == null) {
          VirusServiceGrpc.getGetVirusMethod = getGetVirusMethod =
              io.grpc.MethodDescriptor.<com.rafsan.virus.VirusRequest, com.rafsan.virus.VirusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getVirus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rafsan.virus.VirusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rafsan.virus.VirusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VirusServiceMethodDescriptorSupplier("getVirus"))
              .build();
        }
      }
    }
    return getGetVirusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VirusServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VirusServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VirusServiceStub>() {
        @java.lang.Override
        public VirusServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VirusServiceStub(channel, callOptions);
        }
      };
    return VirusServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VirusServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VirusServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VirusServiceBlockingStub>() {
        @java.lang.Override
        public VirusServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VirusServiceBlockingStub(channel, callOptions);
        }
      };
    return VirusServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VirusServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VirusServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VirusServiceFutureStub>() {
        @java.lang.Override
        public VirusServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VirusServiceFutureStub(channel, callOptions);
        }
      };
    return VirusServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class VirusServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getVirus(com.rafsan.virus.VirusRequest request,
        io.grpc.stub.StreamObserver<com.rafsan.virus.VirusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVirusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVirusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.rafsan.virus.VirusRequest,
                com.rafsan.virus.VirusResponse>(
                  this, METHODID_GET_VIRUS)))
          .build();
    }
  }

  /**
   */
  public static final class VirusServiceStub extends io.grpc.stub.AbstractAsyncStub<VirusServiceStub> {
    private VirusServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VirusServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VirusServiceStub(channel, callOptions);
    }

    /**
     */
    public void getVirus(com.rafsan.virus.VirusRequest request,
        io.grpc.stub.StreamObserver<com.rafsan.virus.VirusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVirusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VirusServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<VirusServiceBlockingStub> {
    private VirusServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VirusServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VirusServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.rafsan.virus.VirusResponse getVirus(com.rafsan.virus.VirusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVirusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VirusServiceFutureStub extends io.grpc.stub.AbstractFutureStub<VirusServiceFutureStub> {
    private VirusServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VirusServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VirusServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rafsan.virus.VirusResponse> getVirus(
        com.rafsan.virus.VirusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVirusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VIRUS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VirusServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VirusServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VIRUS:
          serviceImpl.getVirus((com.rafsan.virus.VirusRequest) request,
              (io.grpc.stub.StreamObserver<com.rafsan.virus.VirusResponse>) responseObserver);
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

  private static abstract class VirusServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VirusServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.rafsan.virus.Virus.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VirusService");
    }
  }

  private static final class VirusServiceFileDescriptorSupplier
      extends VirusServiceBaseDescriptorSupplier {
    VirusServiceFileDescriptorSupplier() {}
  }

  private static final class VirusServiceMethodDescriptorSupplier
      extends VirusServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VirusServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VirusServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VirusServiceFileDescriptorSupplier())
              .addMethod(getGetVirusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
