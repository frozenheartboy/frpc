package com.frozen.frpc.common;

/**
 * @author frozen
 * @since 18-12-6
 **/
public class FrpcException extends RuntimeException {

    public FrpcException(String message) {
        super(message);
    }

    public FrpcException(String message, Throwable cause) {
        super(message, cause);
    }

    public FrpcException(Throwable cause) {
        super(cause);
    }

}
