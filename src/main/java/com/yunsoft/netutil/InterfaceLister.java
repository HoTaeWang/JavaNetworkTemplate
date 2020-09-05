package com.yunsoft.netutil;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class InterfaceLister {
    public static NetworkInterface ni;

    public static void displayInterfaces() throws SocketException{
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while(interfaces.hasMoreElements()){
            NetworkInterface ni = interfaces.nextElement();
            System.out.println(ni);
        }
    }

    public static NetworkInterface getInterfaceByName(String strName) {
        try{
            ni = NetworkInterface.getByName(strName);
            if(null == ni){
                System.err.println("No such interface: " + strName);
            }
        }catch (SocketException e){
            System.err.println("Could not list sockets.");
        }
        return ni;
    }
}
