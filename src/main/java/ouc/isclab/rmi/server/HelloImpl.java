package ouc.isclab.rmi.server;

import ouc.isclab.rmi.Hello;
import ouc.isclab.rmi.UserInfo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 远程接口Hello的实现类
 */
public class HelloImpl extends UnicastRemoteObject implements Hello {

    private int index = 0;

    protected HelloImpl() throws RemoteException {
        super();
    }

    @Override
    public String helloWorld(String name) throws RemoteException {
        System.out.println("[Client] " + name);

        return "[Server] Hello! " + name + " " + (index++) + " times";
    }

    @Override
    public String sendUserInfo(UserInfo userInfo) throws RemoteException {
        System.out.println("[Client] " + userInfo.getInfo());
        return "[Server] User Info sent successfully";
    }
}