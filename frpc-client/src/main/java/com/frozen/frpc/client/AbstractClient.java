package com.frozen.frpc.client;

import com.google.protobuf.BlockingRpcChannel;
import com.google.protobuf.RpcChannel;

/**
 * @author frozen
 * @since 18-12-5
 **/
public abstract class AbstractClient implements Client {
    public RpcChannel createRpcChannel() {
        return null;
    }

    public RpcChannel createRpcChannel(int timeout) {
        return null;
    }

    public BlockingRpcChannel createBlockingRpcChannel() {
        return null;
    }

    public BlockingRpcChannel createBlockingRpcChannel(int timeout) {
        return null;
    }
}
