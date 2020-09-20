package com.yunsoft.netutil;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GoogleImage {
    public void createConnection(){
        try{
            URL u = new URL("https://www.google.co.uk/imghp?hl=en&tab=wi&ogbl");
            URLConnection uc = u.openConnection();
            try(InputStream raw = uc.getInputStream()){
                InputStream buffer = new BufferedInputStream(raw);
                // Chain the InputStream to a reader
                Reader reader = new InputStreamReader(buffer);
                int c;
                while((c= reader.read()) != (-1) ){
                    System.out.print((char)c);
                }
            }
        }catch (MalformedURLException ex){
            System.err.println(ex);
        }catch(IOException ex){
            System.err.println(ex);
        }
    }
}
