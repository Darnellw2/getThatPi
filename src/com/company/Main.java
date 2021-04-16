package com.company;

import java.net.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        while (true) {

            URL oracle = new URL("http://192.168.2.171:8080/");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(oracle.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}