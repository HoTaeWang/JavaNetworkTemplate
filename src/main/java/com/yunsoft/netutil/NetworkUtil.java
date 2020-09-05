package com.yunsoft.netutil;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkUtil {
    private InetAddress mAddress;

    public InetAddress getInetAddress(String strName){
        try{
            mAddress = InetAddress.getByName(strName);
            System.out.println(mAddress);
        }catch (UnknownHostException e){
            e.printStackTrace();
            System.out.println("Could not find "+ strName);
        }
        return mAddress;
    }

    public void getMyAddress(){
        try{
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
            System.out.println(address.getHostAddress());
            AddressTest.getVersion(address);
            AddressTest.displayAddressType(address);
        }catch (UnknownHostException e){
            e.printStackTrace();
            System.out.println("Could not find this computer's address.");
        }
    }

    public void DisplayNetAddress(String strName){
        try{
            InetAddress[] addresses = InetAddress.getAllByName(strName);
            System.out.println("Total : " + addresses.length);
            for(InetAddress address : addresses){
                System.out.println("===========================================");
                System.out.println(address);
                System.out.println("Canonical Hostname : " + address.getCanonicalHostName());
                System.out.println(address.getHostAddress());
                AddressTest.getVersion(address);
                AddressTest.displayAddressType(address);
                System.out.println("===========================================");
            }

        }catch (UnknownHostException e){
            e.printStackTrace();
            System.out.println("Could not find " + strName);
        }
    }

}
