package com.frozen.frpc.client;

/**
 * @author frozen
 * @since 18-12-5
 **/
public class ClientFatory {

    public Client createClient(ClientConfig clientConfig) {
        ClientType clientType = clientConfig.getClientType();
        if (clientType == null) {
            return new NettyClient();
        }
        switch (clientType) {
            case NETTY:
                return new NettyClient();
            default:
                return new NettyClient();
        }
    }

}
