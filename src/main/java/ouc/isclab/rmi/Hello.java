package ouc.isclab.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * RMI远程接口
 * <p>
 * 必须继承Remote接口
 * 因为要网络传输，所有参数和返回类型必须序列化
 * 只有远程接口中指定的方法可以被调用
 */

public interface Hello extends Remote {
    String helloWorld(String name) throws RemoteException;

    String sendUserInfo(UserInfo userInfo) throws RemoteException;
}