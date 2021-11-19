package com.company.Design.singleton;

public class SingleEx {

    private SocketClient socketClient;

    public SingleEx(){
        // this.socketClient = new SocketClient(); private으로 막아놨기 때문에 new로 하면 안됨.
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }

}
