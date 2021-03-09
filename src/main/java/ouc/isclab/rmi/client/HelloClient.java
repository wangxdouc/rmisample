package ouc.isclab.rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import ouc.isclab.rmi.Hello;
import ouc.isclab.rmi.UserInfo;

/**
 * RMI客户端
 */
public class HelloClient {

    public static void main(String[] args) {
        try {
            String remoteAddr = "rmi://localhost:1100/Hello";
            Hello hello = (Hello) Naming.lookup(remoteAddr);
            String response = hello.helloWorld("Java RMI");
            System.out.println("== " + response + " ==");

            String response1 = hello.sendUserInfo(new UserInfo(1, "Kevin Wang"));
            System.out.println("== " + response1 + " ==");

        } catch (NotBoundException | RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
