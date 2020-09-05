package com.yunsoft.netutil;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressTest {
    public static int getVersion(InetAddress ia){
        byte[] address = ia.getAddress();
        if(4 == address.length) return 4;
        else if(16 == address.length) return 6;
        else return (-1);
    }

    public static void displayAddressType(InetAddress ia){
        if (ia.isAnyLocalAddress()) {
            System.out.println(ia + " is a wildcard address.");
        }
        if (ia.isLoopbackAddress()) {
            System.out.println(ia + " is loopback address.");
        }
        if (ia.isLinkLocalAddress()) {
            System.out.println(ia + " is a link-local address.");
        } else if (ia.isSiteLocalAddress()) {
            System.out.println(ia + " is a site-local address.");
        } else {
            System.out.println(ia + " is a global address.");
        }

        if (ia.isMulticastAddress()) {
            if (ia.isMCGlobal()) {
                System.out.println(ia + " is a global multicast address.");
            } else if (ia.isMCOrgLocal()) {
                System.out.println(ia + " is an organization wide multicast address.");
            } else if (ia.isMCSiteLocal()) {
                System.out.println(ia + " is a site wide multicast address.");
            } else if (ia.isMCLinkLocal()) {
                System.out.println(ia + " is a subnet wide multicast address.");
            } else if (ia.isMCNodeLocal()) {
                System.out.println(ia + " is an interface-local multicast address.");
            } else {
                System.out.println(ia + " is an unknown multicast address type.");
            }
        } else {
            System.out.println(ia + " is a unicast address.");
        }
    }
}
