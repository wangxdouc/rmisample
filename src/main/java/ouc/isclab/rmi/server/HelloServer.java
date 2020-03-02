package ouc.isclab.rmi.server;

import ouc.isclab.rmi.Hello;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * RMI服务端
 */
public class HelloServer {
    public static void main(String[] args) {

        try {
            // 本地主机上的远程对象注册表Registry的实例
            Registry registry = LocateRegistry.createRegistry(1100);

            // 创建一个远程对象
            Hello hello = new HelloImpl();

            // 把远程对象注册到RMI注册服务器上，并命名为Hello；绑定的URL标准格式为：rmi://host:port/name
            //Naming.bind("rmi://localhost:1100/Hello", hello);
            registry.bind("Hello", hello);

            System.out.println("RMI server running...");

            // MalformedURLException
        } catch (RemoteException | AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}