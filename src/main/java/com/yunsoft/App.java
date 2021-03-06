/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.yunsoft;

import com.yunsoft.netutil.*;

import java.net.NetworkInterface;
import java.net.SocketException;

public class App {

    public static void main(String[] args) throws SocketException {
        NetworkUtil netUtil = new NetworkUtil();
        System.out.println("www.google.co.uk = " + netUtil.getInetAddress("www.google.co.uk"));
        netUtil.DisplayNetAddress("www.google.co.uk");
        netUtil.getMyAddress();

        InterfaceLister interfaceLister = new InterfaceLister();
        interfaceLister.displayInterfaces();
        NetworkInterface ni = interfaceLister.getInterfaceByName("eth0");
        if(null == ni){
            System.err.println("No such interface: eth0");
        }

        GoogleImage googleImage = new GoogleImage();
        googleImage.createConnection();
    }
}
