package ouc.isclab.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * RMI远程接口
 */
public interface Hello extends Remote {
    String helloWorld(String name) throws RemoteException;
    String sendUserInfo(UserInfo userInfo) throws RemoteException;
}
