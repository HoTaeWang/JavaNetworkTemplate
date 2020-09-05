package com.yunsoft.netutil;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkUtil {
    private InetAddress address;

    public InetAddress getInetAddress(String strName){
        try{
            address = InetAddress.getByName(strName);
            System.out.println(address);
        }catch (UnknownHostException e){
            e.printStackTrace();
            System.out.println("Could not find "+ strName);
        }
        return address;
    }

}
