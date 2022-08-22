package com.rafsan.disease;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.0)",
    comments = "Source: disease.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DiseaseServiceGrpc {

  private DiseaseServiceGrpc() {}

  public static final String SERVICE_NAME = "com.rafsan.disease.DiseaseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.rafsan.disease.DiseaseRequest,
      com.rafsan.disease.DiseaseResponse> getGetDiseasesForVirusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDiseasesForVirus",
      requestType = com.rafsan.disease.DiseaseRequest.class,
      responseType = com.rafsan.disease.DiseaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rafsan.disease.DiseaseRequest,
      com.rafsan.disease.DiseaseResponse> getGetDiseasesForVirusMethod() {
    io.grpc.MethodDescriptor<com.rafsan.disease.DiseaseRequest, com.rafsan.disease.DiseaseResponse> getGetDiseasesForVirusMethod;
    if ((getGetDiseasesForVirusMethod = DiseaseServiceGrpc.getGetDiseasesForVirusMethod) == null) {
      synchronized (DiseaseServiceGrpc.class) {
        if ((getGetDiseasesForVirusMethod = DiseaseServiceGrpc.getGetDiseasesForVirusMethod) == null) {
          DiseaseServiceGrpc.getGetDiseasesForVirusMethod = getGetDiseasesForVirusMethod =
              io.grpc.MethodDescriptor.<com.rafsan.disease.DiseaseRequest, com.rafsan.disease.DiseaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDiseasesForVirus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rafsan.disease.DiseaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rafsan.disease.DiseaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiseaseServiceMethodDescriptorSupplier("getDiseasesForVirus"))
              .build();
        }
      }
    }
    return getGetDiseasesForVirusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DiseaseServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiseaseServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiseaseServiceStub>() {
        @java.lang.Override
        public DiseaseServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiseaseServiceStub(channel, callOptions);
        }
      };
    return DiseaseServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DiseaseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiseaseServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiseaseServiceBlockingStub>() {
        @java.lang.Override
        public DiseaseServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiseaseServiceBlockingStub(channel, callOptions);
        }
      };
    return DiseaseServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DiseaseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiseaseServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiseaseServiceFutureStub>() {
        @java.lang.Override
        public DiseaseServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiseaseServiceFutureStub(channel, callOptions);
        }
      };
    return DiseaseServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DiseaseServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getDiseasesForVirus(com.rafsan.disease.DiseaseRequest request,
        io.grpc.stub.StreamObserver<com.rafsan.disease.DiseaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDiseasesForVirusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDiseasesForVirusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.rafsan.disease.DiseaseRequest,
                com.rafsan.disease.DiseaseResponse>(
                  this, METHODID_GET_DISEASES_FOR_VIRUS)))
          .build();
    }
  }

  /**
   */
  public static final class DiseaseServiceStub extends io.grpc.stub.AbstractAsyncStub<DiseaseServiceStub> {
    private DiseaseServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiseaseServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiseaseServiceStub(channel, callOptions);
    }

    /**
     */
    public void getDiseasesForVirus(com.rafsan.disease.DiseaseRequest request,
        io.grpc.stub.StreamObserver<com.rafsan.disease.DiseaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDiseasesForVirusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DiseaseServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DiseaseServiceBlockingStub> {
    private DiseaseServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiseaseServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiseaseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.rafsan.disease.DiseaseResponse getDiseasesForVirus(com.rafsan.disease.DiseaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDiseasesForVirusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DiseaseServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DiseaseServiceFutureStub> {
    private DiseaseServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiseaseServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiseaseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rafsan.disease.DiseaseResponse> getDiseasesForVirus(
        com.rafsan.disease.DiseaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDiseasesForVirusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DISEASES_FOR_VIRUS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DiseaseServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DiseaseServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DISEASES_FOR_VIRUS:
          serviceImpl.getDiseasesForVirus((com.rafsan.disease.DiseaseRequest) request,
              (io.grpc.stub.StreamObserver<com.rafsan.disease.DiseaseResponse>) responseObserver);
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

  private static abstract class DiseaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DiseaseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.rafsan.disease.DiseaseOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DiseaseService");
    }
  }

  private static final class DiseaseServiceFileDescriptorSupplier
      extends DiseaseServiceBaseDescriptorSupplier {
    DiseaseServiceFileDescriptorSupplier() {}
  }

  private static final class DiseaseServiceMethodDescriptorSupplier
      extends DiseaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DiseaseServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DiseaseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DiseaseServiceFileDescriptorSupplier())
              .addMethod(getGetDiseasesForVirusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
